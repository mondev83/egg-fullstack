
import Entidad.Raices;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Raices raices = new Raices(100, 1, 100); // < 0
        Raices raices = new Raices(0, 0, 0); // == 0
        //Raices raices = new Raices(1, 100, 1); // > 0

        System.out.println("Discrimante = (b^2)-4*a*c");
        System.out.println(raices.getDiscriminante());
        System.out.println("");
        System.out.println("Tiene dos soluciones distintas?");
        System.out.println("Para que sea true, el discriminante debe ser > 0");
        System.out.println(raices.tieneRaices());
        System.out.println("");
        System.out.println("Tiene una solucion?");
        System.out.println("Para que sea true, el discriminante debe ser == 0");
        System.out.println(raices.tieneRaiz());
        System.out.println("\nSolucion(es): ");
        raices.calcular();

    }

}
