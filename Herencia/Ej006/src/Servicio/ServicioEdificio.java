package Servicio;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class ServicioEdificio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    List<Edificio> listaEdificios = new ArrayList<>();
    boolean key = true;

    //Metodo para usar constructor por parametros
    public void crearEdificiosPar() {

        Edificio poli1 = new Polideportivo("Poli1", "Abierto", 20, 40, 60);
        Edificio poli2 = new Polideportivo("Poli2", "Techado", 10, 30, 50);
        Edificio ofi1 = new EdificioDeOficinas(4, 2, 4, 10, 12, 14);
        Edificio ofi2 = new EdificioDeOficinas(5, 3, 5, 13, 10, 15);

        listaEdificios.add(poli1);
        listaEdificios.add(ofi1);
        listaEdificios.add(poli2);
        listaEdificios.add(ofi2);
    }

    // Metodo para cargar edificios por consola
    public void crearEdificiosCons() {

        while (key) {
            System.out.println("[Tipo de Edificio]");
            System.out.println("1. Polideportivo | 2. Oficina");
            System.out.print("» ");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Edificio poli = new Polideportivo();
                    listaEdificios.add(poli);
                    continuar();
                    break;
                case 2:
                    Edificio ofi = new EdificioDeOficinas();
                    listaEdificios.add(ofi);
                    continuar();
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    continuar();
            }
        }
    }

    private void continuar() {
        System.out.println("\nCargar otro Edificio?");
        System.out.println("1. Si | 2. No");
        System.out.print("» ");
        char cont = sc.next().charAt(0);
        key = cont == '1';
        clearConsole();
    }

    public void mostrarResumen() {

        int contTechado = 0;
        int contAbierto = 0;

        System.out.println("[Listado de Edificios]");
        for (Edificio aux : listaEdificios) {

            System.out.println("Superficie Edificio " + listaEdificios.indexOf(aux) + ": " + aux.calcularSuperficie());
            System.out.println("Volumen Edificio " + listaEdificios.indexOf(aux) + ": " + aux.calcularVolumen());
        }

        for (Edificio aux : listaEdificios) {

            if (aux instanceof EdificioDeOficinas) {
                System.out.println("\nSuperficie Edificio Oficinas " + listaEdificios.indexOf(aux) + ": " + aux.calcularSuperficie());
                System.out.println("Volumen Edificio Oficinas " + listaEdificios.indexOf(aux) + ": " + aux.calcularVolumen());
                ((EdificioDeOficinas) aux).cantPersonas();
            }

            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).getTipoInstalacion().equals("Techado")) {
                    contTechado++;
                } else {
                    contAbierto++;
                }
            }
        }
        System.out.println("\n[Tipo de Polideportivo]");
        System.out.println("Instalaciones abiertas: " + contAbierto);
        System.out.println("Instalaciones techadas: " + contTechado);
    }

    public void mostrarOficinas() {
        System.out.println("[Lista de Oficinas]");
        for (Edificio oficina : listaEdificios) {
            if (oficina instanceof EdificioDeOficinas) {
                System.out.print(listaEdificios.indexOf(oficina) + ". ");
                System.out.println(oficina.toString());

            }

        }
    }

    public void mostrarPoli() {
        System.out.println("\n[Lista de Polideportivos]");
        for (Edificio poli : listaEdificios) {
            if (poli instanceof Polideportivo) {
                System.out.print(listaEdificios.indexOf(poli) + ". ");
                System.out.println(poli.toString());

            }

        }
    }

    private static void clearConsole() {
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
