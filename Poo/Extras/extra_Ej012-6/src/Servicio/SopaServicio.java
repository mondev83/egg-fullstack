package Servicio;

import Entidad.Sopa;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class SopaServicio {

    Scanner sc = new Scanner(System.in);
    Sopa sdl = new Sopa();

    public void generarSopa() {

        int filas = 10;
        int columnas = 10;
        char[][] sopa = new char[filas][columnas];
        Random r = new Random();

        for (char[] fila : sopa) {
            for (int j = 0; j < fila.length; j++) {
                fila[j] = (char) (r.nextInt(26)+'A');
            }
        }
        
        sdl.setMatriz(sopa);

        for (char[] fila : sopa) { // itera cada fila de la matriz sopa
            for (char c : fila) { // itera sobre cada carácter en la fila actual
                System.out.print(c + " "); //imprime el caracter seguido de un espacio
            }
            System.out.println(); // imprime un nueva línea para pasar a la siguiente fila
        }

    }
    
    public void agregarPalabras(){
        
        
    }

    public void palabraUsuario() {
        System.out.println("Ingrese la palabra a buscar:");
        String palabra = sc.next();

        if (true) {

        } else {
            System.out.println("La palabra no está en la sopa de letras!");
        }

    }

    public void imprimirSopa() {

    }

    public void reemplazarPalabra() {

    }

    public void invertirSopa() {

    }
}
