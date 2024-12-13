package es.ies.puerto;
import java.util.Objects;

public class Libro extends Nombre {
    private String titulo;

    public Libro(){
    }

    public Libro(String titulo, String nombre, String primerApellido, String segundoApellido) {
        super(nombre, primerApellido, segundoApellido);
        this.titulo = titulo;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Libro titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo);
    }


    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +"autor= "+ getNombre()  + " " + getPrimerApellido() + " " + getSegundoApellido() +"}";
    }
    public String detalles(){
        return toString(); 
    }
}
