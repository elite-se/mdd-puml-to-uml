# Examples
The following examples shall be transformed to UML.

## Example 1
#### Plantuml:
```
@startuml
title Weather API

actor "bob : User" as bob
participant "node0 : Webserver" as node0
participant ": WeatherAPI"
actor "alice : User" as alice

bob -> node0: getWeather(location='Augsburg')
node0 -> ": WeatherAPI" : getWeatherData(long=48.360455, lat=10.901283)
node0 <<-- ": WeatherAPI" : getWeatherData(validFor: 2000) : 'sunny'
bob <<-- node0: getWeather : 'sunny'

alice -> node0: getWeather(location='München')
alice <<-- node0: getWeather : 'sunny'
@enduml
```
![PlantUML Diagram](http://www.plantuml.com/plantuml/png/XP7FIWCn4CRlUOfXBt71BUcVIWrTQK443u8NyJoR3Tj0J4eoM_3TlFbYfcaNLZtiCSFl-yqtP1S90_KVbf4Xg-5T8nrqWFthCsEeo0Se6j-0XBUeGm4O8JtPCOMCCaTq18NphHOWKxP9pEcAvUblK0xwP2y6ErgZzDYV1uoTjrOF5us4JjCrUsEzGZBUrNpVTx7fGyTBbh74_ra2u-GZ4gQqw-hLPhQy4wlr-XOiKZqNitinNsoMWsUxhQf9qoaLRPzyaB0GGfG9uB5txfFdwbdnh_m8OldEgHDVlh-SEcZ7omi_xTrfrvx_ymS0)

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
