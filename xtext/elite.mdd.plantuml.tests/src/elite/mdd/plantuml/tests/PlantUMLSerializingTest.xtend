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
import elite.mdd.plantuml.serializer.SerializerWrapper

@ExtendWith(InjectionExtension)
@InjectWith(PlantUMLInjectorProvider)
class PlantUMLSerializingTest {
	
	@Inject
	ParseHelper<Diagram> parseHelper
	
	
	@Test
	def void participants() {
		val result = parseHelper.parse('''
			@startuml
			participant : Key2
			participant ": Key3"
			participant "key1 : Key"
			participant key2 : Key
			participant lock : Lock ref AA
			participant "lock2 : Lock ref AA strict"
			@enduml
		''');
		
		val serializeWrapper = new SerializerWrapper();
		val resultSerializer = serializeWrapper.serialize(result);
		
		Assert.assertEquals(resultSerializer, '''@startuml
participant ": Key2"
participant ": Key3"
participant "key1 : Key" as key1
participant "key2 : Key" as key2
participant "lock : Lock ref AA" as lock
participant "lock2 : Lock ref AA" as lock2 
@enduml
'''.toString())
		
	}
	
	
	@Test
	def void messages() {
		// The space between " and : in the last two messages is important because else it cannot be parsed correctly, as the message is considered null
		val result = parseHelper.parse('''
			@startuml
			participant "key1 : Key"
			participant "lockName : LockType" as lock
			key1 ->> lock : unlock()
			"key1" ->> lock : unlock(s=0)
			key1 ->> "lock" : unlock(s=0, i=1)
			"key1" ->> "lock" : unlock(s=0, i=1, j=2)
			key1 <<-- lock : unlock()
			"key1" <<-- lock : unlock(s=0)
			key1 <<-- "lock" : unlock(s=0, i=1)
			"key1" <<-- "lock" : unlock(s=0, i=1, j=2)
			@enduml
		''');
		
		val serializeWrapper = new SerializerWrapper();
		val resultSerializer = serializeWrapper.serialize(result);
		
		System.out.println(resultSerializer);
		
		Assert.assertEquals(resultSerializer, '''@startuml
participant "key1 : Key" as key1
participant "lockName : LockType" as lock
key1 ->> lock : unlock()
"key1" ->> lock : unlock(s= 0)
key1 ->> "lock" : unlock(s= 0, i= 1)
"key1" ->> "lock" : unlock(s= 0, i= 1, j= 2)
key1 <<-- lock : unlock()
"key1" <<-- lock : unlock(s= 0)
key1 <<-- "lock" : unlock(s= 0, i= 1)
"key1" <<-- "lock" : unlock(s= 0, i= 1, j= 2)
@enduml
'''.toString())
		
	}
	
	
	
}