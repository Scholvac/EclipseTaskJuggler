package de.sos.etj.scoping;

import java.awt.List;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import com.google.common.base.Function;

import de.sos.etj.eTJ.Account;
import de.sos.etj.eTJ.Extend;
import de.sos.etj.eTJ.Resource;
import de.sos.etj.eTJ.Scenario;
import de.sos.etj.eTJ.Task;

public class ProjectQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	private Function<EObject, String> resolver = SimpleAttributeResolver.newResolver(String.class, "id");

	@Override
	protected Function<EObject, String> getResolver() {
		return resolver;
	}
	
	// for Task, use default
	

	protected QualifiedName qualifiedName(Resource resource) {
		return resource.getId() == null ? null : QualifiedName.create(resource.getId());
	}
	protected QualifiedName qualifiedName(Account account) {
		return account.getId() == null ? null : QualifiedName.create(account.getId());
	}
	protected QualifiedName qualifiedName(Extend extend) {
		return QualifiedName.create(extend.getName());
	}
	
	protected QualifiedName qualifiedName(Scenario extend) {
		return QualifiedName.create(extend.getId());
	}

//	protected QualifiedName qualifiedName(Task task) {
//		EObject p = task.eContainer();
//		if (p != null){
//			QualifiedName qnp = this.getFullyQualifiedName(p);
//			if (qnp != null){
//				qnp = qnp.append(task.getId());
//				return qnp;
//			}
//		}
//		return QualifiedName.create(task.getId());
//	}
}
