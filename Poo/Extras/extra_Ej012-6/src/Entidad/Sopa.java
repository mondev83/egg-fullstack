package Entidad;

/**
 *
 * @author monde
 */
public class Sopa {
    private char[][] matriz;
    private String[] palabras;

    public Sopa() {
        String[] palabras = {"arbol","cielo","planta","libro","lapiz"};
    }

    public Sopa(char[][] matriz, String[] palabras) {
        this.matriz = matriz;
        this.palabras = palabras;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }
    
    
}
