Spring Boot + MongoDB
=

## Embedded MongoDB

1. Add dependency in `pom.xml`:
    ```xml
    <dependency>
        <groupId>de.flapdoodle.embed</groupId>
        <artifactId>de.flapdoodle.embed.mongo</artifactId>
    </dependency>
    ```
1. Do not set host and port in `application.yml`:
    ```yaml
    spring:
      data:
        mongodb:
          database: mongo-example
          #host: 172.17.0.1
          #port: 27017
    ```
1. That's it!

## MongoDB in Docker

1. Comment this dependency in `pom.xml`:
    ```xml
    <dependency>
        <groupId>de.flapdoodle.embed</groupId>
        <artifactId>de.flapdoodle.embed.mongo</artifactId>
    </dependency>
    ```
1. Pull `mongo` image from Docker Hub:
    ```
    docker pull mongo
    ```
1. Start container with following command:
    ```
    docker run -p 27017:27017 mongo
    ```
1. Find your docker's network address with `ifconfig`
1. Set host and port in `application.yml`:
    ```yaml
    spring:
      data:
        mongodb:
          database: mongo-example
          host: 172.17.0.1
          port: 27017
    ```
1. That's it!