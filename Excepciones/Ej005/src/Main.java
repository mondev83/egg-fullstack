
import Entidad.Juego;
import java.util.InputMismatchException;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego();

        try {
            juego.adivinar();
        } catch (InputMismatchException e) {
            int cont = juego.getCont() + 1;
            juego.setCont(cont);
            
            System.out.println("No ingresaste un número entero!");
            System.out.println("Número de intentos: " + juego.getCont());
        }
    }
}
