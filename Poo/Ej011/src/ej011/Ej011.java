package ej011;

import java.util.Date;
import java.util.Scanner;

public class Ej011 {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = leer.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = leer.nextInt();

        // Objeto Date con la fecha ingresada por el usuario. 
        //Hay que poner -1900 en el año si o si y -1 dia, si se hace con este metodo
        Date fechaIngresada = new Date(anio - 1900, mes - 1, dia);

        Date fechaActual = new Date();

        System.out.println("Fecha ingresada: " + fechaIngresada);
        System.out.println("Fecha actual: " + fechaActual);

        long diferenciaMs = fechaActual.getTime() - fechaIngresada.getTime();
        int anios = (int) (diferenciaMs / (1000 * 60 * 60 * 24 * 365L));

        System.out.println("La diferencia es de "+anios+" años.");

    }
}
