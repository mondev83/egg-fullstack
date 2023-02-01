/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = leer.nextInt();

        String salir = "";

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int x = leer.nextInt(); // x para la opcion del menu.

            switch (x) {
                case 1:
                    System.out.println(num1 + " + " + num2 + ": " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + ": " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + ": " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + ": " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir = leer.next();
                    if ("S".equalsIgnoreCase(salir)) {
                        break;
                    } else if ("N".equalsIgnoreCase(salir)){
                        salir="";
                        continue;
                    }
                default:
                    System.out.println("No existe la opcion en el menu!");
            }

        } while ("".equals(salir));
    }
}
