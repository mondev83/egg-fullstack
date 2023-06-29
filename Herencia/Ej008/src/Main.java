
import Servicio.ServicioPersona;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona srv = new ServicioPersona();

        //srv.constructorParametros();
        srv.constructorVacio();
        srv.modificarPersona();
        srv.listadoPersonas();

    }
}
