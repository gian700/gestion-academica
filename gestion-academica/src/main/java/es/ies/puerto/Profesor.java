package es.ies.puerto;

public class Profesor extends Persona{
    private String especialidad;
    
    public Profesor(String id, String nombre, String especialidad){
        super(id, nombre);
        this.especialidad = especialidad;
    }

    //TODO: tengo que crear los getters y setters.

    public Profesor(){

    }

    @Override
    String pensar() {
        return "Estoy pensando en el examen";
    }
    
}
