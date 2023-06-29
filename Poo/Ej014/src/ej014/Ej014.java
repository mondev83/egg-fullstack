package ej014;

import Entidad.Movil;
import Servicio.MovilServicio;

/**
 *
 * @author monde
 */
public class Ej014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MovilServicio ms = new MovilServicio();
        //Movil m1 = ms.cargarCelular();

        int[] codigo1 = {0, 3, 0, 3, 4, 5, 6};
        Movil m1 = new Movil("Sony", "Xperia", 32, 500, 4000, codigo1);

        System.out.println(m1.toString());
        ms.mostrarCodigo(m1);

    }
}
