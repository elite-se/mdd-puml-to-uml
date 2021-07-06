package elite.mdd.plantuml.serializer;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.ISerializer;

import com.google.inject.Guice;

import elite.mdd.plantuml.PlantUMLRuntimeModule;  

public class SerializerWrapper {
	
	private static ISerializer serializer = null;
	
	private SpecialCharacters specialCharMapper = new SpecialCharacters();
	  
	 private ISerializer getSerializer() {  
	  if (serializer == null) { // lazy creation  
		  serializer = Guice.createInjector(new PlantUMLRuntimeModule()).getInstance(ISerializer.class);  
	  }  
	  return serializer;  
	 } 

	public SerializerWrapper() {
		this.getSerializer();
	}
	
	public String serialize(EObject semanticObject) {
		String result = serializer.serialize(semanticObject);
		
		// For special Characters
		for (Entry<String, String> e : specialCharMapper.mapping.entrySet()) {
			result = result.replace(e.getValue(), e.getKey());
		}
		
		// For quoted Participant where no name was provided
		String[] splittedString;
		String lineEnding;
		if (result.split("\r\n").length != 1) {
			splittedString = result.split("\r\n");
			lineEnding = "\r\n";
		} else {
			splittedString = result.split("\n");
			lineEnding = "\n";
		}
		result = "";
		for (String s : splittedString) {
			if (s.contains("as") && s.endsWith("\"")) {
				s = s.substring(0, s.length() - 1);
			} 
			result += s + lineEnding;
		}
		
		// For Anonymous unquoted participant
		result = result.replace(": \"", "\": ");
		
		return result;
	}
}
