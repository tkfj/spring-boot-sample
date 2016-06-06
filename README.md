Spring Boot sample
==================

Enable
------

* Validation
* Lombok
* Web
* Thymeleaf
* H2
* Actuator
* Actuator Docs
* Spring Loaded

Run
---

    mvn spring-boot:run

or

    mvn clean package
    java -jar target/spring-boot-sample-0.0.1-SNAPSHOT.jar

Change HTTP Port
----------------

    mvn spring-boot:run -Drun.arguments="--server.port=9999"

or

    java -jar target/spring-boot-sample-0.0.1-SNAPSHOT.jar --server.port=9999

Remote Debug
------------

    mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"

or

    java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -jar target/spring-boot-sample-0.0.1-SNAPSHOT.jar

Profile
-------

* dev ( default )
* mock
* production

change active profile

    mvn spring-boot:run -Drun.profiles=mock

or

    java -jar -Dspring.profiles.active=mock target/spring-boot-sample-0.0.1-SNAPSHOT.jar

Spring Boot Actuator
--------------------

Show enable Spring Boot Actuator endpoints

http://localhost:8080/actuator

ref:

http://docs.spring.io/spring-boot/docs/1.3.5.RELEASE/reference/htmlsingle/#production-ready-endpoints
