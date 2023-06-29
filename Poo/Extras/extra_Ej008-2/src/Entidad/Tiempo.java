package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Tiempo {

    private int hh;
    private int mm;
    private int ss;

    public Tiempo() {
    }

    public Tiempo(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getSs() {
        return ss;
    }

    public void setSs(int ss) {
        this.ss = ss;
    }

    public void imprimirHoraCompleta() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos a simular el paso del tiempo en consola!");
        System.out.println("");
        System.out.print("↳ Ingrese el valor horas: ");
        this.hh = scan.nextInt();
        while (hh < 0 || hh > 24) {
            System.out.print("\tFormato 24H - valor 0 a 24: ");
            this.hh = scan.nextInt();
        }

        System.out.print("↳ Ingrese el valor minutos: ");
        this.mm = scan.nextInt();
        while (mm < 0 || mm > 60) {
            System.out.print("\tValor entre 0 y 60: ");
            this.mm = scan.nextInt();
        }
        System.out.print("↳ Ingrese el valor segundos: ");
        this.ss = scan.nextInt();
        while (ss < 0 || ss > 60) {
            System.out.print("\tValor entre 0 y 60: ");
            this.ss = scan.nextInt();
        }
        System.out.println("");
        while (true) {
            
            /* Thread.sleep para generar un delay the 1 segundo (1000ms)
            No es necesario usar el try-catch para que funcione el Thread.sleep pero
            es una buena práctica aplicarlo para detectar errores en el depurador en
            caso que haya alguno. Cuando el código pasa a modo producción hay que sacar
            e.printStackTrace();
            */
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ss++;
            if (ss == 60) {
                ss = 0;
                mm++;
            }
            if (mm == 60) {
                mm = 0;
                hh++;
            }
            if (hh == 24) {
                hh = 0;
            }
            System.out.print("♯ ");
            System.out.println(String.format("%02d:%02d:%02d", hh, mm, ss));
        }

    }
}
