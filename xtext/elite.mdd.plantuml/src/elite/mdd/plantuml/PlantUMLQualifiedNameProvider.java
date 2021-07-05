package elite.mdd.plantuml;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import elite.mdd.plantuml.plantUML.Participant;

public class PlantUMLQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if(obj instanceof Participant) {
			if(((Participant) obj).getName() == null) {
				return QualifiedName.create(":"+ ((Participant) obj).getType());
			}
			return QualifiedName.create(((Participant) obj).getName());
		}
		return super.getFullyQualifiedName(obj);
	}


}
