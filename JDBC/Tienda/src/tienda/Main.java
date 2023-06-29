package tienda;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        ProductoServicio ps = new ProductoServicio();
        FabricanteServicio fs = new FabricanteServicio();
        Scanner sc = new Scanner(System.in);
        boolean salir = true;

        while (salir) {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Nombre de todos los productos");
            System.out.println("2. Nombre y precio de todos los productos");
            System.out.println("3. Productos con precio entre 120 y 220");
            System.out.println("4. Portatiles de la lista");
            System.out.println("5. Nombre y precio del producto mas barato");
            System.out.println("6. Ingresar un producto");
            System.out.println("7. Ingresar un fabricante");
            System.out.println("8. Editar un producto a elección");
            System.out.println("0. Salir");
            System.out.print("> ");
            int menu = sc.nextInt();
            clearConsole();

            switch (menu) {
                case 1:
                    System.out.println("[ 1 - Nombre de todos los productos ]");
                    ps.nombreProductos();
                    break;
                case 2:
                    System.out.println("[ 2 - Nombre y precio de todos los productos ]");
                    ps.nombrePrecioProductos();
                    break;
                case 3:
                    System.out.println("[ 3 - Productos con precio entre 120 y 220 ]");
                    ps.entre120y200();
                    break;
                case 4:
                    System.out.println("[ 4 - Portatiles de la lista ]");
                    ps.buscarPortatil();
                    break;
                case 5:
                    System.out.println("[ 5 - Producto mas barato ]");
                    ps.productoBarato();
                    break;
                case 6:
                    System.out.println("[ 6 - Nuevo producto ]");
                    System.out.print("Nombre: ");
                    String nombre = sc.next();
                    System.out.print("Precio:");
                    double precio = sc.nextDouble();
                    System.out.println("Fabricantes: ");
                    fs.nombreFabricantes();
                    System.out.print("ID: ");
                    int fabricante = sc.nextInt();
                    ps.cargarProducto(nombre, precio, fabricante);
                    break;
                case 7:
                    System.out.println("[ 7 - Nuevo fabricante ]");
                    System.out.print("Nombre del fabricante: ");
                    String nombref = sc.next();
                    fs.cargarFabricante(nombref);
                    break;
                case 8:
                    System.out.println("[ 8 - Editar producto a elección ]");
                    System.out.println("Seleccione el ID del producto a modificar: ");
                    System.out.println(ps.listarProductos());
                    System.out.print("> ");
                    int codProd = sc.nextInt();
                    ps.modificarProductoPorCod(codProd);
                    break;
                case 0:
                    System.out.println("[ 0 - Salir! ]");
                    System.out.println("Está seguro que desea salir?");
                    salir = false;
                    break;
                default:
                    System.out.println("Opcion invalida!");
            }
            salir = continuar(sc);
        }
    }

    public static boolean continuar(Scanner sc) {
        System.out.println("\n1. Volver al menú | 2. Salir");
        System.out.print("> ");
        char opc = sc.next().toLowerCase().charAt(0);
        if (opc == '2') {
            System.out.println("Saliendo!");
            return false;
        }
        clearConsole();
        return true;
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
