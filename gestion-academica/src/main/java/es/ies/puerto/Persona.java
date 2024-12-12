package es.ies.puerto;
import java.util.Objects;

public abstract class Persona {
    private String id;
    private String nombre;
    private Fecha nacimiento;


    /**
     * Constructor por defecto
     * @param id
     * @param nombre
     */
    public Persona(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Constructor vacio
     */
    public Persona(){
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona id(String id) {
        setId(id);
        return this;
    }

    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }

    /**
     * Funcion que saluda
     * @return String con mensaje
     */
    public String saludar(){
        return "hola yo soy" + nombre;
    }
    
    abstract String pensar();

    public int edad() {
        int calculo = 0;
        return calculo;
    }

}
