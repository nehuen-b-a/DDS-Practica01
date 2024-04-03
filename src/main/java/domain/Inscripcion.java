package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    //Genero la Incripción
    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    // get && set
    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    //
    public void agregarMaterias(Materia ... materias){
        Collections.addAll(this.materias, materias);
    }

    //aprobada
    public boolean aprobada() {
        return this.materias.stream().allMatch(unaMateria -> this.alumno.cumpleCorrelativasDe(unaMateria));
    }
}