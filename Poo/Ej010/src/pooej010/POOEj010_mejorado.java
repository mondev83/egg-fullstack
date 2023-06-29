/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej010;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author monde
 */
public class POOEj010_mejorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        // Inicializar arregloA
        Random random = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextDouble() * 100;
        }

        // arregloA aleatorio
        System.out.println("Arreglo A aleatorio: " + Arrays.toString(arregloA));

        // arregloA de menor a mayor
        Arrays.sort(arregloA);

        // Copio los datos desde index 0 al 10 del arregloA al arregloB.
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        //arregloB = Arrays.copyOfRange(arregloA, 0, 10);

        // Completo el arregloB del index 10 al 20 con 0.5.
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);

        // arregloA ordenado y arregloB combinado
        System.out.println("Arreglo A ordenado: " + Arrays.toString(arregloA));
        System.out.println("Arreglo B combinado: " + Arrays.toString(arregloB));
    }
}
