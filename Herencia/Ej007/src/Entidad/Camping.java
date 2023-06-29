package Entidad;

/**
 *
 * @author monde
 */
public final class Camping extends ExtraHotelero {

    private int maxCarpas;
    private int cantBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int maxCarpas, int cantBanios, boolean restaurante, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "maxCarpas=" + maxCarpas + 
                ", cantBanios=" + cantBanios + ", restaurante=" + restaurante + ", " + super.toString() + '}';
    }

}
