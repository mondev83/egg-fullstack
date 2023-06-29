package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author monde
 */
public class ProductoServicio {

    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public Collection<Producto> listarProductos() throws Exception {

        try {
            Collection<Producto> productos = dao.listarProductos();
            return productos;

        } catch (Exception e) {
            throw e;
        }
    }

    public void nombreProductos() throws Exception {
        try {
            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No hay productos");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void nombrePrecioProductos() throws Exception {
        try {
            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No hay productos");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.getNombre() + " - $" + u.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void entre120y200() throws Exception {
        try {
            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No hay productos");
            } else {
                for (Producto u : productos) {
                    if (u.getPrecio() > 119 && u.getPrecio() < 203) {
                        System.out.println(u);
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarPortatil() throws Exception {
        try {
            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No hay productos");
            } else {
                for (Producto u : productos) {
                    if (u.getNombre().contains("Portátil")) {
                        System.out.println(u);
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void productoBarato() throws Exception {

        System.out.println(dao.menorPrecio());
    }

    public void cargarProducto(String nombre, double precio, int fabricante) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            if (Double.isNaN(precio)) {
                throw new Exception("Debe indicar el precio");
            }

            //Creamos producto
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(fabricante);
            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProductoPorCod(int codProducto) throws Exception {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        //Buscamos
        Producto producto = buscarProductoPorCod(codProducto);
        
         //Validamos
            if (producto.getCodigo()!= codProducto) {
                throw new Exception("El codigo del producto no existe en el sistema");
            }

            //Modificamos
            System.out.print("Nombre: ");
            producto.setNombre(sc.next());
            System.out.print("Precio: ");
            producto.setPrecio(sc.nextDouble());
            System.out.print("ID Fabricante: ");
            producto.setCodigoFabricante(sc.nextInt());
            
            dao.modificarProducto(producto);
    }
    
    public Producto buscarProductoPorCod(Integer codProd) throws Exception {

        try {

            //Validamos
            if (codProd == null) {
                throw new Exception("Debe indicar el codigo del producto");
            }

            Producto producto = dao.buscarProductoPorCod(codProd);

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
}
