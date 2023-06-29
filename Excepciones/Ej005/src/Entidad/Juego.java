package Entidad;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Juego {

    private int numero;
    private int cont;
    private HashSet<Integer> listaNumeros = new HashSet<>();

    public Juego() {
        Random rnd = new Random();
        this.numero = rnd.nextInt(500) + 1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public HashSet<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(HashSet<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public void adivinar() {

        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;

        System.out.println(this.numero);
        System.out.println("Adivine el numero entre 1 y 500");
        System.out.println("--------------------------------");

        do {
            System.out.print("# ");
            int numUsr = sc.nextInt();

            if (numUsr < 1 || numUsr > 500) {
                System.out.println("El número debe ser mayor que 1 y menor que 500");
                numerosIngresados();
                continue;
            }
            if (numUsr > this.numero) {
                this.cont++;
                System.out.println("El número ingresado es mayor al oculto!");
                this.listaNumeros.add(numUsr);
                numerosIngresados();
                continue;
            }
            if (numUsr < this.numero) {
                this.cont++;
                System.out.println("El número ingresado es menor al oculto!");
                this.listaNumeros.add(numUsr);
                numerosIngresados();
                continue;
            }
            if (numUsr == this.numero) {
                this.cont++;
                System.out.println("\nFelicitaciones, adivinaste el número oculto!");
                System.out.println("Número de intentos: " + cont);
                gameOver = true;
            }
        } while (!gameOver);
    }

    public void numerosIngresados() {
        System.out.println("\n[Numeros ingresados]");
        for (Integer num : listaNumeros) {
            System.out.print(num + " | ");
        }
        System.out.println("");
    }
}
