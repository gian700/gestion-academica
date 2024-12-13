package es.ies.puerto;

public class Profesor extends Persona{
    private String especialidad;

    public Profesor(){
    }

    public Profesor(String especialidad, String id, String nombre, int edad, String primerApellido, String segundoApellido){
        super(id, nombre, edad, primerApellido, segundoApellido);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor especialidad(String especialidad) {
        setEspecialidad(especialidad);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " especialidad='" + getEspecialidad() + " id= " + getId() + ", nombre= " + getNombre() + " " + getPrimerApellido() + " " + getSegundoApellido() + ", edad= "+getEdad()  + "}";
    }
    
    @Override
    String pensar() {
        return "Estoy pensando en el examen";
    }
    
    public String enseniar(){
        return "Estoy dando clase";
    }
}