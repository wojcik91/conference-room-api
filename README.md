# conference-room-api

## Prerequisites

The project requires Java 8 and Gradle 4.4+ to be installed.

## Installation

To build the executable JAR file including all the main classes as well as required dependencies open the project directory in terminal and run:

```bash
gradle clean bootJar
```

## Usage

To run the application just execute the generated JAR. From main project directory the command should be:

```bash
java -jar build/libs/conference-room-api-{version}.jar
```

With the app running REST API endpoints should be available at localhost:8080. If you want to monitor the app Spring Boot Actuator endpoints are available at port 9001.

## Example

To list all organizations in the system:

```bash
curl localhost:8080/organizations
```

To add an organization named Example:

```bash
curl -H "Content-Type: application/json" -d '{"name":"Example"}' localhost:8080/organizations
```

To add a conference room:

```bash
curl -H "Content-Type: application/json" \
-d '{"name":"Example Room","description":"1.33",\
"floor":1,"available":false,"seated":10,"standing":10}' \
localhost:8080/organizations/{orgId}/rooms
```

Where {orgId} is the database ID of the organization which owns the room. All IDs are generated automatically and can be checked with GET requests.

Due to time constraints full API documentation is still a work in progress. All endpoints can be easily found in source code for the controller classes. 

## Built with
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Gradle](https://gradle.org/)