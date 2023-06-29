/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class CadenaServicio {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {

        Cadena c1 = new Cadena();

        System.out.println("Ingrese una palabra o frase:");
        c1.setCadena(leer.next());
        c1.setLongitud(c1.getCadena().length());

        return c1;
    }

    public static int mostrarVocales(Cadena c1) {

        int vocales = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {

            // Con el char, aparentemente no toma los acentos.
            switch (c1.getCadena().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vocales++;
                    break;
            }
        }
        return vocales;
    }

    public static String invertirFrase(Cadena c1) {

        String frase = "";

        for (int i = c1.getLongitud(); i > 0; i--) {
            frase += c1.getCadena().substring(i - 1, i);

        }
        return frase;
    }

    public static String vecesRepetido(Cadena c1) {

        System.out.println("Ingrese el caracter a buscar en la frase:");
        char letra = leer.next().charAt(0);

        int caracter = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {

            if (c1.getCadena().charAt(i) == letra) {
                caracter++;
            }

        }
        return String.valueOf(caracter);
    }

    public static String compararLongitud(Cadena c1) {

        System.out.println("Ingrese la frase para comparar la longitud: ");
        String frase = leer.next();
        int dif;
        if (frase.length() > c1.getLongitud()) {
            dif = frase.length() - c1.getLongitud();
        } else {
            dif = c1.getLongitud() - frase.length();
        }

        return String.valueOf(dif);
    }

    public static String unirFrase(Cadena c1) {

        System.out.println("Ingrese una frase para unirla a la principal:");
        String frase = leer.next();

        return frase = c1.getCadena() + " " + frase;

    }

    public static String reemplazar(Cadena c1) {

        System.out.println("Ingrese el caracter con el cual se reemplaza 'a':");
        char letra = leer.next().charAt(0);

        String frase = "";

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getCadena().charAt(i) == ('a')) {
                frase += letra;
            } else {
                frase += c1.getCadena().charAt(i);
            }
        }
        return frase;
    }

    public static String contiene(Cadena c1) {
        System.out.println("Ingrese un caracter para comprobar si esta en la frase:");
        char letra = leer.next().charAt(0);

        boolean buscador = false;

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getCadena().charAt(i) == letra) {
                buscador = true;
            }
        }
        return Boolean.toString(buscador);
    }

}
