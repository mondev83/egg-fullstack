package Service;

import java.util.Scanner;
import Entidad.Curso;

public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {

        Curso curso = new Curso();

        System.out.print("Nombre del curso: ");
        curso.setNombreCurso(leer.next());

        System.out.print("Horas por día: ");
        curso.setCantidadHorasPorDia(leer.nextInt());

        System.out.print("Días por semana: ");
        curso.setCantidadDiasPorSemana(leer.nextInt());

        System.out.print("Turno (Mañana/Tarde): ");
        curso.setTurno(leer.next());

        System.out.print("Precio por hora: ");
        curso.setPrecioPorHora(leer.nextInt());

        cargarAlumnos(curso);

        return curso;
    }

    public void cargarAlumnos(Curso curso) {

        String[] nombreAlumnos = new String[5];

        for (int i = 0; i < nombreAlumnos.length; i++) {
            System.out.print("Ingrese nombre del alumno " + (i + 1) + ": ");
            nombreAlumnos[i] = leer.next();
        }
        curso.setAlumnos(nombreAlumnos);
    }

    public void calcularGananciaSemanal(Curso curso) {

        double ganancia = curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getPrecioPorHora() * 5;

        System.out.println(" Ganancia semanal del curso: $" + ganancia);
    }
}
