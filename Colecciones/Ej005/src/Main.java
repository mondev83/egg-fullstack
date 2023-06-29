
import Servicio.ServicioPais;
import Servicio.ServicioPaisObj;


/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ServicioPais serv = new ServicioPais();
        ServicioPaisObj serv = new ServicioPaisObj();
        
        serv.nuevoPais();
        serv.eliminarPais();
    }
    
}
