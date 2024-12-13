package es.ies.puerto;
import java.util.Objects;

public abstract class Persona extends Nombre {
    private String id;
    private int edad;

    /**
     * Constructor por defecto
     * @param id
     * @param nombre
     */
    public Persona(String id, String nombre, int edad, String primerApellido, String segundoApellido){
        super(nombre, primerApellido, segundoApellido);
        this.id = id;
        this.edad = edad;
    }

    /**
     * Constructor vacio
     */
    public Persona(){
        super();
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public Persona id(String id) {
        setId(id);
        return this;
    }

    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Persona edad(int edad){
        setEdad(edad);
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
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +" id= " + getId() + ", nombre= " + getNombre() + " " + getPrimerApellido() + " " + getSegundoApellido() + ", edad= "+getEdad() +"}";
    }

    public String saludar(){
        return "hola, yo soy " + getNombre()  + " " + getPrimerApellido() + " " + getSegundoApellido();
    }
    
    abstract String pensar();
}
