/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a converir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void).
 *
 * El cambio de divisas es: 0.86 libras es un 1 € 1.28611 $ es un 1 € 129.852
 * yenes es un 1 €
 *
 * @author monde
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantida de euros a convertir:");
        double euro = leer.nextInt();

        System.out.println("Seleccione que cambio quiere:");
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        System.out.println("4. Salir");

        byte moneda = leer.nextByte();

        conversor(euro, moneda);
    }

    public static void conversor(double euro, byte moneda) {

        switch (moneda) {
            case 1:
                double libras = (0.86 * euro);
                System.out.println("Libras: " + libras);
                break;
            case 2:
                double dolares = (1.28611 * euro);
                System.out.println("Dolares: " + dolares);
                break;
            case 3:
                double yenes = (129.852 * euro);
                System.out.println("Yenes: " + yenes);
                break;
            case 4:
                break;
            default:
                System.out.println("No es un numero valido");
        }
    }
}
