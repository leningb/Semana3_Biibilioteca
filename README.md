## Introducción
El programa que se presenta esta diseñado y desarrollado tomando como base los conceptos visto en clase, la documentación de estudio y guías o ayudas en internet.
El uso de AI Generativa se ha utilizado, pero su uso ha sido limitado solo a que pueda ser de ayuda, más no que reemplace la realización del programa, esto considerando
que mucho del código empleado se base como se mencionaba en la documentación de estudio. Adicionalmenete ya IntelliJ IDEA proporciona ayuda para identidicar errores o automatizar la
declaración de métodos o funciones, como son constructores, setters and getters, applicados en este programa.

## Instrucciones de Compilación y Ejecución

1. **Compilación**:
   - Se puede clonar el archivo desde desde Github o descrompir desde el archivo que contiene la estrucutra de mi programa (Clona el repositorio y navega hasta la carpeta principal del proyecto.
   - Ejecuta el siguiente comando para compilar todos los archivos `.java`:
     ```bash
     javac -d bin src/main/java/me/leningarcia/biblioteca/enums/*.java src/main/java/me/leningarcia/biblioteca/modelos/*.java src/main/java/me/leningarcia/biblioteca/Main.java
     ```

2. **Ejecución**:
   - Considerar que debe haberse generado la carpeta `bin` en la raiz del proyecto:
   - Para ejecutar el programa, desde la misma raiz utiliza el siguiente comando:
     ```bash
     java -cp bin me.leningarcia.biblioteca.Main
     ```
## Funcionalidades Implementadas

El sistema proporciona las funcionalidades requeridas para la administración de una biblioteca:

1. **Gestión de Libros**:
   - Agregar libros con detalles como ISBN, título, autor, año de publicación, estado (DISPONIBLE, PRESTADO, EN_REPARACION), y número de copias de libros disponibles.

2. **Gestión de Usuarios**:
   - Registrar usuarios con información básica, tipo de usuario (ESTUDIANTE, PROFESOR, VISITANTE) y estado (ACTIVO, SUSPENDIDO).
   - Limitar el número máximo de préstamos activos por usuario a cinco libros.

3. **Préstamo y Devolución de Libros**:
   - Permitir a los usuarios tomar en préstamo libros si están disponibles y el usuario está activo.
   - Actualizar el estado del libro y las copias disponibles al realizar un préstamo o devolución.
   - Validar que el usuario no exceda el límite de libros prestados y que el libro esté en estado DISPONIBLE.

## Reglas de lógica y de diseño importantes

- **Uso de Enumeraciones**: Los estados del libro (`EstadoLibro`), tipos de usuarios (`TipoUsuario`) y estados del usuario (`EstadoUsuario`) se gestionan mediante `enum` para asegurar valores predefinidos, claros y fáciles de mantener.
- **Validaciones de Préstamos**: Para evitar problemas de disponibilidad, se validan tanto el estado del libro como las copias disponibles antes de aprobar un préstamo.
- **Restricciones de Préstamos**: Cada usuario tiene un límite de cinco libros prestados simultáneamente, lo cual ayuda a controlar los recursos y garantiza disponibilidad para otros usuarios.
- **Encapsulamiento de Atributos**: Los atributos de las clases `Libro` y `Usuario` son privados, accesibles solo a través de métodos `get` y `set`, permitiendo un control adecuado de los datos y restricciones internas.

## Ejemplo de Uso Básico

El archivo `Main.java` proporciona ejemplos básicos de cómo utilizar el sistema:

1. **Registrar Libros y Usuarios**:
Este ejemplo esta definido en la clase principal que se muestra al ejecutar el programa, que corresponde al registro de un Usuario  y un libro.

   ```java
   Biblioteca biblioteca = new Biblioteca();
   Libro libro1 = new Libro("4455465", ""Thinking Java 4TH Edition (ES Edition)", "Bruce Eckel", 2007, EstadoLibro.DISPONIBLE,1);
   Usuario usuario1 = new Usuario("S001", "Lenin", "lenin.garcia@mail.com", TipoUsuario.ESTUDIANTE, EstadoUsuario.ACTIVO));

   biblioteca.agregarLibro(libro1);
   biblioteca.registrarUsuario(usuario1);

// Podemos prestar un libro a un usuario, en este caso solo tenemos un libro y un usuario.

boolean prestamoExitoso = biblioteca.prestarLibro("S001", "4455465");

## Referencias de estudio

1. Thinking Java 4TH Edition (ES Edition), Bruce Eckel (2007)
2. https://github.com/0xjams/codigo_soporte_oop
3. https://clases.0xjams.com/poo/#/c-w
