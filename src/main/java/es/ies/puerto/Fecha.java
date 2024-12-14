package es.ies.puerto;
import java.util.Objects;

public abstract class Fecha {
    private int anio;
    private int mes;
    private int dia;

    public Fecha() {
    }

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Fecha anio(int anio) {
        setAnio(anio);
        return this;
    }

    public Fecha mes(int mes) {
        setMes(mes);
        return this;
    }

    public Fecha dia(int dia) {
        setDia(dia);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Fecha)) {
            return false;
        }
        Fecha fecha = (Fecha) o;
        return anio == fecha.anio && mes == fecha.mes && dia == fecha.dia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(anio, mes, dia);
    }

    @Override
    public String toString() {
        return "{" +
            " anio='" + getAnio() + "'" +
            ", mes='" + getMes() + "'" +
            ", dia='" + getDia() + "'" +
            "}";
    }
      
}
