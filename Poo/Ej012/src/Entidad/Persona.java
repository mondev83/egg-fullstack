package Entidad;

public class Persona {

    private String nombre;
    private int dia;
    private int mes;
    private int anio;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n{Datos de la Persona}"
                + "\n Nombre: " + nombre
                + "\n Fecha de nacimiento: " + dia + '/' + mes + '/' + anio
                + "\n Edad: " + edad;
    }

}
