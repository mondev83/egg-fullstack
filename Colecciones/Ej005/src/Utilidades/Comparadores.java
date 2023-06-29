package Utilidades;

import Entidad.Pais;
import java.util.Comparator;

/**
 *
 * @author monde
 */
public class Comparadores {
    
    public static Comparator<Pais> ordenarPorNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareToIgnoreCase(t1.getNombre());
        }
    };
}
