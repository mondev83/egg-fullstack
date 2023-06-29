package Entidad;

import java.util.Arrays;

/**
 *
 * @author monde
 */
public class Movil {

    private String marca;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private double precio;
    private int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, String modelo, int memoriaRam, int almacenamiento, double precio, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {       
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nMemoriaRam: " + memoriaRam + "GB"
                + "\nAlmacenamiento: " + almacenamiento + "GB"
                + "\nPrecio: $" + precio;
                //+ "\nCodigo: " + String.valueOf(codigo);
    }

}
