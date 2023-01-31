/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 *
 * @author monde
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String FDE = "&&&&&"; // variable para finalizar el envio
        String cadena = ""; 
        int x = 0; // sequencias correctas
        int y = 0; // sequencias incorrectas

        System.out.println("Simule el funcionamiento de un dispositivo RS232");

        do {
            System.out.print("Ingrese la sequencia: ");
            cadena = leer.next().toUpperCase();

            if (cadena.length() <= 5 && !cadena.equals(FDE)) {

                if (cadena.startsWith("X") && cadena.endsWith("O")) {
                    x++;
                } else {
                    y++;
                }
                
            }else{
                System.out.println("Maximo 5 caracteres!");
            }
            if (cadena.equals(FDE)) {
                System.out.println("");
                System.out.println("Finalizo la simulacion! (ref.&&&&&)");
            }
        } while (!FDE.equals(cadena));

        System.out.println("Sequencias correctas: " + x);
        System.out.println("Sequencias incorrectas: " + y);

    }
}
