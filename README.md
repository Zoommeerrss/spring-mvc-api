# spring-mvc-api

This is a Springboot project builded using Openliberty

## IDE

* Intellij IDEA 2024.1

## Project Main Dependencies

* spring-webmvc
* jakarta.jakartaee-api
* lombok
* logback (to use JSON format)
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

* default endpoint: [swagger-ui](http://localhost:5050/passenger-trip/swagger-ui/index.html)
* docs endpoint: [api-docs](http://localhost:5050/passenger-trip/v3/api-docs)

## Derby Database for Tests

In some cases, the Derby Database can throw some exception because the Java JDK version.
Please, consider these configuration options in the pom.xml:

* For Java 21 and Higher (releases which handle the deprecation and removal of old Java apis)
  10.17.1.0 (November 10, 2023 / SVN 1913217)
```
    <!-- Derby DB Drivers -->
    <dependency>
        <groupId>org.apache.derby</groupId>
        <artifactId>derby</artifactId>
        <version>10.17.1.0</version>
        <scope>provided</scope>
    </dependency>
```

* For Java 17 and Higher (releases which no longer support the Java SecurityManager)
  10.16.1.1 (May 19, 2022 / SVN 1901046)
```
    <!-- Derby DB Drivers -->
    <dependency>
        <groupId>org.apache.derby</groupId>
        <artifactId>derby</artifactId>
        <version>10.16.1.1</version>
        <scope>provided</scope>
    </dependency>
```

Font: [Apache Derby: Downloads](https://db.apache.org/derby/derby_downloads.html)