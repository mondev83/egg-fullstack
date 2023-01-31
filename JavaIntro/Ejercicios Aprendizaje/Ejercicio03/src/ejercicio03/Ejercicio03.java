/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     *
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
     * después toda en minúsculas. Nota: investigar la función toUpperCase() y
     * toLowerCase() en Java.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine().toLowerCase();
        System.out.println("");
        
        System.out.println("Frase en minusculas: "); 
        System.out.println(frase);
        System.out.println("");
        
        System.out.println("Frase en mayusculas: ");
        System.out.println(frase.toUpperCase());
        

    }

}
