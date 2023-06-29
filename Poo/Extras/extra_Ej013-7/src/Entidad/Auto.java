package Entidad;

import java.util.Arrays;

/**
 *
 * @author monde
 */
public class Auto {

    private String titular;
    private String[] vencCarnet;
    private String color;
    private int modelo;
    private int km;

    public Auto() {
        this.km = 7500;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String[] getVencCarnet() {
        return vencCarnet;
    }

    public void setVencCarnet(String[] vencCarnet) {
        this.vencCarnet = vencCarnet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
//        String venc = "";
//
//        for (int i = 0; i < vencCarnet.length; i++) {
//            venc += vencCarnet[i] + "/";
//
//        }
        return "\n[Ficha del Auto]"
                + "\n\tTitular: " + titular
                + "\n\tVenc carnet (dd/mm/aaa): " + Arrays.toString(vencCarnet)
                //+ "\nVencimiento carnet: " + venc
                + "\n\tColor: " + color
                + "\n\tModelo: " + modelo
                + "\n\tKilometros: " + km;
    }

}
