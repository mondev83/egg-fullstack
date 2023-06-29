package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class MovilServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Movil cargarCelular() {

        Movil movil = new Movil();

        System.out.println("[Ingresar celular al sistema]");
        System.out.print("Marca: ");
        movil.setMarca(scan.next());
        System.out.print("Modelo: ");
        movil.setModelo(scan.next());
        System.out.print("Memoria RAM (gb): ");
        movil.setMemoriaRam(scan.nextInt());
        System.out.print("Almacenamiento (gb): ");
        movil.setAlmacenamiento(scan.nextInt());
        System.out.print("Precio: ");
        movil.setPrecio(scan.nextDouble());
        ingresarCodigo(movil);

        return movil;
    }

    public void ingresarCodigo(Movil movil) {

        int[] codigo = new int[7];

        System.out.print("Codigo (7 digitos): ");
        String num = scan.next();

        if (num.length() != 7) {
            System.out.print("Ingrese 7 digitos!: ");
            num = scan.next();
        } else {
            for (int i = 0; i < num.length(); i++) {
                codigo[i] = Character.getNumericValue(num.charAt(i));
            }
        }
        movil.setCodigo(codigo);
    }

    public void mostrarCodigo(Movil movil) {
      
        int[] codigo = movil.getCodigo();
        String cod = "";

        System.out.print("Codigo: ");
        for (int i = 0; i < codigo.length; i++) {
            System.out.print(codigo[i]);
        }
        System.out.println("");
       
    }
}
