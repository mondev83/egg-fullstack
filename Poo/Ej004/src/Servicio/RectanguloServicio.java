/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class RectanguloServicio {

    public static Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();

        System.out.print("Ingrese el valor de la base en cm: ");
        r1.setBase(leer.nextInt());
        System.out.print("Ingrese el valor de la altura en cm: ");
        r1.setAltura(leer.nextInt());

        return r1;
    }

    public void setSuperficie(Rectangulo r1) {
        int superficie = r1.getBase() * r1.getAltura();
        System.out.println("La superficie es de " + superficie + " cm²");
    }

    public void setPerimetro(Rectangulo r1) {
        int perimetro = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("El perimetro es de " + perimetro + " cm");
    }

    public void dibujarRectangulo(Rectangulo r1) {

        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i == 0 || i == r1.getAltura()-1 || j == 0 || j == r1.getBase()-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
