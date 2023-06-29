package EjLibros;

import java.util.ArrayList;

/**
 *
 * @author monde
 */
public class ListaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> libros = new ArrayList<>();

        libros.add("The Pragmatic Programmer");
        libros.add("Head First Java");
        libros.add("Head First Design Patterns");
        libros.add("Effective Java");
        libros.add("Java Concurrency in Practice");
        libros.add("Java Generics and Collections");
        libros.add("Java Performance From Binu John");
        libros.add("Java Puzzlers");
        libros.add("Head First Object-Oriented Analysis and Design");
        libros.add("Thinking in Java");

        System.out.println("[ Top10 libros JAVA ]");
        System.out.println("");
        for (String libro : libros) {
            System.out.println(" » " + libro);
        }
        
    }
}
