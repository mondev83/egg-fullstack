package Entidad;

/**
 *
 * @author monde
 */
public abstract class Hotel extends Alojamiento {

    protected int cantHabitaciones;
    protected int numeroCamas;
    protected int cantPisos;
    protected int precioHabitacion;

    public Hotel() {

    }

    public Hotel(int cantHabitaciones, int numeroCamas, int cantPisos, int precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

}
