
import Servicio.ServicioJugador;


/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioJugador serv = new ServicioJugador();
        
        serv.generarJugadores();
        serv.mostrarJugadores();
        serv.consultarJugador();
        serv.consultarJugadores();
        serv.unionConjuntos();
        serv.eliminarJugadores2();
        serv.mostrarJugadores();
    }
    
}
