/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej010;

import java.util.Arrays;

/**
 *
 * @author monde
 */
public class POOEj010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        // Inicializar arregloA
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 30 + 10;
        }

        // arregloA aletorio sin decimales, sino sacar int de la linea 30.
        System.out.print("Arreglo A aleatorio: ");
        for (double i : arregloA) {
            System.out.print((int) i + ", ");
        }
        System.out.println("");

        // arregloA de menor a mayor
        Arrays.sort(arregloA);

        // Primeros 10 números al arregloB y el resto con 0.5
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
            for (int j = 10; j < arregloB.length; j++) {
                arregloB[j] = 0.5;
            }
        }

        // arregloA ordenado y arregloB combinado
        System.out.println("Arreglo A ordenado: " + Arrays.toString(arregloA));
        System.out.println("Arreglo B combinado: " + Arrays.toString(arregloB));

    }
}
