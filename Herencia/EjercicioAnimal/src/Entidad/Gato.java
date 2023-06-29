package Entidad;

/**
 *
 * @author monde
 */
public class Gato extends Animal {

    @Override
    public void hacerRuido() {
        System.out.println("El gato hace: miaumiau");
    }

    @Override
    public void metodoAbstracto() {
        System.out.println("metodoAbstracto interfaz gato");
    }

}
