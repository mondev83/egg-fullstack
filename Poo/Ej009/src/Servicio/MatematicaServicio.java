/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author monde
 */
public class MatematicaServicio {

    public Matematica crearObjeto(double num1, double num2) {

        Matematica m1 = new Matematica();

        m1.setNum1(num1);
        m1.setNum2(num2);

        return m1;
    }

    public static void devolverMayor(Matematica m1) {

        double numMayor = Math.round(Math.max(m1.getNum1(), m1.getNum2()));
        double numMenor = Math.round(Math.min(m1.getNum1(), m1.getNum2()));
        m1.setNum1(numMayor);
        m1.setNum2(numMenor);

        if (m1.getNum1() > m1.getNum2()) {
            System.out.println("El número " + (int) m1.getNum1() + " es mayor que " + (int) m1.getNum2());
        } else {
            System.out.println("Los números son iguales");
        }

    }

    public static void calcularPotencia(Matematica m1) {

        System.out.println("El resultado del mayor elevado al menor es: "
                + Math.round(Math.pow(m1.getNum1(), m1.getNum2())));

    }

    public static void calcularRaiz(Matematica m1) {

        System.out.println("La raiz cuadrada del menor de los valores es: "
                + Math.abs(Math.sqrt(m1.getNum2())));
    }
}
