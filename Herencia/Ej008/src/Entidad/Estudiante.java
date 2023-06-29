package Entidad;

import Enumaracion.CursoDepto;
import Enumaracion.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Estudiante extends Persona {

    private CursoDepto curso;

    public Estudiante() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        crearPersona();
        System.out.println("# Curso #");
        System.out.println("1. Matematicas");
        System.out.println("2. Lenguajes");
        System.out.println("3. Arquitectura");
        System.out.println("4. FullStack");
        System.out.print("» ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                this.curso = CursoDepto.MATEMATICA;
                break;
            case 2:
                this.curso = CursoDepto.LENGUAJES;
                break;
            case 3:
                this.curso = CursoDepto.ARQUITECTURA;
                break;
            case 4:
                this.curso = CursoDepto.FULLSTACK;
                break;
        }
    }

    public Estudiante(CursoDepto curso, String nombreCompleto, int dni, EstadoCivil estadoCivil) {
        super(nombreCompleto, dni, estadoCivil);
        this.curso = curso;
    }

    public CursoDepto getCurso() {
        return curso;
    }

    public void setCurso(CursoDepto curso) {
        this.curso = curso;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "[Estudiante] " + super.toString() + " | Curso: " + curso;
    }

}
