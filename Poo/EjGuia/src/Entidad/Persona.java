/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author monde
 */
public class Persona {

    public String nombre;
    public String apodo;
    public int edad;

    // constructor por defecto
    public Persona() {
    }

    // Constructor por parametros
    public Persona(String nombre, String apodo, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
    }

    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apodo=" + apodo + ", edad=" + edad + '}';
    }

}
