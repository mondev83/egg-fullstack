/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     *
     * Crear un programa que pida una frase y si esa frase es igual a “eureka”
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
     * Incorrecto. Nota: investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String frase2 = "eureka";

        System.out.println("Ingrese una frase:");
        String frase = leer.next();

        System.out.println(frase.equals(frase2));

    }
}
