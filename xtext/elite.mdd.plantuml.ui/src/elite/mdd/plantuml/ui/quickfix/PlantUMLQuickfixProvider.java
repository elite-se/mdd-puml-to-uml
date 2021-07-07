/*
 * generated by Xtext 2.25.0
 */
package elite.mdd.plantuml.ui.quickfix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;

import elite.mdd.plantuml.plantUML.Diagram;
import elite.mdd.plantuml.plantUML.NamedParticipant;
import elite.mdd.plantuml.plantUML.Participant;
import elite.mdd.plantuml.plantUML.ParticipantDefinition;
import elite.mdd.plantuml.plantUML.ParticipantShape;
import elite.mdd.plantuml.plantUML.PlantUMLFactory;
import elite.mdd.plantuml.plantUML.PlantUMLPackage;
import elite.mdd.plantuml.plantUML.RequestMessageDefinition;
import elite.mdd.plantuml.plantUML.UnnamedParticipant;
import elite.mdd.plantuml.validation.PlantUMLValidator;


/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
public class PlantUMLQuickfixProvider extends DefaultQuickfixProvider {
	
	@Inject
	private PlantUMLFactory factory;


	@Fix(PlantUMLValidator.PARTICIPANT_NAME_MISSING)
	public void addNameToParticipant(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add name to Participant", "Add name to participant: "+issue.getData()[0], "Entity.gif",
				new ISemanticModification() {
					
					@Override
					public void apply(EObject element, IModificationContext context) throws Exception {
						Participant participant = (Participant) element;
						if(participant instanceof UnnamedParticipant) {
							NamedParticipant namedParticipant = factory.createNamedParticipant();
							namedParticipant.setName(participant.getName().toLowerCase());
							namedParticipant.setLabel(participant.getName());
							namedParticipant.setType(participant.getType());
							EcoreUtil.replace(element, namedParticipant);							
						}else {
							participant.setName(participant.getType().toLowerCase());
						}
					}
				});
	}
	
	@Fix(Diagnostic.LINKING_DIAGNOSTIC)
	public void createParticipantDefinition(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Create new Participant", "Create new Participant: ", "Entity.gif", 
				new ISemanticModification() {
					
					@Override
					public void apply(EObject element, IModificationContext context) throws Exception {
						IXtextDocument xtextDocument = context.getXtextDocument();
						String sender = xtextDocument.get(issue.getOffset(), issue.getLength());
						sender = sender.replace("\"", "");
						NamedParticipant newParticipant = factory.createNamedParticipant();
						newParticipant.setType("TODOAutogeneratedType");
						newParticipant.setName(sender);
						newParticipant.setLabel(sender);
						ParticipantDefinition newParticipantDefinition = factory.createParticipantDefinition();
						newParticipantDefinition.setParticipant(newParticipant);
						newParticipantDefinition.setShape(ParticipantShape.PARTICIPANT);
						EObject root = EcoreUtil.getRootContainer(element);
						Diagram diagram = (Diagram) root; 
						int pos = (int) diagram.getElements().stream().filter(e -> e instanceof ParticipantDefinition).count();
						diagram.getElements().add(pos, newParticipantDefinition);
						EcoreUtil.replace(root, diagram);
					}
				});
	}

}
