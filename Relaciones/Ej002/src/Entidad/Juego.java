package Entidad;

import java.util.ArrayList;

/**
 * Clase Juego: esta clase posee los siguientes atributos: 
 * Jugadores (conjunto de Jugadores) y Revolver
 * 
 * Métodos:
 *      • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
 *        y el revolver para guardarlos en los atributos del juego.
 * 
 *      • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
 *        aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
 *        moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
 *        mojar. Al final del juego, se debe mostrar que jugador se mojó.
 *        Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 *
 * @author monde
 */

public class Juego {

    private ArrayList<Jugador> listaJugadores;
    private Revolver r;

    public void llenarJuego(ArrayList<Jugador> listaJugadores, Revolver r) {
        this.listaJugadores = listaJugadores;
        this.r = r;
    }

    public void ronda() {
        boolean mojado = false;
        // Variable (i) para iterar la lista de jugadores;
        int i = 0;
        while (!mojado) {
            Jugador j = listaJugadores.get(i);
            // Se asigna el valor del booleano a la variable (mojado) para saber si el
            // jugador se mojo
            mojado = j.disparo(r);
            System.out.println(j.getNombre() + " dispara → " + r.toString());
            // Uso el MOD para asegurarme de no salirme de los valores de la lista;
            i = (i + 1) % listaJugadores.size();
        }
        for (Jugador j : listaJugadores) {
            if (j.seMojo()) {
                System.out.println("--------");
                System.out.println("El " + j.getNombre() + " se mojo. GG!");
                break;
            }
        }
    }
}
