/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por
 * ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
 * siguiente:
 *
 *        * * * *
 *        * *
 *        * *
 *        * * * *
 *
 * @author monde
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor N: ");
        int n = leer.nextInt();
        System.out.println();

        if (n >= 2 && n <= 10) {
            // Linea superior
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();

            // Espacio central
            for (int i = 0; i < n - 2; i++) {
                System.out.print("* "); // posicion filas
                for (int j = 0; j < n - 2; j++) {
                    System.out.print("  ");
                }
                System.out.println("*"); // ultima psocion y salto de linea
            }

            //Linea inferior
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.println();
            
        } else {
            System.out.println("Ingrese un numero entre 2 y 10");
        }
    }
}
