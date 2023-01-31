/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroej14;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class JavaIntroEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de jugadores:");
        int x = leer.nextInt();

        String[] equipo = new String[x];

        System.out.println("Cantidad de jugadores: " + x);

        for (int i = 0; i < x; i++) {
            System.out.println("Ingrese el nombre del compañero " + (i + 1));
            equipo[i] = leer.next();
        }

        System.out.println("Nombre de los compañeros de equipo: ");
        for (int i = 0; i < x; i++) {

            System.out.print(equipo[i] + ", ");
        }
    }
}
