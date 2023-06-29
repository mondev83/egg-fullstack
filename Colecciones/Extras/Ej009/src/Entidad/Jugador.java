package Entidad;

/**
 *
 * @author monde
 */
public class Jugador {

    private String nombre;
    private String apellido;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return " ↳ " + nombre + " " + apellido;
    }
}
