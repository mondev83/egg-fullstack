/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej007;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * Inicializar un objeto de la clase Persona a null y tratar de invocar el
 * método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con
 * una cláusula try-catch para probar la nueva excepción que debe ser
 * controlada.
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();

        int peso[] = new int[4];
        boolean edad[] = new boolean[4];

        Persona persona = null;

        try {
            ps.esMayorDeEdad(persona);
        } catch (Exception e) {
            System.out.println("Error!");
            System.out.println("fill " + e.fillInStackTrace());
            //e.printStackTrace();

        }
    }
}
