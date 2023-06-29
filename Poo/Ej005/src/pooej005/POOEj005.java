/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej005;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class POOEj005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio cs = new CuentaServicio();
        Cuenta c1 = cs.crearCuenta();
        byte menu;

        do {

            System.out.println("");
            System.out.println("1. Deposito");
            System.out.println("2. Extracción");
            System.out.println("3. Extracción rápida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Datos de cuenta");
            System.out.println("6. Salir");
            System.out.println("");
            System.out.print("Seleccione un opcion: ");
            menu = leer.nextByte();
            System.out.println("");
            switch (menu) {

                case 1:
                    cs.Ingresar(c1);
                    continue;
                case 2:
                    cs.Retirar(c1);
                    continue;
                case 3:
                    cs.extraccionRapida(c1);
                    continue;
                case 4:
                    cs.consultarSaldo(c1);
                    continue;
                case 5:
                    cs.consultarDatos(c1);
                    continue;
                case 6:
                    System.out.println("== Saliendo ==");
                    break;
                default:
                    System.out.println(menu + " no es una opcion valida.");
            }
        } while (6 != menu);

    }
}
