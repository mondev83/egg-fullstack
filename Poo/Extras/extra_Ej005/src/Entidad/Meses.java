package Entidad;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Meses {

    private String[] meses;
    private String mesSecreto;

    public Meses() {
        this.meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        this.mesSecreto = this.meses[new Random().nextInt(this.meses.length)];
    }

    public void adivinar() {
        Scanner scan = new Scanner(System.in);
        String mes = "";
        byte intento = 0;

        System.out.println("Ingrese un mes, hasta adivinar! ");

        while (!mes.equals(this.mesSecreto)) {
            intento++;
            System.out.print("Intento [" + intento + "]: ");
            mes = scan.next().toLowerCase();
        }

        // Paso la primera letra del mes a mayuscula;
        this.mesSecreto = this.mesSecreto.substring(0, 1).toUpperCase() + this.mesSecreto.substring(1);

        System.out.println("=================");
        System.out.println("Adivinaste!!!"
                + "\nEl mes secreto era " + this.mesSecreto
                + " y lo encontraste en " + intento + " intentos.");
    }
}
