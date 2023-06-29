package Entidad;

import Enumaracion.CursoDepto;
import Enumaracion.EstadoCivil;
import Enumaracion.Seccion;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class PersonalServicio extends Empleado {

    private Seccion seccion; // biblioteca, decanato, secretaría

    public PersonalServicio() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        crearPersona();
        crearEmpleado();
        
        System.out.println("Seleccione la sección: ");
        System.out.println("1. Biblioteca");
        System.out.println("2. Decanato");
        System.out.println("3. Secretaria");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                setSeccion(Seccion.BIBLIOTECA);
                break;
            case 2:
                setSeccion(Seccion.DECANATO);
                break;
            case 3:
                setSeccion(Seccion.SECRETARIA);
                break;
        }
    }

    public PersonalServicio(Seccion seccion, int anioIncorporacion, int numDespacho, String nombreCompleto, int dni, EstadoCivil estadoCivil) {
        super(anioIncorporacion, numDespacho, nombreCompleto, dni, estadoCivil);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
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
        return "[Personal Servicio] " + super.toString() + " | Seccion: " + seccion;
    }

}
