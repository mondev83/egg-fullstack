
import dominio.mascota.MascotaService;
import dominio.usuario.Usuario;
import dominio.usuario.UsuarioService;

/**
 *
 * @author monde
 */
public class Main {

    public static void main(String[] args) {

        UsuarioService usuarioService = new UsuarioService();
        MascotaService mascotaService = new MascotaService();

        try {
            //Creamos  usuarios
            System.out.println("\n- Creamos 2 usuarios -");
            usuarioService.crearUsuario("fiorde0@hotmail.com", "fiorde14");
            usuarioService.crearUsuario("tincho@hotmail.com", "eggprogramacion");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

        try {
            System.out.println("\n- Modificamos clave fiorde -");
            //Modificamos un usuario
            usuarioService.modificarClaveUsuario("fiorde@hotmail.com", "fiorde14", "fiorde15");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

        try {
            //Eliminamos un usuario
            System.out.println("\n- Eliminamos usuario fiorde -");
            usuarioService.eliminarUsuario("fiorde@hotmail.com");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

        try {
            System.out.println("\n- Creamos mascota para el usuario tincho -");
            //Buscamos el Usuario por correo
            Usuario usuario = usuarioService.buscarUsuarioPorCorreoElectronico("tincho@hotmail.com");
            //Creamos Mascota con el Usuario anterior
            mascotaService.crearMascota("Chiquito", "Beagle", usuario);

            //Mostramos Mascota con su Usuario
            mascotaService.imprimirMascotas();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

    }
}
