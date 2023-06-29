package Entidad;

import java.util.Random;

/**
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente.
 *
 * Métodos: • llenarRevolver(): le pone los valores de posición actual y de
 * posición del agua. Los valores deben ser aleatorios. • mojar(): devuelve true
 * si la posición del agua coincide con la posición actual • siguienteChorro():
 * cambia a la siguiente posición del tambor • toString(): muestra información
 * del revolver (posición actual y donde está el agua)
 *
 * @author monde
 */
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random rnd = new Random();
        this.posicionActual = rnd.nextInt(6);
        this.posicionAgua = rnd.nextInt(6);
    }

    public boolean mojar() {
        return (this.posicionActual == this.posicionAgua);
    }

    public void siguienteChorro() {
        // Uso el MOD para asegurarme de no superar la cant de posiciones;
        this.posicionActual = (this.posicionActual + 1) % 6;
    }

    @Override
    public String toString() {
        return "Posición actual: " + (this.posicionActual + 1) + ", posición del agua: " + (this.posicionAgua + 1);
    }
}
