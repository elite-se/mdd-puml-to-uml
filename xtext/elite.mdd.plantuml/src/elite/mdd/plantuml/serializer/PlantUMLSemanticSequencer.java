/*
 * generated by Xtext 2.25.0
 */
package elite.mdd.plantuml.serializer;

import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

import com.google.inject.Inject;

import elite.mdd.plantuml.plantUML.Participant;
import elite.mdd.plantuml.plantUML.PlantUMLPackage;
import elite.mdd.plantuml.services.PlantUMLGrammarAccess;

public class PlantUMLSemanticSequencer extends AbstractPlantUMLSemanticSequencer {
	
	@Inject
	private PlantUMLGrammarAccess grammarAccess;
	
	@Override
	protected void sequence_Participant(ISerializationContext context, Participant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PlantUMLPackage.Literals.PARTICIPANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlantUMLPackage.Literals.PARTICIPANT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
}
