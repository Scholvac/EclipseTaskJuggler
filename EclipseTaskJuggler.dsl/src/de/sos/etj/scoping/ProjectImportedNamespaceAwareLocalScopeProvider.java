package de.sos.etj.scoping;

import static java.util.Collections.singletonList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

import de.sos.etj.eTJ.ETJPackage;

/**
 * The point of this provider is to build scopes that are aware of the relative
 * identifier used on task dependency and to resolve them.
 * 
 * TODO: Evaluate and make this work with xtext imports.
 * 
 * @author john
 *
 */
public class ProjectImportedNamespaceAwareLocalScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider implements IProjectScopeProvider {
	
	@Inject
	private IGlobalScopeProvider globalScopeProvider;

	
	@Override
	public IScope getScope(EObject context, EReference reference, EObject originalContext) {
		if (context == null)
			throw new NullPointerException("context");
		IScope result = null;
		
		
//		if (reference.getEType() == ETJPackage.eINSTANCE.getTask()){
//			result = getResourceScope(context.eResource(), reference, originalContext);
//			result = getLocalElementsScope(result, context, reference, originalContext);
////			return result;
//		}
		
		if (context.eContainer() != null ) {
			result = getScope(context.eContainer(), reference, originalContext);
		} else {
			result = getResourceScope(context.eResource(), reference, originalContext);
		}
		result = getLocalElementsScope(result, context, reference, originalContext);
		return result;
	}

	@Override
	public IScope getScope(EObject context, EReference reference) {
		IScope s = getScope(context, reference, context);
		return s;
	}
	
	protected IScope getResourceScope(Resource res, EReference reference, EObject originalContext) {
		EObject context = res.getContents().get(0);
		IScope globalScope = getGlobalScope(res, reference, originalContext);
		List<ImportNormalizer> normalizers = getImplicitImports(isIgnoreCase(reference));
		if (!normalizers.isEmpty()) {
			globalScope = createImportScope(globalScope, normalizers, null, reference.getEReferenceType(), isIgnoreCase(reference));
		}
		return getResourceScope(globalScope, context, reference);
	}
	@Override
	protected IScope getResourceScope(final IScope parent, final EObject context, final EReference reference) {
		// TODO: SZ - context may not be a proxy, may it?
		if (context.eResource() == null)
			return parent;
		ISelectable allDescriptions = getAllDescriptions(context.eResource());
		return ProjectSelectableBasedScope.createScope(parent, allDescriptions, reference.getEReferenceType(), isIgnoreCase(reference));
	}

	protected IScope getGlobalScope(final Resource context, final EReference reference, EObject originalContext) {
		return getGlobalScope(context, reference, null, originalContext);
	}
	
	protected IScope getGlobalScope(final Resource context, final EReference reference, final Predicate<IEObjectDescription> filter, EObject originalContext) {
		return wrap(((IProjectGlobalScopeProvider)globalScopeProvider).getScope(context, reference, filter, originalContext));
	}

	protected IScope getLocalElementsScope(IScope parent, final EObject context, final EReference reference, final EObject originalContext) {
		IScope result = parent;
		ISelectable allDescriptions = getAllDescriptions(context.eResource());
		QualifiedName name = getQualifiedNameOfLocalElement(context);
		boolean ignoreCase = isIgnoreCase(reference);
		final List<ImportNormalizer> namespaceResolvers = getImportedNamespaceResolvers(context, ignoreCase);
		if (!namespaceResolvers.isEmpty()) {
			if (isRelativeImport() && name!=null) {
				ImportNormalizer localNormalizer = new ImportNormalizer(name, true, ignoreCase); 
				result = createImportScope(result, singletonList(localNormalizer), allDescriptions, reference.getEReferenceType(), isIgnoreCase(reference));
			}
			result = createImportScope(result, namespaceResolvers, null, reference.getEReferenceType(), isIgnoreCase(reference));
		}
		if (name!=null) {
			ImportNormalizer localNormalizer = new ImportNormalizer(name, true, ignoreCase);
			ArrayList<ImportNormalizer> l = new ArrayList<ImportNormalizer>();
			if (isRelativeImport(context, reference))
				l.add(localNormalizer);
			result = createImportScope(result, l, allDescriptions, reference.getEReferenceType(), isIgnoreCase(reference));
		}
		return result;
	}

	private boolean isRelativeImport(EObject context, EReference reference) {
		if (reference.getEType() == ETJPackage.eINSTANCE.getTask())
			return true;
		return true;
	}

	@Override
	protected ImportScope createImportScope(IScope parent,
			List<ImportNormalizer> namespaceResolvers, ISelectable importFrom,
			EClass type, boolean ignoreCase) {
		
		return new ProjectImportScope(namespaceResolvers, parent, importFrom, type, ignoreCase);
	}

}
