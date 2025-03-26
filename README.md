##Patrón Prototype en Java

Este proyecto implementa el Patrón de Diseño Creacional Prototype en Java para simular el Problema de Parada.

#Descripción

El patrón Prototype permite clonar objetos sin acoplar el código a sus clases concretas. En este caso, se utiliza para representar programas que pueden clonarse y ejecutarse independientemente.

#Implementación

Se define una interfaz Program con el método clone(), que las clases CountDown, CountUp y Reverser implementan. Esto permite crear copias independientes de los programas sin depender de sus clases concretas.

#Clases principales:
-Program: Interfaz con execute() y clone().
-CountDown: Cuenta hacia abajo hasta llegar a cero.
-CountUp: Cuenta hacia arriba indefinidamente.
-Reverser: Usa HaltChecker para decidir si ejecutarse indefinidamente o detenerse.
-HaltChecker: Simula la decisión de si un programa se detiene o no.

#Ejecución

Puedes ejecutar la clase Main para probar el comportamiento del Reverser con distintos programas clonados mediante Prototype.

#Beneficios del Patrón Prototype
-Evita dependencias directas con clases concretas.
-Facilita la clonación de objetos complejos.
-Promueve la extensibilidad al agregar nuevas implementaciones de Program sin modificar el código existente.
