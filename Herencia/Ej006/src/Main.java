
import Servicio.ServicioEdificio;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioEdificio srv = new ServicioEdificio();

        srv.crearEdificiosPar();
        srv.mostrarResumen();
        srv.mostrarOficinas();
        srv.mostrarPoli();
    }

}
