/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej007;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author monde
 */
public class POOEj007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();

        int peso[] = new int[4];
        boolean edad[] = new boolean[4];
        
        Persona p1 = new Persona("Juan", 38, 'H', 80, 1.70f);
        Persona p2 = new Persona("Diego", 17, 'H', 75, 1.90f);
        Persona p3 = new Persona("Silvia", 10, 'M', 35, 1.30f);
        Persona p4 = new Persona("Luque", 15, 'O', 40, 1.50f);

        //System.out.println("Persona N1");
       //Persona p1 = ps.crearPersona();
        peso[0] = (ps.calcularIMC(p1));
        edad[0] = (ps.esMayorDeEdad(p1));

        //System.out.println("Persona N2");
        //Persona p2 = ps.crearPersona();
        peso[1] = (ps.calcularIMC(p2));
        edad[1] = (ps.esMayorDeEdad(p2));

       // System.out.println("Persona N3");
        //Persona p3 = ps.crearPersona();
        peso[2] = (ps.calcularIMC(p3));
        edad[2] = (ps.esMayorDeEdad(p3));

        //System.out.println("Persona N4");
        //Persona p4 = ps.crearPersona();
        peso[3] = (ps.calcularIMC(p4));
        edad[3] = (ps.esMayorDeEdad(p4));

        ps.porcentaje(peso, edad);
    }

}
