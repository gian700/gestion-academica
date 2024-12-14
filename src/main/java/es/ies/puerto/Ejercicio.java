package es.ies.puerto;

public class Ejercicio {
    static Persona persona = new Estudiante("DAM", "486e", 20, "Ramon", "y", "Cajal");
    static Persona persona2 = new Estudiante("DAM", "oiho7", 25, "Oliver", "benji", "Los amos del balon");
    static Persona persona4 = new Profesor("Gestion-De-Datos", "cebollina", 38, "Kamisama", "Il", "Grande");
    static Persona persona6 = new Profesor("IKL", "63+0", 28, "Siam park", "Loro", "Parque");
    static Libro libro = new Libro("El señor de los anillos", "George", "Raymond", "Richard");
    static Libro libro2 = new Libro("Blue lock", "Muneyuki", "Kaneshiro", "");
    static Materia materia2 = new Materia("Gestion-De-Datos", "98498", (Profesor) persona4);
    static Materia materia3 = new Materia("IKL", "9489", (Profesor) persona6);
    static Biblioteca biblioteca = new Biblioteca("biblioteca01");
    static Curso curso = new Curso("DAM", "204");
    static Examen examen = new Examen(17, 12, 2024);

    public static void main(String[] args) {
        System.out.println(persona.getNombre() + "=" +persona);
        System.out.println("");
        System.out.println(persona6.getNombre() + "=" +persona6);
        System.out.println("");
        System.out.println(persona4.saludar());
        System.out.println("");
        System.out.println(libro);
        System.out.println("");
        System.out.println(biblioteca);
        System.out.println("");
        biblioteca.registrarLibro(libro);
        biblioteca.registrarLibro(libro2);
        System.out.println(biblioteca);
        curso.agregarEstudiante((Estudiante) persona);
        curso.agregarEstudiante((Estudiante) persona2);
        curso.agregarMateria(materia2);
        curso.agregarMateria(materia3);
        System.out.println("");
        System.out.println(curso);
    }
}
