package Entidad;

/**
 *
 * @author monde
 */
public final class Residencia extends ExtraHotelero {

    private int cantHabitaciones;
    private boolean precioGremio;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean precioGremio, boolean campoDeportivo, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.precioGremio = precioGremio;
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHabitaciones=" + cantHabitaciones + 
                ", precioGremio=" + precioGremio + ", campoDeportivo=" + campoDeportivo + ", " + super.toString() + '}';
    }

}
