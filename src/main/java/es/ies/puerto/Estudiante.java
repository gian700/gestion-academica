package es.ies.puerto;

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
    public Estudiante(String matricula, String id, int edad, String nombre, String primerApellido, String segundoApellido){
        super(id, edad, nombre, primerApellido, segundoApellido);
        this.matricula = matricula;
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "{" + " matricula='" + getMatricula() +" id= " + getId() + ", nombre= " + getNombre() + " " + getPrimerApellido() + " " + getSegundoApellido() + ", edad= "+getEdad() +"}";
    }

    @Override
    String pensar() {
        return "Soy estudiante y tengo examen el martes";
    }

    public String estudiar(){
        return "Estoy estudiando";
    }
}
