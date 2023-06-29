package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    HashMap<String, Double> prod = new HashMap();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void cargarElementos() {
        System.out.println("Ingrese el nombre del producto y luego el precio: ");

        prod.put(sc.next(), sc.nextDouble());
    
        prod.entrySet().forEach((entry) -> {
            System.out.println(entry.toString());
        });

    }

    public void modificarPrecio() {
        System.out.println("Ingrese el producto que quiere modificar el precio: ");
        String opcion = sc.next();
        boolean var = false;
        for (Map.Entry<String, Double> entry : prod.entrySet()) {
            if (prod.containsKey(opcion)) {

                var = true;
            }
        }
        if (var) {
            prod.replace(opcion, sc.nextDouble());

        } else {
            System.out.println("El producto seleccionado no existe");
        }

        for (Map.Entry<String, Double> entry : prod.entrySet()) {
            System.out.println(entry.toString());

        }

    }

    public void eliminarProducto() {
        System.out.println("Ingrese el producto a eliminar: ");
        String var = sc.next();
        boolean aux = false;
        for (Map.Entry<String, Double> entry : prod.entrySet()) {
            if (prod.containsKey(var)) {
                aux = true;
            }
        }
        if (aux) {
            prod.remove(var);
        } else {
            System.out.println("El produto no existe");
        }

        for (Map.Entry<String, Double> entry : prod.entrySet()) {
            System.out.println(entry.toString());

        }
    }

}
