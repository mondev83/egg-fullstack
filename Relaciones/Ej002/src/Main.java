
import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author monde
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de jugadores (entre 1 y 6): ");
        int numJugadores = sc.nextInt();
        
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }
        
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            Jugador j = new Jugador(i);
            listaJugadores.add(j);
        }
        
        Revolver r = new Revolver();
        r.llenarRevolver();
        
        Juego juego = new Juego();
        juego.llenarJuego(listaJugadores, r);
        juego.ronda();
    }
}
