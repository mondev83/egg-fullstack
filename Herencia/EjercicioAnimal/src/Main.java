
import Entidad.Animal;
import Entidad.Gato;
import Entidad.Vaca;
import Entidad.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author monde
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList();

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        Animal d = new Vaca();

        animales.add(a);
        animales.add(b);
        animales.add(c);
        animales.add(d);


        for (Animal aux : animales) {
            aux.hacerRuido();
        }
        
        a.metodoAbstracto();
        d.metodoAbstracto();
        
        c.metodoAbstracto();
        


    }

}
