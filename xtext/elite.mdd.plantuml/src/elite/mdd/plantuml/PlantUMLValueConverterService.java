package elite.mdd.plantuml;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

/**
 * Custom Value Converter for all PlantUML Rules.
 * Is binded by the PlantUMLRuntime and overrides the DefaultTerminalConverters
 * 
 * @author joseph
 *
 */
public class PlantUMLValueConverterService extends DefaultTerminalConverters {
	
	/**
	 * Value converter for the ParticipantMention rule.
	 * The ParticipantMention rule is used for parsing the sender and receiver
	 * of a message. The value conversion takes the String, which is an ID, an ID
	 * in Double-Quotes or a ':' followed by an ID in Double-Quotes and removes the
	 * Quotes in order to cross-reference a name of a Participant.
	 * @return
	 */
	@ValueConverter(rule = "ParticipantMention")
	public IValueConverter<String> ParticipantMention() {
		return new IValueConverter<String>() {

			@Override
			public String toValue(String string, INode node) throws ValueConverterException {
				return string.replaceAll("\"", "").replaceAll(" ", "");
			}

			@Override
			public String toString(String value) throws ValueConverterException {
				return value;
			}
			
		};
	}
}
