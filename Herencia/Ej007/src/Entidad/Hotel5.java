package Entidad;

/**
 *
 * @author monde
 */
public final class Hotel5 extends Hotel4 {

    private int capacidadSalon;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public Hotel5() {
    }

    public Hotel5(int capacidadSalon, int cantidadSuites, int cantidadLimosinas, String nombreRestaurante, int capacidadRestaurante, boolean gimnasioA, int cantHabitaciones, int numeroCamas, int cantPisos, int precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombreRestaurante, capacidadRestaurante, gimnasioA, cantHabitaciones, numeroCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.capacidadSalon = capacidadSalon;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCapacidadSalon() {
        return capacidadSalon;
    }

    public void setCapacidadSalon(int capacidadSalon) {
        this.capacidadSalon = capacidadSalon;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "capacidadSalon=" + capacidadSalon + 
                ", cantidadSuites=" + cantidadSuites + ", cantidadLimosinas=" + cantidadLimosinas + ", " + super.toString() + '}';
    }

}
