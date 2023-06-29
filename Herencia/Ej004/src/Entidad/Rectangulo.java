package Entidad;

import Interfaces.calculosFormas;

/**
 *
 * @author monde
 */
public class Rectangulo implements calculosFormas {
    
    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
 

    @Override
    public Double calculoArea() {
        System.out.print("Calculo Area: ");
        return base * altura;
    }

    @Override
    public Double calculoPerimetro() {
        System.out.print("Calculo Perimetro: ");
        return (base + altura)*2;
    }
}
