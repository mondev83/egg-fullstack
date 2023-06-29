package Servicio;

import Entidad.Pais;
import Utilidades.Comparadores;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author monde
 */
public class ServicioPaisObj {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    TreeSet<Pais> listaPaises = new TreeSet<>(Comparadores.ordenarPorNombre);

    public void nuevoPais() {

        boolean nuevoPais = true;

        while (nuevoPais) {
            Pais pais = new Pais();
            System.out.println("Ingrese un País: ");
            pais.setNombre(sc.next());
            
            listaPaises.add(pais);

            System.out.println("Desea agregar otro País? (s/n)");
            char opcion = sc.next().toLowerCase().charAt(0);

            nuevoPais = opcion == 's';

        }
    }

    public void eliminarPais() {

        System.out.println("Ingrese al país a eliminar: ");
        String nPais = sc.next();
        boolean eliminado = false;

        Iterator<Pais> it = listaPaises.iterator();
        System.out.println("Paises de la lista: ");
        while (it.hasNext()) {

            if (it.next().getNombre().equals(nPais)) {
                it.remove();
                eliminado = true;
            }
        }

        for (Pais pais : listaPaises) {
            System.out.println(pais);
        }

        if (eliminado) {
            System.out.println("\nEl país " + nPais + " fué eliminado de la lista.");
        } else {
            System.out.println("\nEl país " + nPais + " no existe en la lista");
        }

    }
}
