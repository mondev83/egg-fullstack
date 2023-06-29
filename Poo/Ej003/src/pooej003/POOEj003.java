/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej003;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author monde
 */
public class POOEj003 {

    public static void main(String[] args) {

        OperacionServicio os = new OperacionServicio();
        Operacion op1 = os.crearOperacion();

        os.mostrarOperacion(os.sumar(op1.getNumero1(), op1.getNumero2()),
                os.restar(op1.getNumero1(), op1.getNumero2()),
                os.multiplicar(op1.getNumero1(), op1.getNumero2()),
                os.dividir(op1.getNumero1(), op1.getNumero2()));

    }
}