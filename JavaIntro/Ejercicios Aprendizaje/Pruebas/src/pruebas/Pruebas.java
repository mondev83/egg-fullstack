/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int num;
Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero entero positivo"); 
            num = leer.nextInt();
            if (num>1000) {
                System.out.println("El programa podria tardar, está seguro? (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")) {
                    break;
                }
                
            }
            
        } while (num <= 0 || num > 1000);
    }
    
}
