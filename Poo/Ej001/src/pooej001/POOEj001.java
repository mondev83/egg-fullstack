/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej001;

import Entidad.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author monde
 */
public class POOEj001 {

    public static void main(String[] args) {
        LibroServicio ls = new LibroServicio();
        Libro lib1 = ls.cargarLibro();
        ls.mostraLibro(lib1);

    }
}
