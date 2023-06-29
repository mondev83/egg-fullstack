package Entidad;

import Interfaces.Interfaz;

/**
 *
 * @author monde
 */
public class Animal implements Interfaz {

    public void hacerRuido() {
        System.out.println("Hola");
    }

    @Override
    public void metodoAbstracto() {
        System.out.println("\nmetodoAbstracto interfaz animal");
    }

}
