package Servicio;

import Entidad.Producto;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class ServicioProducto {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> listaProductos = new HashMap<>();

    public void agregarProducto() {
        System.out.println("\n[ AGREGAR PRODUCTO ]");
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = sc.next();

        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        Producto producto = new Producto(nombre, precio);
        listaProductos.put(nombre, precio);
    }

    public void modificarPrecio() {
        System.out.println("\n[ MODIFICAR PRECIO ]");
        System.out.println("Ingrese el nombre del producto:");
        String nombre = sc.next();
        if (listaProductos.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio:");
            double precio = sc.nextDouble();
            listaProductos.put(nombre, precio);
            System.out.println("Precio modificado!");
        } else {
            System.out.println("El producto no existe!");
        }
    }

    public void eliminarProducto() {
        System.out.println("\n[ ELIMINAR PRODUCTO ]");
        System.out.println("Ingrese el nombre del producto:");
        String nombre = sc.next();
        if (listaProductos.containsKey(nombre)) {
            listaProductos.remove(nombre);
            System.out.println("Producto eliminado!");
        } else {
            System.out.println("El producto no existe!");
        }
    }

    public void mostrarProductos() {
        System.out.println("\n[ LISTA DE PRODUCTOS ]");
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void mostrarMenu() {
        int opcion = 0;
        boolean salir = false;

        while (!salir) {

            System.out.println("\n[  ===   MENU   ===  ]");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Lista de productos");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            clearConsole();
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("La opción " + opcion + " no existe!");
            }
        }
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
