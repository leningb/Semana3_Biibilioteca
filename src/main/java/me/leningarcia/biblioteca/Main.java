package me.leningarcia.biblioteca;
import me.leningarcia.biblioteca.modelos.*;
import me.leningarcia.biblioteca.enums.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        //Crear y agregar un libro
        Libro libro1 = new Libro("4455465", "Thinking Java 4TH Edition (ES Edition)", "Bruce Eckel",2027, EstadoLibro.DISPONIBLE, 1);
        // Crear y registrar un usario de cualquier tipo
        Usuario usuario1 = new Usuario("S001","Lenin","lenin.garcia@mail.com",TipoUsuario.ESTUDIANTE,EstadoUsuario.ACTIVO);
        biblioteca.agregarLibro(libro1);
        biblioteca.registrarUsuario(usuario1);

        // Verificamos el estado del usuario y el libro antes del préstamo

        // Verificamos el estado del usuario y el libro antes del préstamo
        System.out.println("Estado usuario: " + usuario1.getEstadoUsuario());
        System.out.println("Estado libro: " + libro1.getEstado());
        System.out.println("Copias disponibles: " + libro1.getCopiasDisponibles());

        // Haceer el préstamo de libro
        biblioteca.prestarLibro("S001","4455465");
        boolean prestamo = biblioteca.prestarLibro("S001", "4455465");
        System.out.println("Prestamo realizado: " + prestamo);
    }
}