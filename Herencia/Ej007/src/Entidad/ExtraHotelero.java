package Entidad;

/**
 *
 * @author monde
 */
public class ExtraHotelero extends Alojamiento{
    
    protected boolean privado;
    protected int metrosCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }


    
}
