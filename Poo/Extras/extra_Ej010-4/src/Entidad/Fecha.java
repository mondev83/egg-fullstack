package Entidad;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void ingresoFecha() {

        Scanner scan = new Scanner(System.in);
        boolean llave = true;

        while (this.dia < 1 || this.dia > 31 || llave == true) {
            System.out.print("Ingrese un número del 1 al 31 (día): ");
            this.dia = scan.nextInt();
            llave = false;
        }

        llave = true;
        while (this.mes < 1 || this.mes > 12 || llave == true) {
            System.out.print("Ingrese un número del 1 al 12 (mes): ");
            this.mes = scan.nextInt();
            llave = false;
        }

        llave = true;
        while (llave == true) {
            System.out.print("Ingrese un número del 1900 al 2021 (año): ");
            int anioScn = scan.nextInt();
            verificarAnio(anioScn);

            if (anioBisiesto() == false && this.mes == 2 && this.dia == 29) {
                System.out.println("");
                System.out.println("El año " + this.anio + " no es bisiesto, por lo tanto febrero tiene 28 días. Se actualizó el valor.");
                this.dia = 28;
            }
            llave = false;
        }
    }

    public void verificarAnio(int anioScn) {

        if (anioScn > 1899 && anioScn < 2022) {
            this.anio = anioScn;
        }
    }

    public void verificarMes() {

        /*
        28 dias = (2)febrero
        30 dias = (4)abril, (6)junio, (9)septiembre, (11)noviembre
        31 dias = (1)enero, (3)marzo, (5)mayo, (7)julio, (8)agosto, (10)octubre, (12)diciembre
         */
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesMayus = (meses[this.mes - 1].substring(0, 1).toUpperCase() + meses[this.mes - 1].substring(1));

        if (this.mes == 2) {
            if (anioBisiesto() == true) {
                System.out.println("\t↳ " + mesMayus + " tiene 29 días.");
            } else {
                System.out.println("\t↳ " + mesMayus + " tiene 28 días.");
            }
        } else if (this.mes == 4 && this.mes == 6 && this.mes == 9 && this.mes == 11) {
            System.out.println("\t↳ " + mesMayus + " tiene 30 días.");

        } else {
            System.out.println("\t↳ " + mesMayus + " tiene 31 días.");
        }
    }

    public void diaAnterior() {
        int[] diaAnterior = {this.dia, this.mes, this.anio};

        if (this.mes == 3 && this.dia == 1 && anioBisiesto() == false) {
            diaAnterior[0] = 28;
            diaAnterior[1]--;

        } else if (this.mes == 3 && this.dia == 1 && anioBisiesto() == true) {
            diaAnterior[0] = 29;
            diaAnterior[1]--;

        } else if (this.mes == 2 && this.mes == 4 && this.mes == 6 && this.mes == 9 && this.mes == 11 && this.dia == 1) {
            diaAnterior[0] = 31;
            diaAnterior[1]--;

        } else if (this.mes == 5 && this.mes == 7 && this.mes == 8 && this.mes == 10 && this.dia == 1) {
            diaAnterior[0] = 30;
            diaAnterior[1]--;

        } else if (this.dia == 1 && this.mes == 1) {
            diaAnterior[0] = 31;
            diaAnterior[1] = 12;
            diaAnterior[2]--;

        } else {
            diaAnterior[0]--;
        }

        System.out.println("\t↳ Día anterior: " + diaAnterior[0] + "/" + diaAnterior[1] + "/" + diaAnterior[2]);
    }

    public void diaSiguiente() {
        int[] diaSiguiente = {this.dia, this.mes, this.anio};

        if (this.mes == 2 && this.dia == 28 && anioBisiesto() == false) {
            diaSiguiente[0] = 1;
            diaSiguiente[1]++;

        } else if (anioBisiesto() == true) {
            diaSiguiente[0]++;

        } else if (this.mes == 2 && this.dia == 29 && anioBisiesto() == true) {
            diaSiguiente[0] = 1;
            diaSiguiente[1]++;

        } else if (this.mes == 1 && this.mes == 3 && this.mes == 5 && this.mes == 7 && this.mes == 8 && this.mes == 10 && this.dia == 31) {
            diaSiguiente[0] = 1;
            diaSiguiente[1]++;

        } else if (this.mes == 4 && this.mes == 6 && this.mes == 9 && this.mes == 11 && this.dia == 30) {
            diaSiguiente[0] = 1;
            diaSiguiente[1]++;

        } else if (this.dia == 31 && this.mes == 12) {
            diaSiguiente[0] = 1;
            diaSiguiente[1] = 1;
            diaSiguiente[2]++;

        } else {
            diaSiguiente[0]++;
        }

        System.out.println("\t↳ Día siguiente: " + diaSiguiente[0] + "/" + diaSiguiente[1] + "/" + diaSiguiente[2]);
    }

    public boolean anioBisiesto() {

        /*
        Formula para sacar año bisiesto:
        ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))
         */
        // La clase GregorianCalendar ya tiene el metodo isLeapYear para eso.
        GregorianCalendar calendar = new GregorianCalendar();
        boolean bisiesto = false;

        if (calendar.isLeapYear(this.anio)) {
            //System.out.println("El año es bisiesto");
            bisiesto = true;

        } else {
            //System.out.println("El año no es bisiesto");
            bisiesto = false;
        }
        return bisiesto;
    }

    public void mostrar() {
        ingresoFecha();
        System.out.println("");
        System.out.println("-------------");
        System.out.println("FECHA INGRESADA: " + this.dia + "/" + this.mes + "/" + this.anio);
        verificarMes();
        diaAnterior();
        diaSiguiente();
        System.out.println("\t↳ Año bisiesto: " + anioBisiesto());
        System.out.println("");

    }
}
