package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.print("Ingrese Nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese fecha de nacimiento");
        System.out.print("Dia: ");
        p1.setDia(leer.nextInt());
        System.out.print("Mes: ");
        p1.setMes(leer.nextInt());
        System.out.print("Año: ");
        p1.setAnio(leer.nextInt());
        return p1;

    }

    public static void calcularEdad(Persona p1) {

        Date fechaNac = new Date(p1.getAnio() - 1900, p1.getMes() - 1, p1.getDia());
        Date fechaActual = new Date();
        long dif = fechaActual.getTime() - fechaNac.getTime();
        p1.setEdad((int) (dif / (1000 * 60 * 60 * 24 * 365L)));

    }

    public boolean menorQue(Persona p1) {
        System.out.print("Ingrese otra edad: ");
        int edadNueva = leer.nextInt();
        
        System.out.print("La segunda edad es menor? ");
        
        if (p1.getEdad() < edadNueva) {
            return true;
        } else {
            return false;
        }

    }

    public String mostrarPersona(Persona p1) {
        calcularEdad(p1);
        return p1.toString();
    }
}
