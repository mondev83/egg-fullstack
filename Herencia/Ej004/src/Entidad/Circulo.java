package Entidad;

import Interfaces.calculosFormas;

/**
 *
 * @author monde
 */
public class Circulo implements calculosFormas {
    

    private int radio;
    private double area;
    private double perimetro;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public Double calculoArea() {
        System.out.print("Calculo Area: ");
        return area = PI * Math.pow(radio, 2);
    }

    @Override
    public Double calculoPerimetro() {
        System.out.print("Calculo Perimetro: ");
        double diametro = radio * 2;
        return perimetro = PI * diametro;
    }

}
