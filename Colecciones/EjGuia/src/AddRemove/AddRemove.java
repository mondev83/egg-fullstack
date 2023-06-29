package AddRemove;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author monde
 */
public class AddRemove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        //LISTAS:
        ArrayList<Integer> numerosA = new ArrayList<>();
        int x = 200;
        numerosA.add(x); // Agregamos 200 a la lista;

        // HASHSET:
        HashSet<Integer> numerosB = new HashSet<>();
        int y = 20;
        numerosB.add(y);

        // TREESET:
        TreeSet<Integer> numerosC = new TreeSet<>();
        int z = 100;
        numerosC.add(z);

        // MAPS:
        HashMap<Integer, String> alumnos = new HashMap<>();
        int dni = 30405060;
        String nomAlumno = "Chiquito";
        alumnos.put(dni, nomAlumno);

        for (int i = 0; i < 5; i++) {

            numerosA.add(x + r.nextInt(99)); // LIST
            numerosB.add(y + r.nextInt(99)); // HASHSET
            numerosC.add(z + r.nextInt(99)); // TREESET
            System.out.print("Nombre " + (i + 1) + ": "); // MAP
            alumnos.put(dni + r.nextInt(9999999), sc.next());
        }

        System.out.println("\nLIST:");
        for (Integer aux : numerosA) {
            System.out.print(aux + " ");
        }

        System.out.println("\nHASHSET:");
        for (Integer aux : numerosB) {
            System.out.print(aux + " ");
        }

        System.out.println("\nTREESET:");
        for (Integer aux : numerosC) {
            System.out.print(aux + " ");
        }

        System.out.println("\nMAP:");
        for (Map.Entry<Integer, String> aux : alumnos.entrySet()) {
            System.out.println("Key = " + aux.getKey() + " Value = " + aux.getValue());
        }

        System.out.println("\nELEMENTOS ELIMINADOS");
        System.out.println("------------");
        //numerosA.remove(0); // LIST remove por indice
        numerosA.remove(Integer.valueOf(200)); // LIST remove por elemento
        numerosB.remove(20); // SET remove por elemento;
        numerosC.remove(100); // SET remove por elemento;
        alumnos.remove(30405060); // MAP remove por key;

        System.out.println("\nLIST:");
        for (Integer aux : numerosA) {
            System.out.print(aux + " ");
        }
        
        System.out.println("\nHASHSET:");
        for (Integer aux : numerosB) {
            System.out.print(aux + " ");
        }
        
        System.out.println("\nTREESET:");
        for (Integer aux : numerosC) {
            System.out.print(aux + " ");
        }
        
        System.out.println("\nMAP:");
        for (Map.Entry<Integer, String> aux : alumnos.entrySet()) {
            System.out.println("Key = " + aux.getKey() + " Value = " + aux.getValue());
        }

    }
}
