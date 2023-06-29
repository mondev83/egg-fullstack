package Servicio;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author monde
 */
public class ServicioPais {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    TreeSet<String> listaPaises = new TreeSet<>();

    public void nuevoPais() {

        boolean nuevoPais = true;
        String nPais = "";

        while (nuevoPais) {

            System.out.println("Ingrese un País: ");
            nPais = sc.next();
            listaPaises.add(nPais);

            System.out.println("Desea agregar otro País? (s/n)");
            char opcion = sc.next().toLowerCase().charAt(0);

            nuevoPais = opcion == 's';

        }
    }

    public void eliminarPais() {

        System.out.println("Ingrese al país a eliminar: ");
        String nPais = sc.next();
        boolean eliminado = false;

        Iterator it = listaPaises.iterator();
        System.out.println("Paises de la lista: ");
        while (it.hasNext()) {
            String pais = (String) it.next();

            if (pais.equals(nPais)) {
                it.remove();
                eliminado = true;
            }
        }
        System.out.println(listaPaises.toString());

        if (eliminado) {
            System.out.println("El país " + nPais + " fué eliminado de la lista.");
        } else {
            System.out.println("El país " + nPais + " no existe en la lista");
        }

    }
}
