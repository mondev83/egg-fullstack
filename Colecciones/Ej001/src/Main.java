
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

        ArrayList<String> razas = new ArrayList<>();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String opc = "s";

        while (opc.equals("s")) {

            System.out.println("Ingrese una raza de perro: ");
            razas.add(sc.next());

            System.out.println("Desea agregar otra raza? (s/n)");
            opc = sc.next().toLowerCase();

        }
        System.out.println("[ Raza de Perros ]");
        for (String raza : razas) {
            System.out.println("» " + raza);
        }
    }

}
