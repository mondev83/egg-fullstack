package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Hotel4 extends Hotel {

    protected String nombreRestaurante;
    protected int capacidadRestaurante;
    protected boolean gimnasioA;

    public Hotel4() {

    }

    public Hotel4(String nombreRestaurante, int capacidadRestaurante, boolean gimnasioA, int cantHabitaciones, int numeroCamas, int cantPisos, int precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numeroCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.gimnasioA = gimnasioA;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public boolean isGimnasioA() {
        return gimnasioA;
    }

    public void setGimnasioA(boolean gimnasioA) {
        this.gimnasioA = gimnasioA;
    }
    
    @Override
    public String toString() {
        return "Hotel4{" + "nombreRestaurante=" + nombreRestaurante + 
                ", capacidadRestaurante=" + capacidadRestaurante + ", gimnasioA=" + gimnasioA + ", " + super.toString() + '}';
    }

}
