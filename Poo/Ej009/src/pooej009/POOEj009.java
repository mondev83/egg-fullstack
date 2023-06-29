/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej009;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *0
 * @author monde
 */
public class POOEj009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MatematicaServicio ms = new MatematicaServicio();
               
        double num1 = Math.random() * 20+1;
        double num2 = Math.random() * 20+1;
        
        
        Matematica m1 = ms.crearObjeto(num1, num2);
        
        ms.devolverMayor(m1);
        ms.calcularPotencia(m1);
        ms.calcularRaiz(m1);
    }
    
}
