/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class OperacionServicio {

    public static Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in);

        Operacion op1 = new Operacion();

        System.out.println("Ingrese el primer numero entero:");
        op1.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero entero:");
        op1.setNumero2(leer.nextInt());

        return op1;
    }

    public int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    public int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    public int multiplicar(int numero1, int numero2) {

        if (numero1 != 0 || numero2 != 0) {
            int producto = numero1 * numero2;
            return producto;
        } else {
            int producto = 0;
            return producto;
        }
    }

    public double dividir(int numero1, int numero2) {
        if (numero1 == 0 || numero2 == 0) {
            double division = 0;
            return division;
        } else {
            double division = numero1 / numero2;
            return division;
        }
    }

    public void mostrarOperacion(int suma, int resta, int producto, double division) {
        System.out.println("Resta de los dos numeros: " + resta);
        System.out.println("Suma de los dos numeros: " + suma);
        System.out.println("Multiplacion de los dos numeros: " + producto);
        System.out.println("Division de los dos numeros: " + division);
    }

}
