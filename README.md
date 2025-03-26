# Patrón Prototype en Java

Este proyecto implementa el Patrón de Diseño Creacional Prototype en Java para simular el Problema de Parada.

## Descripción

El patrón Prototype permite clonar objetos sin acoplar el código a sus clases concretas. En este caso, se utiliza para representar programas que pueden clonarse y ejecutarse independientemente.

## Implementación

Se define una interfaz Program con el método clone(), que las clases CountDown, CountUp y Reverser implementan. Esto permite crear copias independientes de los programas sin depender de sus clases concretas.

## Clases principales:

1. Interfaz Program
- Esta interfaz define un contrato para todos los programas clonables, asegurando que cada uno implemente los métodos execute() y clone().
2.  CountDown
- Representa un programa que cuenta de un número dado hasta cero. Implementa la interfaz Program y sobrescribe el método execute() para realizar la cuenta regresiva.
3. CountUp
- Este programa cuenta indefinidamente hacia arriba, lo que lo convierte en un proceso infinito.
4. HaltChecker
- Simula un verificador de detención, almacenando información sobre si un programa se detiene o entra en un bucle infinito.
5. Reverser
- Este programa invierte el comportamiento de otro programa utilizando el HaltChecker. Si el programa original se detiene, Reverser entra en un bucle infinito; si el programa original es infinito, Reverser s

## Funcionamiento del main

La clase Main instancia varios programas y los ejecuta para demostrar el patrón Prototype.

## Ejemplo de salida esperada
Si ejecutamos reverser2.execute();, obtenemos:

Executing Reverser with CountDown:
Executing Reverser with CountUp:
Halting immediately.
Si descomentamos reverser1.execute();, el programa imprimirá:

Executing Reverser with CountDown:
Looping indefinitely...
Looping indefinitely...
Looping indefinitely...
...
(y seguirá ejecutándose sin detenerse).
