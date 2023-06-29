package Entidad;

import Enumaracion.CursoDepto;
import Enumaracion.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Profesor extends Empleado {

    private CursoDepto departamento; // lenguajes, matemáticas, arquitectura 

    public Profesor() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        crearPersona();
        crearEmpleado();
        
        System.out.println("Seleccione el departamento: ");
        System.out.println("1. Matematica");
        System.out.println("2. Lenguajes");
        System.out.println("3. Arquitectura");
        System.out.println("4. FullStack");
        System.out.print("» ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                this.departamento = CursoDepto.MATEMATICA;
                break;
            case 2:
               this.departamento = CursoDepto.LENGUAJES;
                break;
            case 3:
                this.departamento = CursoDepto.ARQUITECTURA;
                break;
            case 4:
                this.departamento = CursoDepto.FULLSTACK;
                break;
        }        
    }

    public Profesor(CursoDepto departamento, int anioIncorporacion, int numDespacho, String nombreCompleto, int dni, EstadoCivil estadoCivil) {
        super(anioIncorporacion, numDespacho, nombreCompleto, dni, estadoCivil);
        this.departamento = departamento;
    }

    public CursoDepto getDepartamento() {
        return departamento;
    }

    public void setDepartamento(CursoDepto departamento) {
        this.departamento = departamento;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
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
        return "[Profesor] " + super.toString() + "| Departamento: " + departamento;
    }

}
