package Servicio;

import Entidad.Nif;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class NifServicio {

    Nif nif = new Nif();

    public void crearNif() {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Ingrese un DNI de hasta 8 digitos: ");
            nif.setDni(scan.nextLong());

            digitoVerificador();

        } while (Long.toString(nif.getDni()).length() > 8);
    }

    public char digitoVerificador() {

        int calculo = (int) (nif.getDni() % 23);

        char[] tabla = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', +'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        nif.setLetra(tabla[calculo]);

        return nif.getLetra();
    }

    public void mostrar() {

        String relleno = "";

        while ((Long.toString(nif.getDni()).length() + relleno.length() < 8)) {
            relleno += "0";
        }

        System.out.println("\nEl NIF para el DNI " + nif.getDni() + " es:\n"
                + relleno + nif.getDni() + "-" + nif.getLetra());
    }
}
