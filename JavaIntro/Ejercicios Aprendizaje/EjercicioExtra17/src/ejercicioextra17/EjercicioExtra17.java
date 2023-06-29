/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioextra17;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class EjercicioExtra17 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingrese un número: ");
        numero = scanner.nextInt();
        if (primo(numero)) {
            System.out.println(numero + " ES primo");
        } else {
            System.out.println(numero + " NO es primo");
        }
    }

    public static boolean primo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no es primo
            if (numero % x == 0) {
                return false;
            }
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }
}
