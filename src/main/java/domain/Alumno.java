package domain;

import java.util.Collections;
import java.util.Set;

public class Alumno {
    private String nombre;
    private int legajo;
    private Set<Materia> materiasAprobadas;

    //get && set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    //

    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean cumpleCorrelativasDe(Materia materia) {
        return this.materiasAprobadas.containsAll(materia.getCorrelativas());
    }
}
