
import Service.ProductoServicio;
import java.util.Scanner;

//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
public class main {

   
    public static void main(String[] args) {
       ProductoServicio ps = new ProductoServicio();
       
       Scanner sc = new Scanner(System.in);
       boolean ver = true;
       while(ver){    
            System.out.println("---------------");
            System.out.println("------MENU-----");
            System.out.println("Ingrese opcion: ");
            System.out.println("");
            System.out.println("1 - Cargar Producto");
            System.out.println("2 - Modificar Precio");
            System.out.println("3 - Eliminar Producto");
            System.out.println("4 - Salir ");
            System.out.println("");

             int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Cargando productos..");
                ps.cargarElementos();
                break;
            case 2:
                System.out.println("Modificando precios..");
                ps.modificarPrecio();
                break;
            case 3:
                System.out.println("Eliminando Producto..");
                ps.eliminarProducto();
                break;
            case 4:
                System.out.println("Adios, gracias por utilizar aerolineas nargentinas");
                ver = false;
                break;
        }
       }
        
    }
    
}
