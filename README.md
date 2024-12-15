# spring-mvc-api

This is a Springboot project builded using Openliberty

## IDE

* Intellij IDEA 2024.1

## Project Main Dependencies

* spring-webmvc
* jakarta.jakartaee-api
* lombok
* logback (to use JSON format)
* derby
* maven-compiler-plugin
* maven-war-plugin
* liberty-maven-plugin
* maven-ear-plugin

## Openliberty

* server.env
* server.xml
* persistence.xml
* Version 24.0.9 of Liberty Tools for IntelliJ IDEA 

## Environment Variables

* LOGGER_JSON_FORMAT=false (if true the log is generated like JSON format otherwise PLAIN/TEXT)

## Openapi

* default endpoint: http://localhost:5050/swagger-ui/index.html
* docs endpoint: http://localhost:5050/v3/api-docs