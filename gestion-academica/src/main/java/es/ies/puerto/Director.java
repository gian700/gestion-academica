package es.ies.puerto;

public class Director extends Profesor{
    
    public Director(String id, String nombre, String especialidad){
        super(id, nombre, especialidad);
    }
    @Override
    String pensar(){
        return "yo pienso como director";
    }
}
