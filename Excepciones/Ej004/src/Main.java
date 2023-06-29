import java.util.InputMismatchException;
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

        try {
            System.out.print("Ingrese un numero: ");
            int num = sc.nextInt();
            System.out.println("Numero ingresado: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Input invalido! Ingrese un integer.");

        }
    }
}