package de.sos.etj.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;

public class ProjectImportScope extends ImportScope {

	public ProjectImportScope(List<ImportNormalizer> namespaceResolvers,
			IScope parent, ISelectable importFrom, EClass type,
			boolean ignoreCase) {

		super(namespaceResolvers, parent, importFrom, type, ignoreCase);
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {

		IEObjectDescription result = null;

		ProjectQualifiedName searchname;
		if (name instanceof ProjectQualifiedName) {
			searchname = (ProjectQualifiedName) name;
		} else {
			searchname = new ProjectQualifiedName(name);
		}

		if (searchname.isRelative()) {
			if (searchname.isUp()) {
				searchname.advance();
				return getParent().getSingleElement(searchname);
			}
		}

		// not relative or still more '!' characters
		if (!searchname.isRelative() || searchname.isUp()) {
			// keep going towards outer scope
//			searchname.advance();
			result = getParent().getSingleElement(searchname);
		} else {
			// get names from this scope
			result = getSingleLocalElementByName(searchname);
		}
		return result;
	}
}
