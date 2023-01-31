/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     *
     * Escribir un programa que lea un número entero por teclado y muestre por
     * pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
     * investigar la función Math.sqrt().
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        int num = leer.nextInt();

        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);

        System.out.println(doble + "\n" + triple + "\n" + raiz);

    }

}
