package me.leningarcia.biblioteca.modelos;
import java.util.ArrayList;
import me.leningarcia.biblioteca.enums.EstadoUsuario;
import me.leningarcia.biblioteca.enums.EstadoLibro;


public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    //Definición de métodos de funcionalidad de la biblioteca
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public boolean prestarLibro (String id, String isbn) {
        Usuario usuario = buscarUsuarioid (id);
        Libro libro = buscarLibroisbn (isbn);
        if (usuario != null && libro != null && usuario.getEstadoUsuario() == EstadoUsuario.ACTIVO && libro.getEstado() == EstadoLibro.DISPONIBLE && libro.getCopiasDisponibles() >=0 ) {
            usuario.getLibrosPrestados().add(libro);
            libro.setCopiasDisponibles(libro.getCopiasDisponibles() - 1);
            return true;
        }
        return false;
    }

    public void devolverLibro(String id, String isbn) {
        Usuario usuario = buscarUsuarioid(id);
        if (usuario != null) {
            usuario.getLibrosPrestados().removeIf(libro -> libro.getIsbn().equals(isbn));
            buscarLibroisbn(isbn).setCopiasDisponibles(buscarLibroisbn(isbn).getCopiasDisponibles() + 1);
        }
    }
    public Libro buscarLibroisbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    public Usuario buscarUsuarioid(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }
}
