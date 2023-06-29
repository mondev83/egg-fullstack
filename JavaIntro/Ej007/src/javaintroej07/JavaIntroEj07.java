/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroej07;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class JavaIntroEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

   
        System.out.println("Seleccione una opcion:");
        System.out.println("1 - Bomba de agua");
        System.out.println("2 - Bomba de gasolina");
        System.out.println("3 - Bomba de hormigon");
        System.out.println("4 - Bomba de pasta alimenticia");
        System.out.println("");
        
        int motor = leer.nextInt();

        switch (motor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasata alimenticia");
                break;
            default:
                System.out.println(motor + " no es una opcion valida!");
        }
    }

}