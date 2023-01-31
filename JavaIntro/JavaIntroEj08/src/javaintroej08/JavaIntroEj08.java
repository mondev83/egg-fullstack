/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroej08;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class JavaIntroEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una nota entre 0 y 10:");
        int nota = leer.nextInt();
        
        while (nota<0 || nota>10){
            System.out.println("La nota no es validad, intentelo nuevamente:");
            nota = leer.nextInt();
            
        }
        System.out.println("La nota ingresada es "+nota);
    }
    
}
