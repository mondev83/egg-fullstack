/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej008;

import Entidad.Cadena;
import Servicio.CadenaServicio;

/**
 *
 * @author monde
 */
public class POOEj008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = cs.crearCadena();

        System.out.println("> Cantidad de vocales: " + cs.mostrarVocales(c1));

        System.out.println("> Frase invertida: " + cs.invertirFrase(c1));

        System.out.println("> El caracter se encontro " + cs.vecesRepetido(c1) + " veces.");

        System.out.println("> Hay una diferencia de " + cs.compararLongitud(c1) + " caracteres.");

        System.out.println(cs.unirFrase(c1));

        System.out.println("> Frase reemplazando 'a' por el caracter seleccionado:");
        System.out.println(cs.reemplazar(c1));

        System.out.println("> La frase contiene el caracter ingresado?");
        System.out.println(cs.contiene(c1));

    }

}
