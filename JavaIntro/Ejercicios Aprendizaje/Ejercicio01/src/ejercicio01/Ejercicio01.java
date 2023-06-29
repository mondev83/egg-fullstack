/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el valor del segundo numero:");
        int num2 = leer.nextInt();

        int num3 = num1 + num2;

        System.out.println("La suma de los dos valores es: " + num3);        

    }

}
