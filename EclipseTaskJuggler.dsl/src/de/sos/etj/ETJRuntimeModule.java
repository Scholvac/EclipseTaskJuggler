/*
 * generated by Xtext
 */
package de.sos.etj;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import de.sos.etj.scoping.ProjectImportUriGlobalScopeProvider;
import de.sos.etj.scoping.ProjectImportedNamespaceAwareLocalScopeProvider;
import de.sos.etj.scoping.ProjectQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ETJRuntimeModule extends de.sos.etj.AbstractETJRuntimeModule {

	
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return ProjectQualifiedNameProvider.class;
	}
	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return ProjectQualifiedNameConverter.class;
	}

	@Override
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(ProjectImportedNamespaceAwareLocalScopeProvider.class);
	}
	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	@Override
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return ProjectImportUriGlobalScopeProvider.class;
	}
}