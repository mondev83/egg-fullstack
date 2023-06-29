package Entidad;

/**
 *
 * @author monde
 */
public class Pass {
   private String pass;
   private String nombre;
   private int dni;

    public Pass() {

    }

    public Pass(String pass, String nombre, int dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
    }
    public Pass(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "[Datos del usuario]" + 
                "\nContraseña = " + pass + 
                "\nNombre = " + nombre + 
                "\nDNI = " + dni;
    }
    
        
}
