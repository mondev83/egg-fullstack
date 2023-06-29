package Entidad;

/**
 *
 * @author monde
 */
public class Vaca extends Animal {

    @Override
    public void hacerRuido() {
        System.out.println("La vaca hace: muuu");
    }

    @Override
    public void metodoAbstracto() {
        System.out.println("metodoAbstracto interfaz vaca");
    }

}
