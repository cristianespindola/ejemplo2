# Prueba de concepto

## Tarea

como usuario buscar un recital por genero para asistir

## Pasos a seguir

### primer paso 

El usuario ingresa un input con el genero que quiere buscar

### segundo paso

El pedido de busqueda llega al mensaje filterGenero del objeto RecitalController, que es el encargado de resolver el pedido y enviar una respuesta. Si el pedido no tiene resultados devuelve una una lista vacia, y si lo tiene devuelve la cantidad de resultados obtenidos.

imagen

aca es donde se comunica con la base de datos y obtiene lo pedido

imagen

### tercer paso

Despues se devuelve lo pedido para que el componente lea la respuesta

imagen

aca es donde se lee el resultado y lo muestra 

 	imagen

## Extras

 Crear modelo Recital. integrar database Postgresql al proyecto. Integrar tanto el backend como el frontend a heroku.

## Diagrama de Actividades

imagen

## Diagrama UML

imagen



![alt text](https://github.com/cristianespindola/ejemplo2/tree/master/pruebaDeConcepto/imagen.jpg)