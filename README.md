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

Remote Debug
------------

    mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
