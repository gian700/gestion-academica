package es.ies.puerto;

public class Ejercicio {
    static Persona persona;
    public static void main(String[] args) {
        persona = new Estudiante("4239", "52fa", "Juan", 5, "Ramirez", "Francisco");
        System.out.println(persona.saludar());
        System.out.println(persona.toString());

    }
}
