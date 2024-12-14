package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca() {
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();    
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Biblioteca nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Biblioteca libros(List<Libro> libros) {
        setLibros(libros);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Biblioteca)) {
            return false;
        }
        Biblioteca biblioteca = (Biblioteca) o;
        return Objects.equals(nombre, biblioteca.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, libros);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", libros='" + getLibros() + "'" +
            "}";
    }
    
    public boolean registrarLibro(Libro libro){
        if (libro==null) {
            return false;
        }
        libros.add(libro);
        return true;
    }

    public boolean registrarLibros(ArrayList<Libro> libros){
        if (libros==null) {
            return false;
        }
        libros.addAll(libros);
        return true;
    }
    
    public List<Libro> listarLibros(){
        return libros;
    }
}
