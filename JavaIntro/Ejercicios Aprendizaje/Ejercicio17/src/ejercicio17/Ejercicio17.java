/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author monde
 */
public class Ejercicio17 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int num = leer.nextInt();

        int[] vector = new int[num];
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000) + 1;
            if (vector[i] < 10) {
                uno++;
            } else if (vector[i] >= 10 && vector[i] < 100) {
                dos++;
            } else if (vector[i] >= 100 && vector[i] < 1000) {
                tres++;
            } else if (vector[i] >= 1000 && vector[i] < 10000) {
                cuatro++;
            } else {
                cinco++;

            }

        }
        System.out.println(Arrays.toString(vector));
        System.out.println("De un digito: "+uno);
        System.out.println("De dos digitos: "+dos);
        System.out.println("De tres digitos: "+tres);
        System.out.println("De cuatro digitos: "+cuatro);
        System.out.println("De cinco o mas digitos: "+cinco);

    }
}
