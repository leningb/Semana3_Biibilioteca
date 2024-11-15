package me.leningarcia.biblioteca.modelos;
import me.leningarcia.biblioteca.enums.EstadoLibro;

public class Libro {
    //Declaración de atributos de la clase Libro como privados
    private String isbn;
    private String titulo;
    private String autor;
    private int aPublicacion;
    private EstadoLibro estado; //enum: DISPONIBLE, PRESTADO, EN_REPARACION
    private int copiasDisponibles; //

    //Definimos el constructor de los atributos de mi clase Libro
    public Libro (String isbn, String titulo, String autor, int aPublicacion, EstadoLibro estado, int copiasDisponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.aPublicacion = aPublicacion;
        this.estado = estado;
        this.copiasDisponibles = copiasDisponibles;
    }
    //Definición de Getter y Setters con validación
    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getaPublicacion(){
        return aPublicacion;
    }
    public EstadoLibro getEstado(){
        return estado;
    }
    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setEstado(EstadoLibro estado) {
        if (estado!=null) {
            this.estado = estado; //Muestra estado siempre y cuando sea uno de los que definimos
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", aPublicacion=" + aPublicacion +
                ", estado=" + estado +
                ", copiasDisponibles=" + copiasDisponibles +
                '}';
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        if (copiasDisponibles>=0) {
            this.copiasDisponibles = copiasDisponibles; //muestra las copias siempre que haya una disponible
        }

    }

}