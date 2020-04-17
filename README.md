## ejemplo2

```bash
$ node dist/services/initData.js
Data initialization started
. etc.
```

````java
@Entity
@Table(name = "tutorials")
public class Tutorial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nombre;

	public Tutorial() {

	}

	public Tutorial(String nombre) {
		this.nombre = nombre;
	}
````

# Circuito Del Under - Backend

## Introducción:

Proyecto del Trabajo de Inserción Profesional de la carrera "Tecnicatura en programación informática" de la Universidad de Quilmes.

## Objetivo

Sistema de publicacion de recitales.

## Profesores:

* Fernando Dodino

## Equipo

+ Cristian Espindola
+ Sergio Guzman

## Stack tecnológico:
+ Java 1.8
+ Spring Boot
+ Postgresql
+ JPA

### Dependencias

````java		
	<dependency>
   	<groupId>org.postgresql</groupId>
   	<artifactId>postgresql</artifactId>
   	<scope>runtime</scope>
	</dependency>

	<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
	</dependency>
````

