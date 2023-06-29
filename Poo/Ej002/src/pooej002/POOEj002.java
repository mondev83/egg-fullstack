/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pooej002;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;

/**
 *
 * @author monde
 */
public class POOEj002 {

    public static void main(String[] args) {
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia c1 = cs.crearCircunferencia();

        cs.mostrarCircunferencia(cs.area(c1.getRadio()),
                cs.perimetro(c1.getRadio()));

    }
}
