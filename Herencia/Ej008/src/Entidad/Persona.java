package Entidad;

import Enumaracion.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public abstract class Persona {

    protected String nombreCompleto;
    protected int dni;
    protected EstadoCivil estadoCivil;

    public Persona() {
    }

    public Persona(String nombreCompleto, int dni, EstadoCivil estadoCivil) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
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

    public void crearPersona() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Nombre y Apellido: ");
        nombreCompleto = sc.next();
        System.out.print("DNI: ");
        dni = sc.nextInt();
        System.out.println("Estado civil: ");
        System.out.println("1. Soltero");
        System.out.println("2. Casado");
        System.out.println("3. Divociado");
        System.out.println("4. Viudo");
        System.out.print("» ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                setEstadoCivil(EstadoCivil.SOLTERO);
                break;
            case 2:
                setEstadoCivil(EstadoCivil.CASADO);
                break;
            case 3:
                setEstadoCivil(EstadoCivil.DIVORCIADO);
                break;
            case 4:
                setEstadoCivil(EstadoCivil.VIUDO);
                break;
        }
    }

    @Override
    public String toString() {
        return "Nombre Completo: " + nombreCompleto + " | Dni: " + dni + " | Estado Civil: " + estadoCivil;
    }

}
