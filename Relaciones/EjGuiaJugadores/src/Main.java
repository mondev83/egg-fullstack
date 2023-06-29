
import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Lionel", "Messi", "Delantero", 10);
        Jugador jugador2 = new Jugador("Diego", "Milito", "Delantero", 22);
        Jugador jugador3 = new Jugador("Julian", "Alvarez", "Delantero", 19);
        
        List<Jugador> listaJugadores = new ArrayList();
        Equipo equipo = new Equipo();
        
        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);
        listaJugadores.add(jugador3);
        
        equipo.setListaJugadores(listaJugadores);
        
        for (Jugador jugador : listaJugadores) {
            System.out.println(jugador);
        }
    }
}
