/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     *
     * Crear un programa que dado un numero determine si es par o impar.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero para determinar si es par o no:");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }
    }
}
