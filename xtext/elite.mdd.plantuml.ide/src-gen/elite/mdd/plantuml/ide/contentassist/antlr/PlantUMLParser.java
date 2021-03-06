/*
 * generated by Xtext 2.25.0
 */
package elite.mdd.plantuml.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import elite.mdd.plantuml.ide.contentassist.antlr.internal.InternalPlantUMLParser;
import elite.mdd.plantuml.services.PlantUMLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PlantUMLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PlantUMLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PlantUMLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSequenceElementAccess().getAlternatives(), "rule__SequenceElement__Alternatives");
			builder.put(grammarAccess.getMessageDefinitionAccess().getAlternatives(), "rule__MessageDefinition__Alternatives");
			builder.put(grammarAccess.getRequestMessageArgumentAccess().getAlternatives(), "rule__RequestMessageArgument__Alternatives");
			builder.put(grammarAccess.getParticipantShapeAccess().getAlternatives(), "rule__ParticipantShape__Alternatives");
			builder.put(grammarAccess.getRequestArrowAccess().getAlternatives(), "rule__RequestArrow__Alternatives");
			builder.put(grammarAccess.getReplyArrowAccess().getAlternatives(), "rule__ReplyArrow__Alternatives");
			builder.put(grammarAccess.getDiagramAccess().getGroup(), "rule__Diagram__Group__0");
			builder.put(grammarAccess.getParticipantDefinitionAccess().getGroup(), "rule__ParticipantDefinition__Group__0");
			builder.put(grammarAccess.getParticipantAccess().getGroup(), "rule__Participant__Group__0");
			builder.put(grammarAccess.getRequestMessageDefinitionAccess().getGroup(), "rule__RequestMessageDefinition__Group__0");
			builder.put(grammarAccess.getRequestMessageDefinitionAccess().getGroup_0(), "rule__RequestMessageDefinition__Group_0__0");
			builder.put(grammarAccess.getRequestMessageDefinitionAccess().getGroup_1(), "rule__RequestMessageDefinition__Group_1__0");
			builder.put(grammarAccess.getReplyMessageDefinitionAccess().getGroup(), "rule__ReplyMessageDefinition__Group__0");
			builder.put(grammarAccess.getReplyMessageDefinitionAccess().getGroup_0(), "rule__ReplyMessageDefinition__Group_0__0");
			builder.put(grammarAccess.getReplyMessageDefinitionAccess().getGroup_1(), "rule__ReplyMessageDefinition__Group_1__0");
			builder.put(grammarAccess.getRequestMessageAccess().getGroup(), "rule__RequestMessage__Group__0");
			builder.put(grammarAccess.getRequestMessageAccess().getGroup_1(), "rule__RequestMessage__Group_1__0");
			builder.put(grammarAccess.getRequestMessageAccess().getGroup_1_1(), "rule__RequestMessage__Group_1_1__0");
			builder.put(grammarAccess.getRequestMessageAccess().getGroup_1_1_1(), "rule__RequestMessage__Group_1_1_1__0");
			builder.put(grammarAccess.getDiagramAccess().getElementsAssignment_1(), "rule__Diagram__ElementsAssignment_1");
			builder.put(grammarAccess.getParticipantDefinitionAccess().getShapeAssignment_0(), "rule__ParticipantDefinition__ShapeAssignment_0");
			builder.put(grammarAccess.getParticipantDefinitionAccess().getParticipantAssignment_1(), "rule__ParticipantDefinition__ParticipantAssignment_1");
			builder.put(grammarAccess.getParticipantAccess().getNameAssignment_1(), "rule__Participant__NameAssignment_1");
			builder.put(grammarAccess.getRequestMessageDefinitionAccess().getSenderAssignment_0_1(), "rule__RequestMessageDefinition__SenderAssignment_0_1");
			builder.put(grammarAccess.getRequestMessageDefinitionAccess().getArrowAssignment_0_3(), "rule__RequestMessageDefinition__ArrowAssignment_0_3");
			builder.put(grammarAccess.getRequestMessageDefinitionAccess().getReceiverAssignment_0_5(), "rule__RequestMessageDefinition__ReceiverAssignment_0_5");
			builder.put(grammarAccess.getRequestMessageDefinitionAccess().getMessageAssignment_1_1(), "rule__RequestMessageDefinition__MessageAssignment_1_1");
			builder.put(grammarAccess.getReplyMessageDefinitionAccess().getSenderAssignment_0_1(), "rule__ReplyMessageDefinition__SenderAssignment_0_1");
			builder.put(grammarAccess.getReplyMessageDefinitionAccess().getArrowAssignment_0_3(), "rule__ReplyMessageDefinition__ArrowAssignment_0_3");
			builder.put(grammarAccess.getReplyMessageDefinitionAccess().getReceiverAssignment_0_5(), "rule__ReplyMessageDefinition__ReceiverAssignment_0_5");
			builder.put(grammarAccess.getReplyMessageDefinitionAccess().getMessageAssignment_1_1(), "rule__ReplyMessageDefinition__MessageAssignment_1_1");
			builder.put(grammarAccess.getRequestMessageAccess().getNameAssignment_0(), "rule__RequestMessage__NameAssignment_0");
			builder.put(grammarAccess.getRequestMessageAccess().getArgumentsAssignment_1_1_0(), "rule__RequestMessage__ArgumentsAssignment_1_1_0");
			builder.put(grammarAccess.getRequestMessageAccess().getArgumentsAssignment_1_1_1_1(), "rule__RequestMessage__ArgumentsAssignment_1_1_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PlantUMLGrammarAccess grammarAccess;

	@Override
	protected InternalPlantUMLParser createParser() {
		InternalPlantUMLParser result = new InternalPlantUMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PlantUMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PlantUMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
