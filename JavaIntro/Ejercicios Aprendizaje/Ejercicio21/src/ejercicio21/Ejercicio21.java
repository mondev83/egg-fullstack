/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sn=new Scanner(System.in);
         
        System.out.println("Escriba un numero de columnas");
        int columnas=sn.nextInt();
         
        int matriz[][]=new int[5][columnas];
         
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]=generaNumAleatorio(10,50);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
             
        }
         
    }
     
    public static int generaNumAleatorio(int minimo,int maximo){
         
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
         
    }
     
}
