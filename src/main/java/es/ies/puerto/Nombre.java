package es.ies.puerto;
import java.util.Objects;

public abstract class Nombre {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Nombre() {
    }

    public Nombre(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Nombre nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Nombre primerApellido(String primerApellido) {
        setPrimerApellido(primerApellido);
        return this;
    }

    public Nombre segundoApellido(String segundoApellido) {
        setSegundoApellido(segundoApellido);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Nombre)) {
            return false;
        }
        Nombre nombre = (Nombre) o;
        return Objects.equals(nombre, nombre.nombre) && Objects.equals(primerApellido, nombre.primerApellido) && Objects.equals(segundoApellido, nombre.segundoApellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, primerApellido, segundoApellido);
    }

    @Override
    public String toString() {
        return getNombre()  + " " + getPrimerApellido() + " " + getSegundoApellido();
    }

}
