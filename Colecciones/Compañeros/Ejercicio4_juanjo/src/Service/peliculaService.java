package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class peliculaService {

    String b = "\u001B[0m"; //borrar      
    String negro = "\033[30m";
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String amarillo = "\033[33m";
    String azul = "\033[34m";
    String magenta = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    String fRojo = "\033[41m";
    String fVerde = "\033[42m";
    String fAmarillo = "\033[43m";
    String fAzul = "\033[44m";
    String fMagenta = "\033[45m";
    String fCeleste = "\033[46m";
    String fGris = "\033[47m";
//Después de ese bucle realizaremos las siguientes acciones:
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Pelicula p1 = new Pelicula();
    private ArrayList<Pelicula> peli;

    public peliculaService() {
        this.peli = new ArrayList<>();

    }

    public void pelicula() {

//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
        String x;
        do {

            System.out.println("Ingrese el titulo de la pelicula: ");
            String titulo = sc.next();
            System.out.println("Ingrese el director: ");
            String director = sc.next();
            System.out.println("Ingrese la duracion de la pelicula: ");
            Double duracion = sc.nextDouble();

            peli.add(new Pelicula(titulo, director, duracion));

            System.out.println("Desea ingresar otra pelicula? (s/n)");
            x = sc.next();
        } while (x.equalsIgnoreCase("s"));

//Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    }

//Mostrar en pantalla todas las películas.
    public void mostrarPelicula() {
        System.out.println("Todas las peliculas: ");
        for (Pelicula aux : peli) {
            System.out.println(magenta + aux + b);
        }
        System.out.println("");
    }

//Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mayorPelicula() {
        System.out.println("Peliculas mayores a una hora: ");
        for (Pelicula aux : peli) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }

        }
        System.out.println("");
    }
//Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.

    public void duracionME() {
        System.out.println("Peliculas segun su duracion de MENOR A MAYOR");
        Collections.sort(peli, (p1, p2) -> Double.compare(p1.getDuracion(), p2.getDuracion()));
        for (Pelicula aux : peli) {
            System.out.println(rojo + aux + b);
        }
        System.out.println("");
    }
//Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.

    public void duracionMA() {
        System.out.println("Peliculas segun su duracion de MAYOR A MENOR");
        Collections.sort(peli, (p1, p2) -> Double.compare(p2.getDuracion(), p1.getDuracion()));
        for (Pelicula aux : peli) {
            System.out.println(verde + aux + b);
        }
        System.out.println("");
    }
//Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.    

    public void porTitulo() {
        System.out.println("Peliculas ordenadas alfabeticamente segun el TITULO");

        Collections.sort(peli, (p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
        for (Pelicula aux : peli) {
            System.out.println(azul + aux + b);
        }
        System.out.println("");
    }

    public void porDirector() {
        System.out.println("Peliculas ordenadas alfabeticamente segun el DIRECTOR");

        Collections.sort(peli, (p1, p2) -> p1.getDirector().compareTo(p2.getDirector()));
        for (Pelicula aux : peli) {
            System.out.println(celeste + aux + b);
        }
        System.out.println("");
    }

}
