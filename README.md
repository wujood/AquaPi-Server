# AquaPi-Server

Part of the Aqua-Pi-Project. A Jax-RS server which is responsible for handling sensor-data and applying configurable buisnesslogic to send tasks to a AquaPi.

### Prerequisites

* JavaJRE / JavaSDK (1.8)
* Maven
* (Swagger-Codegen - Only if you want to edit the API-Calls)

### Installing

Clone this repository. Inside the root-folder call:

```
swagger-codegen generate -l jaxrs -i swagger.json -o Server
```
This should allready set everything up.

## Deployment
```
cd Server
mvn clean package jetty:run
```

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
