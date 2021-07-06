package elite.mdd.plantuml.serializer;

import java.util.HashMap;
import java.util.Map;

public class SpecialCharacters {
	
	public Map<String, String> mapping = new HashMap<String, String>();
	
	public SpecialCharacters() {
		mapping.put("\"", "DOUBLE__QUOTE__38__");
		mapping.put(" as ", "AS__SPECIAL__VALUE");
		mapping.put("(", "PARENTHESIS__OPENING");
		mapping.put(")", "PARENTHESIS__CLOSING");
		
	}

}
