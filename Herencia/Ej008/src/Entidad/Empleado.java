package Entidad;

import Enumaracion.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public abstract class Empleado extends Persona {

    protected int anioIncorporacion;
    protected int numDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int numDespacho, String nombreCompleto, int dni, EstadoCivil estadoCivil) {
        super(nombreCompleto, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
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

    public void crearEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Año de incorporacion : ");
        anioIncorporacion = sc.nextInt();
        System.out.print("Numero de despacho: ");
        numDespacho = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + " | Año Incorporacion: " + anioIncorporacion + " | Num Despacho: " + numDespacho;
    }

}
