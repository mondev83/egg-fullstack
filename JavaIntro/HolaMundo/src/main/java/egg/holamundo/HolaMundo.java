/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.holamundo;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class HolaMundo {

    public static void main(String[] args) {
        //Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una variable String (cadena) que se utiliza para leer datos del usuario
        String nombre;
        //Muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre:");
        //Leemos el nombre de la persona y lo guardamos en la variable
        nombre = leer.next();
        //Mostramos por consola el saludo personalizado
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
    }
}
