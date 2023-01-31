/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     *
     * Realizar un programa que solo permita introducir frases o palabras de 8
     * de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
     * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
     * Lenght() en Java.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase de hasta 8 caracteres:");
        String frase = leer.nextLine();
        
        if (frase.length()==8){
            System.out.println("CORRECTO");
        }  else{
            System.out.println("INCORRECTO");
        }
    }

}
