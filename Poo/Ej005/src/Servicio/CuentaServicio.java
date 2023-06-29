/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class CuentaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {

        Cuenta c1 = new Cuenta();

        System.out.print("Numero de cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese su DNI: ");
        c1.setDni(leer.nextLong());

        return c1;
    }

    public void Ingresar(Cuenta c1) {
        System.out.print("Ingrese la cantidad de dinero a depositar: ");

        double ingreso = leer.nextDouble();
        c1.setSaldo(c1.getSaldo() + (int) ingreso);

    }

    public void Retirar(Cuenta c1) {
        System.out.print("Ingrese la cantidad de dinero a retirar: ");
        double retiro = leer.nextDouble();
        if (c1.getSaldo() > retiro) {
            c1.setSaldo(c1.getSaldo() - (int) retiro);
        } else {
            c1.setSaldo(0);
            System.out.println("Saldo: " + c1.getSaldo());
        }

    }

    public void extraccionRapida(Cuenta c1) {
        System.out.print("Extracción Rapida [hasta un 20% de $" + c1.getSaldo() + "]: ");
        double retiro = leer.nextDouble();
        
        if (c1.getSaldo() == 0) {
            System.out.println("Saldo insuficiente");

        } else if (retiro <= c1.getSaldo() * 0.2) {
            c1.setSaldo(c1.getSaldo() - (int) retiro);
            
        } else {
            System.out.println("No puede retirar mas del 20%");
        }
    }

    public void consultarSaldo(Cuenta c1) {
        System.out.println("Saldo disponible en cuenta $" + c1.getSaldo());
    }

    public void consultarDatos(Cuenta c1) {
        System.out.println(c1.toString());

    }

}
