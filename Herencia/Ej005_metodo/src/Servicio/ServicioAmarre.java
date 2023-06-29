package Servicio;

import Entidad.Amarre;
import Entidad.Motor;
import Entidad.Velero;
import Entidad.Yate;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    boolean key = true; // variable para bucle de cotizador
    String auxFecha = ""; // variable aux para formato de fecha

    public void alquilerAmarre() {

        while (key) {

            Amarre amarre = new Amarre();
            //Amarre a2 = new Amarre("Juan", 30405060, LocalDate.of(2023, 5, 2),LocalDate.of(2023, 5, 12), "POS1", "Velero");

            System.out.println("[Cotizacion Amarre]");
            System.out.print("Ingrese su nombre: ");
            amarre.setNombre(sc.next());

            System.out.print("Ingrese su DNI: ");
            amarre.setDni(sc.nextInt());

            System.out.print("Fecha de Ingreso (d/m/yyyy): ");
            auxFecha = sc.next();
            amarre.setFechaAquiler(formatoFecha());

            do {
                System.out.print("Fecha de Regreso (d/m/yyyy): ");
                auxFecha = sc.next();
                amarre.setFechaDevolucion(formatoFecha());
                if (amarre.getFechaDevolucion().isBefore(amarre.getFechaAquiler())) {
                    System.out.println("La devolucion no puede ser anterior al alquiler!");
                }
            } while (amarre.getFechaDevolucion().isBefore(amarre.getFechaAquiler()));

            System.out.print("Ingrese posicion de amarre: ");
            amarre.setPosicion(sc.next());

            System.out.println("Tipo de barco: ");
            System.out.println("1. Velero | 2. A motor | 3. Yate");
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
        System.out.println("\n[Listado Amarres]");
        for (Amarre barco : listadoAmarres) {
            System.out.println(barco);

        }
    }

    private void continuar() {
        System.out.print("Cotizar nuevo amarre? (s/n) ");
        char cont = sc.next().charAt(0);
        key = cont == 's';
        clearConsole();
    }

    private LocalDate formatoFecha() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate fecha = LocalDate.parse(auxFecha, formato);

        return fecha;
    }

    public static void clearConsole() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(50); // Delay para limpiar controla
        } catch (AWTException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            ex.printStackTrace();
        }
    }

}
