package es.ies.puerto;
import java.util.Objects;

public class Materia {
    private String nombreMateria;
    private String codigo;
    private Profesor profesor;

    public Materia(String string, String string2, Persona persona4) {
    }

    public Materia(String nombreMateria, String codigo, Profesor profesor) {
        this.nombreMateria = nombreMateria;
        this.codigo = codigo;
        this.profesor = profesor;
    }


    public String getNombreMateria() {
        return this.nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Materia nombreMateria(String nombreMateria) {
        setNombreMateria(nombreMateria);
        return this;
    }

    public Materia codigo(String codigo) {
        setCodigo(codigo);
        return this;
    }

    public Materia profesor(Profesor profesor) {
        setProfesor(profesor);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Materia)) {
            return false;
        }
        Materia materia = (Materia) o;
        return Objects.equals(codigo, materia.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreMateria, codigo, profesor);
    }

    @Override
    public String toString() {
        return "{" +
            " nombreMateria='" + getNombreMateria() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", profesor='" + getProfesor() + "'" +
            "}";
    }
    
    
    public String accederDetalles(){
        return toString();
    }
}
