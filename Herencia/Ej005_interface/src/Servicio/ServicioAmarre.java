package Servicio;

import Entidad.Amarre;
import Entidad.Motor;
import Entidad.Velero;
import Entidad.Yate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class ServicioAmarre {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    List<Amarre> listadoAmarres = new ArrayList();
    boolean key = true;
    public void alquilerAmarre() {
        

        while (key) {

            Amarre amarre = new Amarre();
            //Amarre a2 = new Amarre("Juan", 30405060, LocalDate.of(2023, 5, 2),LocalDate.of(2023, 5, 12), "POS1", "Velero");

            System.out.print("Ingrese su nombre: ");
            amarre.setNombre(sc.next());
            System.out.print("Ingrese su DNI: ");
            amarre.setDni(sc.nextInt());
            System.out.print("Fecha de Ingreso (Y/M/D): ");
            amarre.setFechaAquiler(LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            System.out.print("Fecha de Engreso (Y/M/D): ");
            amarre.setFechaDevolucion(LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            System.out.print("Ingrese posicion de amarre: ");
            amarre.setPosicion(sc.next());
            System.out.println("Tipo de barco: ");
            System.out.println("1. Velero");
            System.out.println("2. A motor");
            System.out.println("3. Yate");
            System.out.print("> ");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    amarre.setTipoBarco("Velero");
                    Velero velero = new Velero();
                    System.out.println("Costo amarre: $" + velero.calculoAlquiler(amarre));
                    continuar();
                    break;

                case 2:
                    amarre.setTipoBarco("A Motor");
                    Motor motor = new Motor();
                    System.out.println("Costo amarre: $" + motor.calculoAlquiler(amarre));
                    continuar();
                    break;
                case 3:
                    amarre.setTipoBarco("Yate");
                    Yate yate = new Yate();
                    System.out.println("Costo amarre: $" + yate.calculoAlquiler(amarre));
                    continuar();
                    break;
            }

            listadoAmarres.add(amarre);
        }

        for (Amarre barco : listadoAmarres) {
            System.out.println(barco);

        }
    }

    public void continuar() {
        System.out.print("Cotizar nuevo amarre? (s/n) ");
        char cont = sc.next().charAt(0);
        key = cont == 's';
    }

}
