/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej006;

import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class POOEj006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        byte menu;

        do {

            System.out.println("");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Seleccione un opcion: ");
            menu = leer.nextByte();
            System.out.println("");
            switch (menu) {

                case 1:
                    cs.llenarCafetera();
                    continue;
                case 2:
                    cs.servirTaza();
                    continue;
                case 3:
                    cs.vaciarCafetera();
                    continue;
                case 4:
                    cs.agregarCafe();
                    continue;
                case 5:
                    System.out.println("== Saliendo ==");
                    break;
                default:
                    System.out.println(menu + " no es una opcion valida.");
            }

        } while (5 != menu);
    }
}
