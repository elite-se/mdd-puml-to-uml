/*
 * generated by Xtext 2.25.0
 */
package elite.mdd.plantuml.validation;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import elite.mdd.plantuml.plantUML.AnonymousParticipant;
import elite.mdd.plantuml.plantUML.NamedParticipant;
import elite.mdd.plantuml.plantUML.Participant;
import elite.mdd.plantuml.plantUML.PlantUMLPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class PlantUMLValidator extends AbstractPlantUMLValidator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					PlantUMLPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	public static final String ISSUE_CODE_PREFIX = "elite.mdd.plantumlm.";
	public static final String PARTICIPANT_NAME_MISSING = ISSUE_CODE_PREFIX +  "ParticipantNameMissing";
	
	@Inject
	private IQualifiedNameProvider nameProvider;
	
	@Check
	public void checkParticipantNameMissing(Participant participant) {
		if(participant instanceof NamedParticipant ||
				(participant instanceof AnonymousParticipant && participant.getName() != null)) {
			return;
		}
		String participantName = nameProvider.getFullyQualifiedName(participant).toString();
		warning("Participant " + participantName+ " should hava an explicit name", 
				PlantUMLPackage.eINSTANCE.getParticipant_Name(),
				PARTICIPANT_NAME_MISSING, participantName);
	}
	
	
}
