package Entidad;

public class Raices {

    private int a;
    private int b;
    private int c;

// Constructores
    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

// Getters & Setters    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

// Metodos
    public double getDiscriminante() {

        double discriminante = Math.pow(getB(), 2) - (4 * getA() * getC());

        return discriminante;
    }

    public boolean tieneRaices() {

        return getDiscriminante() > 0;
    }

    public boolean tieneRaiz() {

        return getDiscriminante() == 0;
    }

    public void obtenerRaices() {
        double opcion1 = 0;
        double opcion2 = 0;

        if (tieneRaices() == true);
        opcion1 = (-getB() + Math.sqrt((Math.pow(getB(), 2)) - (4 * getA() * getC()))) / (2 * getA());
        opcion2 = (-getB() - Math.sqrt((Math.pow(getB(), 2)) - (4 * getA() * getC()))) / (2 * getA());

        System.out.println("Raiz 1: " + opcion1 + "\nRaiz 2: " + opcion2);
    }

    public void obtenerRaiz() {
        double opcion1 = 0;

        if (tieneRaiz() == true);
        opcion1 = (-getB() + Math.sqrt((Math.pow(getB(), 2)) - (4 * getA() * getC()))) / (2 * getA());

        System.out.println("Raiz: " + opcion1);
    }

    public void calcular() {

        if (tieneRaiz() == true) {
            obtenerRaiz();
        } else if (tieneRaices() == true) {
            obtenerRaices();
        } else {
            System.out.println("No existe una solucion.");
        }
    }
}