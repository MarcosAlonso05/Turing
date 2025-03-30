# Halting Problem - Implementación con el Patrón Builder

## Estructura del Proyecto

El código está organizado en los siguientes paquetes:

- **builder**: Contiene los constructores (`HaltingBuilder`, `NHaltingBuilder`) para crear programas.
- **haltchecker**: Implementa `HaltChecker`, que verifica si un programa se detiene.
- **model**: Define la interfaz `Program`, que todos los programas deben implementar.
- **reverse**: Contiene `Reverse`, que usa `HaltChecker` para invertir el comportamiento de un programa.
- **main**: Contiene la clase `Main`, que ejecuta la simulación.

## Descripción de las Clases Principales

### `Program` (Interfaz Base)

Define la estructura básica de un programa con el método `run()`, que debe implementarse en cada clase concreta.

### `HaltingP` (Programa que se detiene)

- Implementa una cuenta regresiva desde 10 hasta 0 y luego finaliza.

### `NoHaltingP` (Programa que **no** se detiene)

- Ejecuta un bucle infinito, incrementando un contador sin detenerse nunca.

### `HaltingBuilder` y `NHaltingBuilder` (Builders)

- Permiten construir instancias de `HaltingP` y `NoHaltingP` de manera flexible usando el patrón **Builder**.

### `HaltChecker`

- Ejecuta un programa dentro de un tiempo límite para determinar si se detiene.
- Si el programa finaliza dentro del tiempo límite, retorna `true`.
- Si el programa no finaliza, retorna `false`.

### `Reverse`

Este programa **invierte el comportamiento** de otro programa:

- **Si `HaltChecker` dice que el programa se detendría, `Reverse` entra en un bucle infinito.**
- **Si `HaltChecker` dice que el programa no se detendría, `Reverse` finaliza inmediatamente.**

## Funcionamiento del `Main`

La clase `Main` ejecuta la simulación siguiendo estos pasos:

1. **Crea programas usando los Builders** (`HaltingBuilder`, `NHaltingBuilder`).
2. **Usa `HaltChecker` para verificar si cada programa se detiene.**
3. **Prueba `Reverse` con ambos programas**:
   - Si el programa se detiene, `Reverse` entra en un bucle infinito.
   - Si el programa **no** se detiene, `Reverse` finaliza inmediatamente.

## Ejecución del Proyecto

Para ejecutar el proyecto, compila y ejecuta `Main.java`.

### Ejemplo de Salida Esperada
```
Programa 1 (Se detiene):
Halting p1: true

Programa 2 (No se detiene):
Halting p2: false

Probando Reverser con p1 (Programa que se detiene):
Reverser: El programa se detendría, así que entro en un bucle infinito.
(Bucle infinito...)

Probando Reverser con p2 (Programa que no se detiene):
Reverser: El programa no se detendría, por lo que termino inmediatamente.
```
