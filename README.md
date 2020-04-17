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

# Virtual Kiosk - backend

## Requirements
Deben ser instaladas las dependencias de maven del .pom del proyecto utilizando el comando:

    $ mvn clean install compile test
    
Luego correr Jetty:

    $ mvn jetty:run

## Introducción:

Proyecto TIP (Trabajo de Inserción Profesional) de la carrera "Tecnicatura en programación informática" de la Universidad de Quilmes, Argentina.


## Overview

Sistema donde se gestionan los pedidos entre el Mostrador y la Cocina para un negocio de Gastronomía.

## Profesores:

* Fernando Dodino

## Equipo

+ Damián Lattenero
+ Cristian Marchionne

## Stack tecnológico:
+ AngularJS
+ Spring
+ Hibernate
+ Java