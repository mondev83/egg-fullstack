package Entidad;

import java.time.LocalDate;

/**
 *
 * @author monde
 */
public class Alumno {

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String nacionalidad;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "\t" + nombre + " " + apellido + " / " + nacionalidad + " / " + fechaNacimiento;
    }

}
