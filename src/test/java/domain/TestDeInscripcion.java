package domain;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

public class TestDeInscripcion {

    private Alumno alumno;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    @Before
    public void setUp() {
        alumno = new Alumno();
        alumno.setNombre("Juan");
        alumno.setLegajo(1234);
        alumno.setMateriasAprobadas(new HashSet<>());

        materia1 = new Materia();
        materia1.setNombre("Algoritmos y Estructuras de Datos");
        materia1.setCorrelativas(new ArrayList<>());

        materia2 = new Materia();
        materia2.setNombre("Paradigmas de Programación");
        materia2.setCorrelativas(new ArrayList<>());
        materia2.getCorrelativas().add(materia1);

        materia3 = new Materia();
        materia3.setNombre("Diseño de Sistemas");
        materia3.setCorrelativas(new ArrayList<>());
        materia3.getCorrelativas().add(materia1);
        materia3.getCorrelativas().add(materia2);
    }

    @Test
    public void testAgregarMateria() {
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(materia1, materia2);
        assertEquals(2, inscripcion.getMaterias().size());
    }

    @Test
    public void testDesaprobadaPorNoTenerLasCorrelativas() {
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(materia1, materia2);
        assertFalse(inscripcion.aprobada());
    }

    @Test
    public void testDesaprobadaPorNoTenerAlgunaCorrelativa() {
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(materia3);
        alumno.agregarMateriasAprobadas(materia1);
        assertFalse(inscripcion.aprobada());
    }

    @Test
    public void testAprobadaPorTenerLasCorrelativa() {
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(materia3);
        alumno.agregarMateriasAprobadas(materia1);
        alumno.agregarMateriasAprobadas(materia2);
        assertTrue(inscripcion.aprobada());
    }



}
