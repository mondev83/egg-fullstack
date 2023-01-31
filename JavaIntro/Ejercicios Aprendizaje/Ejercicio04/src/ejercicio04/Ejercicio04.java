/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     *
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
     * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese grados centigrados:");
        double C = leer.nextDouble();

        double F = C + (9 * C / 5);
        System.out.println("El equivalente en Fahrenheit es: "+F+"°F");
    }

}
