# Examples
The following examples shall be transformed to UML.

## Example 1
#### Plantuml:
```
@startuml
Actor "Bob : User" as Bob
Participant "node0 : WWebserver" as node0
Participant ": WeatherAPI"
Bob -> node0: getWeather(location="Augsburg")
node0 -> ": WeatherAPI": getWeatherData(long=48.360455, lat=10.901283)
node0 <-- ": WeatherAPI": "sunny"
Bob <-- node0: "sunny"
@enduml
```
possibly without the Participant declaration of WeatherAPI:
```
@startuml
Actor "Bob : User" as Bob
Participant "node0 : WWebserver" as node0
Bob -> node0: getWeather(location="Augsburg")
node0 -> ": WeatherAPI": getWeatherData(long=48.360455, lat=10.901283)
node0 <-- ": WeatherAPI": "sunny"
Bob <-- node0: "sunny"
@enduml
```

#### Plantuml, normalized:
```
@startuml
Actor "Bob : User" as Bob
Participant "node0 : WWebserver" as node0
Participant ": WeatherAPI" as anonymusWeatherAPI1
Bob -> node0: getWeather(location="Augsburg")
node0 -> anonymusWeatherAPI1: getWeatherData(long=48.360455, lat=10.901283)
node0 <-- anonymusWeatherAPI1: "sunny"
Bob <-- node0: "sunny"
@enduml
```

## Example 2
#### Plantuml:
```
@startuml
Participant "key1 : Key"
Participant "lock : Lock" as lock
"key1 : Key" ->> lock: unlock()
lock -> "key1 : Key": getKey()
lock <-- "key1 : Key": "bew8n4ci2l4nvuy8"
lock -> lock: validateKey("bew8n4ci2l4nvuy8")
lock --> lock: true
lock ->> lock: open()
@enduml
```
#### Plantuml, normalized:
```
@startuml
Participant "key1 : Key" as key1
Participant "lock : Lock" as lock
key1 ->> lock: unlock()
lock -> key1 : getKey()
lock <-- key1 : "bew8n4ci2l4nvuy8"
lock -> lock: validateKey("bew8n4ci2l4nvuy8")
lock --> lock: true
lock ->> lock: open()
@enduml
```
