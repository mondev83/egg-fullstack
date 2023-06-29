import Servicio.NifServicio;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifServicio ns = new NifServicio();
        
        ns.crearNif();
        ns.mostrar();
        
    }
    
}
