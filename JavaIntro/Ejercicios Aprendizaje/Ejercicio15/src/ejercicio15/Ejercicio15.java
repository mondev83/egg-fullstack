/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Arrays;
import java.util.Collections;

/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 *
 * @author monde
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer[] vector = new Integer[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i+1;
        }
        System.out.println("Cadena original : "
                + Arrays.toString(vector));

        // sorting Integer array in descending order
        Arrays.sort(vector, Collections.reverseOrder());
        System.out.println("Orden descendente: "
                + Arrays.toString(vector));

    }
}
