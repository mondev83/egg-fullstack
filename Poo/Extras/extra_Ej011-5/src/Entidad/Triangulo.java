package Entidad;

/**
 *
 * @author monde
 */
public class Triangulo {

    private double base;
    private double lado;

    public Triangulo() {
    }

    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double getArea() {
        //h = √a2 – (b2/4);  
        double altura = Math.sqrt(Math.pow(this.lado,2) - Math.pow(this.base,2)/4);
        return (this.base * altura) / 2;

    }

    public double getPerimetro() {
        return Math.pow(this.lado, 2) + this.base;
    }

    @Override
    public String toString() {
        return "Base = " + base + " || Lado = " + lado;
    }
    
    
}
