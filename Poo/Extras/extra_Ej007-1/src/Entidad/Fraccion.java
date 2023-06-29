package Entidad;


/**
 *
 * @author monde
 */
public class Fraccion {
    
    private int numeradorA;
    private int denominadorA;
    private int numeradorB;
    private int denominadorB;

    public int getNumeradorA() {
        return numeradorA;
    }

    public void setNumeradorA(int numeradorA) {
        this.numeradorA = numeradorA;
    }

    public int getDenominadorA() {
        return denominadorA;
    }

    public void setDenominadorA(int denominadorA) {
        this.denominadorA = denominadorA;
    }

    public int getNumeradorB() {
        return numeradorB;
    }

    public void setNumeradorB(int numeradorB) {
        this.numeradorB = numeradorB;
    }

    public int getDenominadorB() {
        return denominadorB;
    }

    public void setDenominadorB(int denominadorB) {
        this.denominadorB = denominadorB;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numeradorA=" + numeradorA + ", denominadorA=" + denominadorA + ", numeradorB=" + numeradorB + ", denominadorB=" + denominadorB + '}';
    }
    
}

