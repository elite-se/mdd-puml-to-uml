# Examples
The following examples shall be transformed to UML.

## Example 1
#### Plantuml:
```
@startuml
actor "bob : User" as bob
participant "node0 : Webserver" as node0
participant ": WeatherAPI"
bob -> node0: getWeather(location='Augsburg')
node0 -> ": WeatherAPI" : getWeatherData(long=48.360455, lat=10.901283)
node0 <<-- ": WeatherAPI" : getWeatherData : 'sunny'
bob <<-- node0: getWeather : 'sunny'
@enduml
```


## Example 2
#### Plantuml:
```
@startuml
participant "key1 : Key"
participant "lock : Lock" as lock
key1 ->> lock: unlock()
lock -> key1 : getKey()
lock <<-- key1 : getKey: 'bew8n4ci2l4nvuy8'
lock -> lock: validateKey('bew8n4ci2l4nvuy8')
lock -->> lock: validateKey: true
lock ->> lock: open()
@enduml
```

