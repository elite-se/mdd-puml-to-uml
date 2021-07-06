/*
 * generated by Xtext 2.25.0
 */
package elite.mdd.plantuml.ui.labeling;

import com.google.inject.Inject;

import elite.mdd.plantuml.plantUML.ParticipantDefinition;
import elite.mdd.plantuml.plantUML.ReplyMessageDefinition;
import elite.mdd.plantuml.plantUML.RequestArrow;
import elite.mdd.plantuml.plantUML.RequestMessageDefinition;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
public class PlantUMLLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public PlantUMLLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	@Inject
	public IQualifiedNameProvider nameProvider;
	
	
	String text(ParticipantDefinition participantDefinition) {
		return nameProvider.getFullyQualifiedName(participantDefinition.getParticipant()) + " : " + participantDefinition.getShape().toString();
	}
	
	String text(RequestMessageDefinition requestMessage) {
		return ((requestMessage.getArrow().equals(RequestArrow.RIGHT_SYNC) || 
				requestMessage.getArrow().equals(RequestArrow.LEFT_SYNC)) ? "sync req: " : "async req: ") + 
				requestMessage.getSender().getName() + " -> " + requestMessage.getReceiver().getName() + 
				" : " + requestMessage.getMessage().getName();
	}
	String text(ReplyMessageDefinition replyMessage) {
		return "reply: " + replyMessage.getSender().getName() + " -> " + replyMessage.getReceiver().getName() + 
				" : " + replyMessage.getMessage().getName();
	}
}
