
import Entidad.DivisionNumero;
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

        System.out.println("[DIVISION]");
        System.out.print("Dividendo #");
        String num1a = sc.next();
        System.out.print("Divisor #");
        String num2a = sc.next();

        DivisionNumero div1 = new DivisionNumero(num1a, num2a);

        div1.division();
    }
}
