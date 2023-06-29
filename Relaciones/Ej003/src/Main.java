
import Entidad.Baraja;
import java.util.Scanner;

/**
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene
 * un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas,
 * bastos, oros y copas). Esta clase debe contener un método toString() que
 * retorne el número de carta y el palo. La baraja estará compuesta por un
 * conjunto de cartas, 40 exactamente.
 *
 * Las operaciones que podrá realizar la baraja son: • barajar(): cambia de
 * posición todas las cartas aleatoriamente. • siguienteCarta(): devuelve la
 * siguiente carta que está en la baraja, cuando no haya más o se haya llegado
 * al final, se indica al usuario que no hay más cartas. • cartasDisponibles():
 * indica el número de cartas que aún se puede repartir. • darCartas(): dado un
 * número de cartas que nos pidan, le devolveremos ese número de cartas. En caso
 * de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos
 * indicárselo al usuario. • cartasMonton(): mostramos aquellas cartas que ya
 * han salido, si no ha salido ninguna indicárselo al usuario • mostrarBaraja():
 * muestra todas las cartas hasta el final. Es decir, si se saca una carta y
 * luego se llama al método, este no mostrara esa primera carta.
 *
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Baraja baraja = new Baraja();
        boolean salir = false;

        while (!salir) {

            System.out.println("[SELECCIONE UNA OPCION]");
            System.out.println("1 - Mezclar mazo");
            System.out.println("2 - Repartir carta");
            System.out.println("3 - Repartir N cartas");
            System.out.println("4 - Cartas disponibles en mazo");
            System.out.println("5 - Cartas repartidas");
            System.out.println("6 - Cartas no repartidas");
            System.out.println("0 - Salir");
            int cont = sc.nextInt();
            switch (cont) {
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    baraja.siguienteCarta();
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de cartas: ");
                    int n = sc.nextInt();
                    baraja.darCartas(n);
                    break;
                case 4:
                    baraja.cartasDisponibles();
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                case 0:
                    salir = true;
                    break;
            }
        }
    }
}
