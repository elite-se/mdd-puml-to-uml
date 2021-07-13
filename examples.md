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
![PlantUML Diagram](http://www.plantuml.com/plantuml/png/XT31IiGm40RWUvvYo2KATicwkxAMLbhmuisBU9wq8HPgKfA9uDkRj1LQF7ZCvFj_Xca2eQVuEJBio7dWoYaeuIrepm43f2URaXYwOK9BmAthjKpYNQjalbOsJ_Sm4wGFxTlN5yvoRV6qk1ACflNpPdGTqk1iBTfeWehUY5isi-ptBR1DFYDXIbjJdw-7quCyNovtC2BLHtbubCVxw-ctfwgAuh-cD10XMlijygfBvC-o6zHeswUh_G00)

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
![PlantUML Diagram](http://www.plantuml.com/plantuml/png/POwn2eCm48Ptd-9miHqoj3Y8YBYtBv7gKOBn5BrOVFlUYHd4wUV_y-LBceNjp67moIJfMZTPOaXxt1vGmWkt5Em2Mi-07zjUWBV4JcXFzbkchlTMGY3DsptHa1qEwnTPn76lAcFE9oLa7_mLbBVkwNDQmrPaXoEgL-jTPndLSuNZYwQ-y6hdEM3qHM2SaEH73L8N1ly7)
