package me.leningarcia.biblioteca.modelos;
import me.leningarcia.biblioteca.enums.EstadoUsuario;
import me.leningarcia.biblioteca.enums.TipoUsuario;
import java.util.ArrayList;

public class Usuario {
    //Declaración de atributos de la clase Usuario como privados
    private String id;
    private String nombre;
    private String email;
    private TipoUsuario tipoUsuario;
    private ArrayList<Libro> librosPrestados;
    private EstadoUsuario estadoUsuario;

    // Constructor
    public Usuario(String id, String nombre, String email, TipoUsuario tipoUsuario, EstadoUsuario estadoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.librosPrestados = new ArrayList<>();
        this.estadoUsuario = estadoUsuario;
    }

    // Definición de Geteers y Setters para validaciones
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public EstadoUsuario getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
        if (estadoUsuario != null) {
            this.estadoUsuario = estadoUsuario;
        }
    }
}