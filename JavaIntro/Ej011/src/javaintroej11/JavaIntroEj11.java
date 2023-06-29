/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroej11;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class JavaIntroEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase para cambiar sus vocales:");
        String frase = leer.nextLine();

        String retorno = frase2(frase);
        System.out.println(retorno);
    }

    public static String frase2(String frase) {

        frase = frase.toLowerCase();
        String frase2 = "";

        for (int i = 0; i < frase.length(); i++) {
            char controlador = frase.charAt(i);
            switch (controlador) {
                case 'a':
                    frase2 += "@";
                    break;
                case 'e':
                    frase2 += "#";
                    break;
                case 'i':
                    frase2 += "$";
                    break;
                case 'o':
                    frase2 += "%";
                    break;
                case 'u':
                    frase2 += "*";
                    break;
                default:
                    frase2 += controlador;
                    break;
            }

        }
        return frase2;
    }

}
