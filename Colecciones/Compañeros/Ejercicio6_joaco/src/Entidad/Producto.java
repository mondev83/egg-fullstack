
package Entidad;


public class Producto {
    private String nProd;
    private int pProd;

    public Producto() {
    }

    public Producto(String nProd, int pProd) {
        this.nProd = nProd;
        this.pProd = pProd;
    }

    public String getnProd() {
        return nProd;
    }

    public void setnProd(String nProd) {
        this.nProd = nProd;
    }

    public int getpProd() {
        return pProd;
    }

    public void setpProd(int pProd) {
        this.pProd = pProd;
    }

    @Override
    public String toString() {
        return "Producto{" + "nProd=" + nProd + ", pProd=" + pProd + '}';
    }
    
    
}
