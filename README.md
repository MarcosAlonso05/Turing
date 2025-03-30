# Proyecto: Implementación de Patrones Creacionales en Java

Enlace Repositrio: https://github.com/MarcosAlonso05/Turing

Este proyecto implementa varios **Patrones Creacionales** en Java: **Abstract Factory, Builder y Prototype**. Se proporciona un menú principal que permite elegir cuál de los tres ejecutar.

## Estructura del Proyecto

El código está organizado en los siguientes paquetes:

- **abstractFactory/** → Implementa el patrón Abstract Factory.
- **builder/** → Implementa el patrón Builder.
- **prototype/** → Implementa el patrón Prototype.
- **main/** → Contiene el `Main` general con un menú para elegir cuál patrón ejecutar.

## Descripción de los Patrones

### Abstract Factory

- Define una familia de fábricas que crean programas con diferentes comportamientos.
- Permite generar programas que **se detienen** y otros que **no se detienen**.
- Utiliza `HaltChecker` para verificar si un programa se detiene.

### Builder

- Utiliza el **patrón Builder** para construir programas de manera flexible.
- Incluye `HaltChecker` y `Reverse`, que invierte el comportamiento de los programas.

### Prototype

- Implementa la clonación de objetos utilizando el patrón Prototype.
- Permite crear copias de programas sin conocer sus detalles internos.

## Funcionamiento del Menú Principal

La clase `Main` permite elegir entre los tres patrones:

- **Abstract Factory** → Ejecuta la implementación basada en fábricas.

- **Builder** → Ejecuta la implementación con el patrón Builder.

- **Prototype** → Ejecuta la implementación con el patrón Prototype.

- **Salir** → Termina la ejecución.

## Ejecución del Proyecto

Compila y ejecuta `Main.java` para iniciar el menú:
