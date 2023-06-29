
import Entidad.Auto;
import Servicio.AutoServicio;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoServicio as = new AutoServicio();
        Auto ficha = as.cargarAuto();
        as.cambioTitular();
        as.nuevoTrayecto();
        as.serviceVehiculo();
        as.mostraFicha();

    }

}
