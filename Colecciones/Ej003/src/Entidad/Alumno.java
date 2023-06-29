package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> listaNotas;

    public Alumno() {
        listaNotas = new ArrayList<>();
        
    }

    public Alumno(String nombre, ArrayList<Integer> listaNotas) {
        this.nombre = nombre;
        this.listaNotas = listaNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", listaNotas=" + listaNotas + '}';
    }

}
