
package domain;

import java.util.List;

public class Materia {
    private String nombre;
    private List<String> comisiones;
    private List<String> profesores;
    private List<Materia> correlativas;

    // get && set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getComisiones() {
        return comisiones;
    }

    public void setComisiones(List<String> comisiones) {
        this.comisiones = comisiones;
    }

    public List<String> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<String> profesores) {
        this.profesores = profesores;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }



}
