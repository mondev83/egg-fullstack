package Entidad;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private List<Jugador> listaJugadores;

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "listaJugadores=" + listaJugadores + '}';
    }
}
