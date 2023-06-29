
import Servicio.ServicioPelicula;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPelicula servPeli = new ServicioPelicula();
        
        servPeli.cargarPelicula();
        servPeli.mostrarPeliculas();

    }

}
