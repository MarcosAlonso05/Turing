# Halting Problem - Simulación con Patron Abstract Factory

## Estructura del Proyecto
El programa está dividido en los siguientes módulos:

- **factories**: Contiene fábricas para crear programas.
- **haltchecker**: Implementa `HaltChecker`, que analiza si un programa se detiene.
- **model**: Define los programas (`HaltingP`, `NoHaltingP`) y la interfaz `Program`.
- **reverse**: Implementa `Reverser`, que usa `HaltChecker` para invertir el comportamiento de un programa.

## Descripción de las Clases Principales

### 1. `Program`
Interfaz que define el método `run()`, que ejecutará cada programa.

### 2. `HaltingP` (Programa que se detiene)
Este programa ejecuta una cuenta regresiva hasta llegar a cero y luego se detiene.

### 3. `NoHaltingP` (Programa que no se detiene)
Este programa entra en un bucle infinito, incrementando un contador sin detenerse nunca.

### 4. `HaltChecker`
Simula un verificador del problema de parada, ejecutando un programa dentro de un tiempo límite.  
Si el programa se detiene dentro del tiempo, retorna `true`, de lo contrario, retorna `false`.

### 5. `Reverser`
Este programa invierte el comportamiento de otro programa:
- Si `HaltChecker` indica que un programa se detendría, `Reverser` entra en un bucle infinito.
- Si `HaltChecker` indica que un programa no se detendría, `Reverser` termina inmediatamente.

## Funcionamiento del `Main`
El `Main` realiza las siguientes operaciones:
1. Crea fábricas para generar programas (`HaltingP` y `NoHaltingP`).
2. Instancia los programas usando las fábricas.
3. Usa `HaltChecker` para verificar si cada programa se detiene.
4. Crea instancias de `Reverser` para invertir el comportamiento de los programas.
5. Prueba `Reverser` con ambos programas:
   - Si el programa se detiene, `Reverser` entra en un bucle infinito.
   - Si el programa no se detiene, `Reverser` termina inmediatamente.

## Ejecución del Proyecto
Para ejecutar el proyecto, compila y ejecuta `Main.java`.  

### Ejemplo de Salida Esperada
```
Programa 1 (Se detiene):
Halting p1: true

Programa 2 (No se detiene):
Halting p2: false

Probando Reverser con p1 (Programa que se detiene):
(Reverser entra en un bucle infinito...)

Probando Reverser con p2 (Programa que no se detiene):
Reverser: El programa no se detendría, por lo que termino inmediatamente.
```
