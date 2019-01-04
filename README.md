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

## Built with
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Gradle](https://gradle.org/)