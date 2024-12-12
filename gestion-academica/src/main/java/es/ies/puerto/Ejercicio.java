package es.ies.puerto;

public class Ejercicio {
    static Persona persona;
    public static void main(String[] args) {
        persona = new Estudiante("Soy matricula", "soy id", "Pepe");
        System.out.println(persona.pensar());

    }
}
