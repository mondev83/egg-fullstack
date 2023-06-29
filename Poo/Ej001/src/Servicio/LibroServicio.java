/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class LibroServicio {

    public static Libro cargarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // Instanciamos un obejeto libro con sus atributos
        Libro lib1 = new Libro();

        System.out.println("Ingrese el ISBN del libro:");
        lib1.setIsbn(leer.nextInt());
        System.out.println("Ingrese el nombre del libro:");
        lib1.setNombre(leer.next());
        System.out.println("Ingrese el autor del libro:");
        lib1.setAutor(leer.next());
        System.out.println("Ingrese cantidad de paginas del libro:");
        lib1.setPaginas(leer.nextInt());

        return lib1;
    }

    public void mostraLibro(Libro lib1) {

        System.out.println("-------------");
        System.out.println("DATOS DEL LIBRO");
        System.out.println("ISBN: " + lib1.getIsbn());
        System.out.println("Nombre: " + lib1.getNombre());
        System.out.println("Autor(a): " + lib1.getAutor());
        System.out.println("Cant páginas: " + lib1.getPaginas());
    }
}
