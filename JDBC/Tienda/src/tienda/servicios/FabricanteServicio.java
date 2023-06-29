package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author monde
 */
public class FabricanteServicio {

    private FabricanteDAO dao;

    public FabricanteServicio() {
        this.dao = new FabricanteDAO();
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {

        try {
            Collection<Fabricante> fabricantes = dao.listarFabricante();
            return fabricantes;

        } catch (Exception e) {
            throw e;
        }
    }

    public void nombreFabricantes() throws Exception {
        try {
            Collection<Fabricante> fabricantes = listarFabricantes();

            if (fabricantes.isEmpty()) {
                throw new Exception("No hay productos");
            } else {
                for (Fabricante u : fabricantes) {
                    System.out.println("ID: " + u.getCodigo() + " - Nombre: " + u.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void cargarFabricante(String nombre) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            //Creamos fabricante
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);

        } catch (Exception e) {
            throw e;
        }
    }
}
