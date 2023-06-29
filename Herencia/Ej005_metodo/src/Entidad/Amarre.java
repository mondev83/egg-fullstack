package Entidad;

import java.time.LocalDate;

/**
 *
 * @author monde
 */
public class Amarre{
    private String nombre;
    private int dni;
    private LocalDate fechaAquiler;
    private LocalDate fechaDevolucion;
    private String posicion;
    private String tipoBarco;

    public Amarre() {
    }

    public Amarre(String nombre, int dni, LocalDate fechaAquiler, LocalDate fechaDevolucion, String posicion, String tipoBarco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAquiler = fechaAquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicion = posicion;
        this.tipoBarco = tipoBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAquiler() {
        return fechaAquiler;
    }

    public void setFechaAquiler(LocalDate fechaAquiler) {
        this.fechaAquiler = fechaAquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    @Override
    public String toString() {
        return "{nombre=" + nombre + ", dni=" + dni + ", fechaAquiler=" + fechaAquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicion=" + posicion + ", tipoBarco=" + tipoBarco + '}';
    }
    
}
