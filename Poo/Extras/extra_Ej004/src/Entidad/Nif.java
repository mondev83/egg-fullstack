package Entidad;

/**
 *
 * @author monde
 */
public class Nif {

    private long dni;
    private char letra;
    private char[] tabla;

    public Nif() {
        this.tabla = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', +'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public char[] getTabla(){
        return tabla;
    }
    public void setTabla(){
        this.tabla = tabla;
    }
    
}
