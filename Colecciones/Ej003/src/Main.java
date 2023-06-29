
import Servicio.ServicioAlumno;


/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlumno serv = new ServicioAlumno();
        
        serv.crearAlumno();
        serv.buscarAlumno();
    }
    
}
