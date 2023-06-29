/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej004;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author monde
 */
public class POOEj004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicio sr = new RectanguloServicio();
        Rectangulo r1 = sr.crearRectangulo();

        System.out.println("");
        sr.dibujarRectangulo(r1);
        System.out.println("");
        sr.setSuperficie(r1);
        sr.setPerimetro(r1);
        
    }

}
