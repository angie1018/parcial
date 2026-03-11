## Parcial I - Programacion II (G412)

Sistema de gestion de biblioteca usando POO (abstraccion, encapsulamiento y herencia).

**Estructura Maven:** el proyecto esta dentro de `parcial/`.

## Diagrama UML (Mermaid)

```mermaid
classDiagram
    class Libro {
        -String titulo
        -String autor
        -int numEjemplares
        -int numPrestados
        +boolean prestamo()
        +boolean devolucion()
    }

    class LibroTexto {
        -String curso
    }

    class LibroTextoUNIAJC {
        -String facultad
    }

    class Novela {
        -TipoNovela tipo
    }

    class TipoNovela {
        <<enumeration>>
        HISTORICA
        ROMANTICA
        POLICIACA
        REALISTA
        CIENCIA_FICCION
        AVENTURAS
    }

    Libro <|-- LibroTexto
    LibroTexto <|-- LibroTextoUNIAJC
    Libro <|-- Novela
```

## Como ejecutar

1. Entrar a la carpeta del proyecto: `cd parcial`
2. Compilar: `mvn -q -DskipTests package`
3. Ejecutar: `mvn -q exec:java`

## Lo que se pide en el parcial (resumen)

1. Clases: `Libro`, `LibroTexto`, `LibroTextoUNIAJC`, `Novela` y `TipoNovela`.
2. Constructores, getters/setters y metodos `prestamo` y `devolucion`.
3. Cuatro objetos en `Main` y pruebas de prestamo/devolucion.
4. Dos casos donde no se puede heredar: ver `HerenciaInvalidaEjemplos`.
5. Dos atributos nuevos y un metodo adicional (ideas abajo).

## Ideas de mejora (pedido extra)

- Atributo 1: `anioPublicacion` (int).
- Atributo 2: `isbn` (String).
- Metodo extra: `estaDisponible()` que devuelva `true` si hay ejemplares libres.

## Ejemplo de uso (salida corta)

```
--- Objetos creados ---
Libro{titulo='Cien Anos de Soledad', autor='Gabriel Garcia Marquez', numEjemplares=3, numPrestados=1}
Libro{titulo='(ingresado por consola)', autor='(ingresado por consola)', numEjemplares=2, numPrestados=0}
LibroTextoUNIAC{titulo='Programacion II', autor='Equipo UNIAC', numEjemplares=5, numPrestados=2, curso='POO', facultad='Ingenieria'}
Novela{titulo='La Sombra del Viento', autor='Carlos Ruiz Zafon', numEjemplares=4, numPrestados=0, tipo=AVENTURAS}

--- Pruebas de prestamo/devolucion ---
Prestamo libro1: true
Prestamo libro1: true
Devolucion libro1: true
```

## Notas

- `libro2` se llena por consola con `Scanner`.
- Los metodos de prestamo y devolucion devuelven `true/false` segun se pueda hacer la operacion.
- Ajuste pequeño en README para el PR.
