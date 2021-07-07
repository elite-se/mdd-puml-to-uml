package elite.mdd.plantuml;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import elite.mdd.plantuml.plantUML.Participant;

/**
 * Custom QualifiedNameProvider for the Names in PlantUML.
 * 
 * @author joseph
 *
 */
public class PlantUMLQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		/**
		 * Handle the names of Participants:
		 * - In the case, that the user specifies a name, the parsed name is returned as is.
		 * - In the case of a anonymous Participant declaration, the name is replaced by
		 * 		: type so that it can be referenced later.
		 */
		if(obj instanceof Participant) {
			if(((Participant) obj).getName() == null) {
				return QualifiedName.create(":"+ ((Participant) obj).getType());
			}
		}
		return super.getFullyQualifiedName(obj);
	}


}
