package Servicio;

import Entidad.Jugador;
import java.util.HashSet;
import java.util.Set;

/*
Crea un conjunto al que se le va a llamar jugadores. Inserta en el conjunto los jugadores del FC Barcelona.
Realiza un bucle sobre los jugadores del conjunto y muestra sus nombres.
Consulta si en el conjunto existe el jugador «Neymar JR». Avisa si existe o no.
Crea un segundo conjunto jugadores2 con los jugadores «Piqué» y «Busquets».
Consulta si todos los elementos de jugadores2 existen en jugadores.
Realiza una unión de los conjuntos jugadores y jugadores2.
Elimina todos los jugadores del conjunto jugadores2 y muestra el número de jugadores que tiene el conjunto jugadores2 (debería ahora ser cero)
 */
/**
 *
 * @author monde
 */
public class ServicioJugador {

    Set<Jugador> jugadores = new HashSet<>();
    Set<Jugador> jugadores2 = new HashSet<>();

    public void generarJugadores() {

        jugadores.add(new Jugador("Lionel", "Messi"));
        jugadores.add(new Jugador("Luis", "Suarez"));
        jugadores.add(new Jugador("Pep", "Guardiola"));
        jugadores.add(new Jugador("Javier", "Mascherano"));
        jugadores.add(new Jugador("Neymar", "Jr"));
        jugadores.add(new Jugador("Jordi", "Alba"));
        jugadores.add(new Jugador("Frenkie", "de Jong"));
        jugadores.add(new Jugador("Anderson", "Deco"));
        jugadores2.add(new Jugador("Gerard ", "Piqué"));
        jugadores2.add(new Jugador("Sergio", "Busquets"));
    }

    public void mostrarJugadores() {
        System.out.println("\nLista Jugadores: ");
        this.jugadores.forEach(jugador -> {
            System.out.println(jugador);
        });
    }

    public void consultarJugador() {

        String nombre = "Neymar";
        String apellido = "Jr";

        Jugador jugador = this.jugadores.stream()
                .filter(a -> a.getNombre().equalsIgnoreCase(nombre) && a.getApellido().equalsIgnoreCase(apellido))
                .findFirst()
                .orElse(null);

        if (jugador != null) {
            System.out.println("\nEl jugador «" + nombre + " " + apellido + "» forma parte de la lista!");

        } else {
            System.out.println("\nEl jugador «" + nombre + " " + apellido + "» NO forma parte de la lista!");
        }
    }

    public void consultarJugadores() {

        for (Jugador jugador : jugadores2) {
            System.out.println("«" + jugador + "»");
        }

        if (this.jugadores.containsAll(this.jugadores2)) {
            System.out.println("\nLos jugadores forman parte de la lista de jugadores!");
        } else {
            System.out.println("\nLos jugadores NO forman parte de la lista de jugadores!");
        }
    }
    
    public void unionConjuntos(){
        this.jugadores.addAll(this.jugadores2);
        
    }
    
    public void eliminarJugadores2(){
        this.jugadores2.clear();
        
        boolean empty = this.jugadores2.isEmpty();
        
        System.out.println("\nSe vacio la lista jugadores2? " + empty);
        System.out.println("\nSe vacio la lista jugadores2? " + this.jugadores2.size());

    }

}
