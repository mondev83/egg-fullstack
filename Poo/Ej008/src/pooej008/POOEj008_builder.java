/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej008;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class POOEj008_builder {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadena c1 = new Cadena();

        System.out.println("Ingrese una palabra o frase:");
        c1.setCadena(leer.next());
        c1.setLongitud(c1.getCadena().length());

        int cantVocales = mostrarVocales(c1);
        System.out.println("> Cantidad de vocales: " + cantVocales);

        String fraseInv = invertirFrase(c1);
        System.out.println("> Frase invertida: " + fraseInv);

        String cantCar = vecesRepetido(c1);
        System.out.println("> El caracter se encontro " + cantCar + " veces.");

        String longitud = compararLongitud(c1);
        System.out.println("> Hay una diferencia de " + longitud + " caracteres.");

        String concatenar = unirFrase(c1);
        System.out.println("> Frase original + frase nueva: ");
        System.out.println("" + concatenar);

        String reemplazar = reemplazar(c1);
        System.out.println("> Frase reemplazando 'a' por el caracter seleccionado:");
        System.out.println("" + reemplazar);

        String contiene = contiene(c1);
        System.out.println("> La frase contiene el caracter ingresado?");
        System.out.println("" + contiene);

    }

    public static int mostrarVocales(Cadena c1){

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

        StringBuilder frase = new StringBuilder(c1.getCadena());
        
        frase.reverse();
        
        return frase.toString();
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

        frase = c1.getCadena() + " " + frase;

        return frase;
    }

    public static String reemplazar(Cadena c1) {

        System.out.println("Ingrese el caracter con el cuala reemplaza 'a':");
        char letra = leer.next().charAt(0);

       StringBuilder frase = new StringBuilder();

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getCadena().charAt(i) == ('a')) {
                frase.append(letra);
            } else {
                frase.append(c1.getCadena().charAt(i));
            }
        }
        return frase.toString();
    }

    public static String contiene(Cadena c1) {
        System.out.println("Ingrese un caracter para comprobar si esta en la frase:");
        char letra = leer.next().charAt(0);

        boolean buscador = false;

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getCadena().charAt(i) == letra) {
                buscador = true;
                break;
            }
        }
        return Boolean.toString(buscador);
    }

}
