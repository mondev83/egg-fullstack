
import Entidad.Fraccion;
import Servicio.FraccionServicio;


/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FraccionServicio fs = new FraccionServicio();
        Fraccion frac = fs.ingresarNum();
        
        fs.menu(frac);
    }
    
}
