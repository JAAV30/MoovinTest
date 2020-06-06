# MoovinTest

API para el uso de la libreria JTS vivid solutions. 

La carpeta cuenta con 2 proyectos uno elaborado con SpringBoot y otro con JAX-RS con librerias Resteasy. 

Ambos proyectos tienen la misma funcionadad, consiste en un servicio REST que toma dos valores: Longitude y Latitude para verficar
si estas coordenadas son parte del poligono previamente establecido. 

-El resquest toma valores por medio de URL con @RequestParam para la API con SpringBoot y con @QueryParam para la Resteasy

-Ambas tienen un mismo response compuesto es un objeto JSON con las propiedades Longitude y Latitude ingresadas por URL mas una
propiedad Available que indica si es valida o no para el poligono. 

-Ambas fueron creadas con Maven, Java 11, web server Tomcat y probada con Postman.
