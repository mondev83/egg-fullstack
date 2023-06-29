package Servicio;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class ServicioPelicula {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public void cargarPelicula() {

        boolean nuevaPeli = true;

        while (nuevaPeli) {

            Pelicula peli = new Pelicula();

            System.out.println("[CARGAR NUEVA PELICULA]");
            System.out.println("Nombre de la película:");
            peli.setTitulo(sc.next());
            System.out.println("Nombre del director de la película:");
            peli.setDirector(sc.next());
            System.out.println("Cuantas horas dura la película?");
            peli.setDuracion(sc.nextFloat());

            listaPeliculas.add(peli);

            System.out.println("Cargar una nueva película? (s/n)");
            char opcion = sc.next().toLowerCase().charAt(0);

            nuevaPeli = opcion == 's'; // Esta linea reemplaza el if de abajo
            
        }

    }

    public void listaPeliculas() {
        System.out.println("-----------------------");
        System.out.println("[ Lista de Películas ]");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());

        }
    }

    public void peliculasMas1hr() {
        System.out.println("-----------------------");
        System.out.println("[ Películas mayores a 1 hora ]");
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
            }
        }
    }

    public void pelisNomAsc() {
        Collections.sort(listaPeliculas, Comparadores.ordenarPorNombreAsc);
        System.out.println("-----------------------");
        System.out.println("[ Películas por Título (menor a mayor) ]");

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());

        }
    }

    public void pelisDirAsc() {

        Collections.sort(listaPeliculas, Comparadores.ordenarPorDirAsc);
        System.out.println("-----------------------");
        System.out.println("[ Películas por Director (menor a mayor) ]");

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());

        }
    }

    public void pelisDurDesc() {

        Collections.sort(listaPeliculas, Comparadores.ordenarDuracionDesc);
        System.out.println("-----------------------");
        System.out.println("[ Películas por duración (mayor a menor) ]");

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());

        }
    }

    public void pelisDurAsc() {

        Collections.sort(listaPeliculas, Comparadores.ordenarDuracionAsc);
        System.out.println("-----------------------");
        System.out.println("[ Películas por duración (menor a mayor) ]");

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());

        }
    }

    public void mostrarPeliculas() {
        listaPeliculas();
        peliculasMas1hr();
        pelisDurDesc();
        pelisDurAsc();
        pelisNomAsc();
        pelisDirAsc();
    }

}
