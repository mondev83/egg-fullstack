/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author monde
 */
public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private int saldo;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, int saldo, double interes) {

        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Datos de la Cuenta:\n" + "Numero Cuenta = " + numeroCuenta + "\nDNI = " + dni + "\nSaldo = $" + saldo;
    }
}
