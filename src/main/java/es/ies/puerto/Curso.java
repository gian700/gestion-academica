package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nombreCurso;
    private String codigo;
    private List<Estudiante> estudiantes;
    private List<Materia> materias;

    public Curso() {
    }

    public Curso(String nombreCurso, String codigo) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.estudiantes = new ArrayList<>();
        this.materias = new ArrayList<>();
        
    }

    public String getNombreCurso() {
        return this.nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Materia> getmaterias() {
        return this.materias;
    }

    public void setmaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Curso nombreCurso(String nombreCurso) {
        setNombreCurso(nombreCurso);
        return this;
    }

    public Curso codigo(String codigo) {
        setCodigo(codigo);
        return this;
    }

    public Curso estudiantes(List<Estudiante> estudiantes) {
        setEstudiantes(estudiantes);
        return this;
    }

    public Curso materias(List<Materia> materias) {
        setmaterias(materias);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Curso)) {
            return false;
        }
        Curso cursos = (Curso) o;
        return Objects.equals(codigo, cursos.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCurso, codigo, estudiantes, materias);
    }

    @Override
    public String toString() {
        return "{" +
            " nombreCurso='" + getNombreCurso() + "' " +
            ", codigo='" + getCodigo() + " '" +
            ", estudiantes='" + getEstudiantes() + "' " +
            ", materias='" + getmaterias() + "' " +
            "}";
    }

    public boolean agregarEstudiante(Estudiante estudiante){
        if (estudiante==null) {
            return false;
        }
        estudiantes.add(estudiante);
        return true;
    }

    public boolean agregarEstudiantes(ArrayList<Estudiante> estudiantesNuevos){
        if (estudiantesNuevos==null) {
            return false;
        }
        estudiantes.addAll(estudiantesNuevos);
        return true;
    }

    public boolean agregarMateria(Materia materia){
        if (materia==null) {
            return false;
        }
        materias.add(materia);
        return true;
    }

    public boolean agregarMaterias(ArrayList<Materia> materiasNuevas){
        if (materias==null) {
            return false;
        }
        materias.addAll(materiasNuevas);
        return true;
    }
    
    public List<Estudiante> listarEstudiantes(){
        return estudiantes;
    }
}
