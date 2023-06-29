/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroej05;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class JavaIntroEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para el boolean:");
        boolean bandera = leer.nextBoolean();

        System.out.println("Ingrese un valor para el real:");
        double real = leer.nextDouble();

        System.out.println("Ingrese un caracter:");
        char num = leer.next().charAt(0);

 }
}