package es.ies.puerto;
import java.util.Objects;

public class Estudiante extends Persona{
    private String matricula; 

    /**
     * Constructor vacio
     */
    public Estudiante() {
        super();
    }

    /**
     * Constructor por defecto
     * @param matricula
     * @param id
     * @param nombre
     */
    public Estudiante(String matricula, String id, String nombre ){
        super(id, nombre);
        this.matricula = matricula;
    }

    @Override
    String pensar() {
        return "Soy estudiante y tengo examen el martes";
    }
    
}
