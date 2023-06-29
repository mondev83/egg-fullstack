/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class CircunferenciaServicio {

    public static Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);

        Circunferencia c1 = new Circunferencia();

        System.out.println("Ingrese el radio:");
        c1.setRadio(leer.nextDouble());

        return c1;
    }

    public double area(double radio) {
        double area = Math.PI * Math.pow(radio, 2);

        return area;

    }

    public double perimetro(double radio) {
        double perimetro = 2 * Math.PI * radio;

        return perimetro;
    }

    public void mostrarCircunferencia(double area, double perimetro) {
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }

}
