package elite.mdd.plantuml.tests

import com.google.inject.Inject
import elite.mdd.plantuml.plantUML.Diagram
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import com.google.inject.Guice
import elite.mdd.plantuml.PlantUMLRuntimeModule
import org.eclipse.xtext.serializer.ISerializer
import org.junit.Assert

@ExtendWith(InjectionExtension)
@InjectWith(PlantUMLInjectorProvider)
class PlantUMLSerializingTest {
	
	@Inject
	ParseHelper<Diagram> parseHelper
	
	
	@Test
	def void oneParticipant() {
		val result = parseHelper.parse('''
			@startuml
			participant "p1"
			actor "p2"
			"p1" -> "p2" : m()
			@enduml
		''')
		
		val injector = Guice.createInjector(new PlantUMLRuntimeModule)
		val serializer = injector.getInstance(ISerializer)
		val resultSerializer = serializer.serialize(result)
		System.out.println(resultSerializer);
		
		
	}
	
}