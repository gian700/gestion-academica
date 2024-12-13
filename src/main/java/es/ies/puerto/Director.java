package es.ies.puerto;

public class Director extends Profesor{

    public Director(){
    }
    
    public Director(String id, String nombre, String especialidad){
    }
    
    @Override
    String pensar(){
        return "yo pienso como director";
    }
}
