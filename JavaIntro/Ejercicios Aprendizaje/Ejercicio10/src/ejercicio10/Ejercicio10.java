/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 *
 * @author monde
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese un valor limite positivo:");
        int valor = leer.nextInt();

        if (valor > 0) {
            System.out.println("Ingrese numeros a sumar, hasta superar " + valor);
            do {
                int num = leer.nextInt();
                suma = suma + num;
            } while (suma < valor);
            System.out.println("La suma de los numeros es " + suma + " y supero el valor inicial de " + valor);

        } else {
            System.out.println("El valor es incorrecto!");
        }
    }
}
