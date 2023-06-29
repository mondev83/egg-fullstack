package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class FraccionServicio {

    public static Fraccion ingresarNum() {
        Fraccion frac = new Fraccion();
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese NumeradorA: ");
        frac.setNumeradorA(scan.nextInt());
        System.out.print("Ingrese DenominadorA: ");
        frac.setDenominadorA(scan.nextInt());
        System.out.print("Fracción A: ");
        System.out.println(frac.getNumeradorA() + "/" + frac.getDenominadorA());

        System.out.print("\nIngrese NumeradorB: ");
        frac.setNumeradorB(scan.nextInt());
        System.out.print("Ingrese DenominadorB: ");
        frac.setDenominadorB(scan.nextInt());
        System.out.print("Fracción B: ");
        System.out.println(frac.getNumeradorB() + "/" + frac.getDenominadorB());
        
        return frac;

    }

    public static void sumar(Fraccion frac) {

        if (frac.getDenominadorA() == frac.getDenominadorB()) {
            int resultado = frac.getNumeradorA() + frac.getNumeradorB();
            System.out.println(resultado + "/" + frac.getDenominadorA());
        }
        int resultado = frac.getNumeradorA() + frac.getNumeradorB();
        System.out.println(resultado + "/" + mcm(frac));
    }
    
    public static void restar(Fraccion frac) {

        if (frac.getDenominadorA() == frac.getDenominadorB()) {
            int resultado = frac.getNumeradorA() - frac.getNumeradorB();
            System.out.println(resultado + "/" + frac.getDenominadorA());
        }
        int resultado = frac.getNumeradorA() - frac.getNumeradorB();
        System.out.println(resultado + "/" + mcm(frac));
    }

    public static int mcm(Fraccion frac) {
        int a = Math.max(frac.getDenominadorA(), frac.getDenominadorB());
        int b = Math.min(frac.getDenominadorA(), frac.getDenominadorB());

        int resultado = (a / mcd(frac)) * b;

        return resultado;

    }

    public static int mcd(Fraccion frac) {

        int a = Math.max(frac.getDenominadorA(), frac.getDenominadorB());
        int b = Math.min(frac.getDenominadorA(), frac.getDenominadorB());

        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;

        } while (b != 0);

        return resultado;

    }

    public static void menu(Fraccion frac) {

        Scanner scan = new Scanner(System.in);
        char opcion = '0';

        do {
            System.out.println("\n[Menú de opciones]");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("» ");
            opcion = scan.next().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.print("\nResultado de la suma: ");
                    sumar(frac);
                    System.out.println("--------------------");
                    break;
                case '2':
                    System.out.print("\nResultado de la resta: ");
                    restar(frac);
                    System.out.println("--------------------");
                    break;
//                case '2':
//                    restar();
//                    break;
//                case '3':
//                    multiplicar();
//                    break;
//                case '4':
//                    dividir();
//                    break;
                case '0':

                    System.out.println("\nCerrando menú...");
                    System.out.println("--------------------");
                    scan.close();
                    break;
                default:
                    System.out.println("\nOpción no valida!");
                    System.out.println("--------------------");
            }
        } while (opcion != '0');
    }
    
    
}

