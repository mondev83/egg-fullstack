/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroej06;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class JavaIntroEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num1 = leer.nextInt();

        System.out.println("Ingrese otro numero entero:");
        int num2 = leer.nextInt();

        int num3 = 25;

        if (num1 <= num3 && num2 <= num1) {
            System.out.println("Ninguno de los numeros es mayor a "+num3);
        } else if (num1 > num3 && num2 > num3) {
            System.out.println("Los dos numeros son mayores a "+num3);
        } else if (num1 <= num3 && num2 > num3) {
            System.out.println("El numero " + num2 + " es mayor a "+num3);
        } else  {
            System.out.println("El numero " + num1 + " es mayor a "+num3);
        }
    }
}
