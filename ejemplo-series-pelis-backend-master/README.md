# ejemplo-series-pelis-backend

## Soring Boot

### Dependencias

  * spring-boot-starter-data-jpa
  * spring-boot-starter-web
  * spring-boot-starter-thymeleaf

### Motor DB
  * postgresql

## Test

### Dependencias

  * spring-boot-starter-test
  * h2
  * test-utils

### Credenciales

 en ambas carpetas main y test deben tener el archivo application.properties, donde van las credenciales, user password DB.

### ejemplor properties main

````
spring.datasource.hikari.connectionTimeout=20000
spring.datasource.hikari.maximumPoolSize=5

spring.datasource.url=jdbc:postgresql://localhost:5432/ejemploDB
spring.datasource.username=postgres
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=create
````

dependecia que sirve builder
````
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
````
### ejemplo properties test

````
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.h2.console.enable=true
````
