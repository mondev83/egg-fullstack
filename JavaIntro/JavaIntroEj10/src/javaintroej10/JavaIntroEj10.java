/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroej10;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class JavaIntroEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        for (int i = 0; i < 4; i++) {
            
            System.out.println("Ingrese un numero del 1 al 20:");
            int num = leer.nextInt();
            
            int cont = 0; // contador dentro del for para que se reinicie 
            
            if (num<1 || num>20){
                System.out.println("Ingrese un numero valido");
                num = leer.nextInt();
            }
            
            System.out.print(num + " ");
            do {
                System.out.print("*");
                cont = cont + 1;
            } while (cont <= num);
            System.out.println("");
        }
    }
}