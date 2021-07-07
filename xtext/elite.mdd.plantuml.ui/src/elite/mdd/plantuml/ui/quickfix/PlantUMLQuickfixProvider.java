/*
 * generated by Xtext 2.25.0
 */
package elite.mdd.plantuml.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;

import elite.mdd.plantuml.plantUML.NamedParticipant;
import elite.mdd.plantuml.plantUML.Participant;
import elite.mdd.plantuml.plantUML.PlantUMLFactory;
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

 //@Fix(PlantUMLValidator.INVALID_NAME)
//	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
//			public void apply(IModificationContext context) throws BadLocationException {
//				IXtextDocument xtextDocument = context.getXtextDocument();
//				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
//				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
//			}
//		});
//	}
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

}
