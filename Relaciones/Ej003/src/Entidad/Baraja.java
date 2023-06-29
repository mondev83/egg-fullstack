package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author monde
 */

public class Baraja {
    
    private List<Carta> listaCartas;
    private List<Carta> monton;

    public Baraja() {
        listaCartas = new ArrayList<>();
        monton = new ArrayList<>();
        String[] palos = {"Espada", "Basto", "Oro", "Copa"};
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) { // Condicional para no incluir el 8 ni el 9
                    listaCartas.add(new Carta(i, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(listaCartas);
    }

    public Carta siguienteCarta() {
        if (listaCartas.isEmpty()) {
            System.out.println("No hay más cartas en el mazo");
            return null;
        } else {
            Carta carta = listaCartas.remove(0);
            monton.add(carta);
            return carta;
        }
    }

    public int cartasDisponibles() {
        return listaCartas.size();
    }

    public List<Carta> darCartas(int cantidad) {
        if (cartasDisponibles() < cantidad) {
            System.out.println("No hay más cartas en el mazo");
            return null;
        } else {
            List<Carta> mano = new ArrayList<>();
            for (int i = 0; i < cantidad; i++) {
                mano.add(siguienteCarta());
            }
            return mano;
        }
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("No se repartio ninguna carta");
        } else {
            System.out.println("Cartas repartidas:");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        if (listaCartas.isEmpty()) {
            System.out.println("El mazo está vacío");
        } else {
            System.out.println("Cartas en el mazo:");
            for (Carta carta : listaCartas) {
                System.out.println(carta);
            }
        }
    }
}