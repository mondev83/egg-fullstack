
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        Iterator<String> it = razas.iterator();
        System.out.println("Ingrese la raza a buscar: ");
        String razaUsr = sc.next().toLowerCase();

        while (it.hasNext()) {
            if (it.next().equals(razaUsr)) {
                it.remove();
                System.out.println("» La raza " + razaUsr + " fue eliminada");
            }
        }

        Collections.sort(razas);
        
        System.out.println("\nLista ordenada alfabeticamente:");
        
        for (String raza : razas) {
            System.out.println("» " + raza);
        }

    }
}