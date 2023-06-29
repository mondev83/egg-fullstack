/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroej09;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class JavaIntroEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cont = 1;
        int suma = 0;

        do {
            System.out.println(cont + ". Ingrese un numero:");
            int numero = leer.nextInt();

            if (numero > 0) {
                suma = suma + numero;
                cont = cont + 1;
            } else if (numero < 0) {
                cont = cont + 1;
            } else {
                System.out.println("Se capturó el numero cero");
                break;
            }
        } while (cont < 21);

        System.out.println("La suma de los numero es: " + suma);

    }
}