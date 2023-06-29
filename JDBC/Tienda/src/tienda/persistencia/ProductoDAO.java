package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author monde
 */
public class ProductoDAO extends DAO {

    public Collection<Producto> listarProductos() throws Exception {

        try {
            String sql = "SELECT * FROM producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto menorPrecio() throws Exception {
        Producto menorPrecio = null;

        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1";
            consultarBase(sql);

            while (resultado.next()) {
                menorPrecio = new Producto();
                menorPrecio.setNombre(resultado.getString(1));
                menorPrecio.setPrecio(resultado.getDouble(2));
            }

            desconectarBase();
            return menorPrecio;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }

            String sql = "INSERT INTO Producto (nombre,precio,codigo_fabricante)"
                    + "VALUES ( '" + producto.getNombre() + "' , " + producto.getPrecio() + ", " + producto.getCodigoFabricante() + ");";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorCod(Integer codProd) throws Exception {
        try {

            String sql = "SELECT * FROM Producto "
                    + " WHERE codigo = '" + codProd + "'";

            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
    try {
        if (producto == null) {
            throw new Exception("Debe indicar el producto que desea modificar");
        }
        
        String sql = "UPDATE Producto SET nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio() + ", codigo_fabricante = '" + producto.getCodigoFabricante() + "' WHERE codigo = " + producto.getCodigo();
        
        // Ejecutar la consulta
        insertarModificarEliminar(sql);
    } catch (Exception e) {
        throw e;
    } finally {
        desconectarBase();
    }
}


}
