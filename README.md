# Proyecto - Java con Pruebas para Autograding

Plantilla básica para proyecto de Java con Autograding

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Ejemplo de Herencia 1
---
classDiagram
      class Persona {
        -String nombre
        -int edad
        +Persona()
        +Persona(String nombre, int edad)
        +String getNombre()
        +void setNombre(String nombre)
        +int getEdad()
        +void setEdad(int edad)
        +String toString()
    }
    class Alumno {
        -String matricula
        +Alumno()
        +Alumno(String nombre, int edad, String matricula)
        +String getMatricula()
        +void setMatricula(String matricula)
        +String toString()
    }
    class Empleado {
        -double salario
        +Empleado()
        +Empleado(String nombre, int edad, double salario)
        +double getSalario()
        +void setSalario(double salario)
        +String toString()
    }
    Persona <|-- Alumno
    Persona <|-- Empleado
```

```mermaid
---
title: Ejemplo de Herencia 2
---
classDiagram
      class Publicacion {
        
    }
    class Revista {
       
    }
    class Libro {
       
    }
    Publicacion <|-- Revista
    Publicacion <|-- Libro
```

```mermaid
---
title: Ejemplo de Herencia 3
---
classDiagram
      class Empleado {
        -String nombre
        -int edad
        -String tipoRelacionLaboral
        
    }

    class EmpleadoSueldoFijo {
        -double sueldoFijo
       
    }

    class EmpleadoPorHoras {
        -double tarifaPorHora
        -int horasTrabajadas
       
    }

    class EmpleadoComision {
        -double comision
        -int ventasRealizadas
        
    }

    class EmpleadoIndustrial {
        
    }

    class EmpleadoComercial {
       
    }

    Empleado <|-- EmpleadoSueldoFijo
    Empleado <|-- EmpleadoPorHoras
    Empleado <|-- EmpleadoComision
    Empleado <|-- EmpleadoIndustrial
    Empleado <|-- EmpleadoComercial
```

```mermaid
---
title: Ejemplo de Herencia 4
---
classDiagram
      class Barco {
      
        
    }

    class DeVapor {
       
       
    }

    class Velero {
        
       
    }

    class Carguero {
        
        
    }

   

    Barco <|-- DeVapor
    Barco <|-- Velero
    DeVapor <|-- Carguero
   
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
