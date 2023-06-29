package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author monde
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarPorNombreAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareToIgnoreCase(t1.getTitulo());

        }
    };

    
    public static Comparator<Pelicula> ordenarPorDirAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareToIgnoreCase(t1.getDirector());

        }
    };
    
    public static Comparator<Pelicula> ordenarDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());

        }
    };
    
    public static Comparator<Pelicula> ordenarDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());

        }
    };


}
