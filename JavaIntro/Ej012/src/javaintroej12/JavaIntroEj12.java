/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroej12;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class JavaIntroEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer valor:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor:");
        int num2 = leer.nextInt();
        
        esMultiplo(num1,num2);

    }

    public static void esMultiplo(int num1, int num2) {
        if (num1%num2 == 0) {
            System.out.println("ES multiplo!");
        } else {
            System.out.println("NO es multiplo!");
        }
    }
}
