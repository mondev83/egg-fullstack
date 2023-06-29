/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    Cafetera c1 = new Cafetera();

    public void llenarCafetera() {

        if (c1.getCantidadActual() >= c1.getCapacidadMaxima()) {
            System.out.println("La cafetera ya esta llena.");

        } else {
            c1.setCantidadActual(c1.getCapacidadMaxima());
            System.out.println("Se cargaron " + c1.getCantidadActual() + "gr de cafe.");
        }

    }

    public void servirTaza() {

        System.out.print("Ingrese el tamaño de la taza en ml: ");
        int taza = leer.nextInt();

        if (c1.getCantidadActual() <= 0) {
            System.out.println("La maquina no tiene cafe.");

        } else if (taza > c1.getCapacidadMaxima()) {
            System.out.println("El maximo es de 100ml.");

        } else if (c1.getCantidadActual() < taza) {
            System.out.println("Solo alcanzo para un cafe de " + c1.getCantidadActual() + "ml.");
            c1.setCantidadActual(c1.getCantidadActual() - taza);

        } else if (taza <= c1.getCantidadActual() || taza > 0) {
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("Se sirvo un cafe de " + taza + "ml.");
        }
    }

    public void vaciarCafetera() {

        if (c1.getCantidadActual() <= 0) {
            System.out.println("La cafetera ya esta vacia.");

        } else {
            c1.setCantidadActual(0);
            System.out.println("Se vacio la cafetera.");
        }
    }

    public void agregarCafe() {

        System.out.print("Ingrese la cantidad de cafe a cargar: ");
        int agregar = leer.nextInt();

        if (c1.getCantidadActual() == c1.getCapacidadMaxima()) {
            System.out.println("La cafetera esta llena");

        } else if (c1.getCantidadActual() + agregar > c1.getCapacidadMaxima()) {
            System.out.println("Alcanzo el maximo de " + c1.getCapacidadMaxima() + "gr.");
            System.out.println("Hay un excedente de " + (c1.getCantidadActual() + agregar - c1.getCapacidadMaxima()) + "gr.");
            c1.setCantidadActual(100);

        } else {
            c1.setCantidadActual(c1.getCantidadActual() + agregar);
            System.out.println("Se cagaron " + agregar + "gr de cafe. "
                    + "\nTotal disponible " + c1.getCantidadActual() + "gr.");
        }
    }
}
