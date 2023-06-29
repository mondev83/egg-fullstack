
import Entidad.Circulo;
import Entidad.Rectangulo;


/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Circulo c = new Circulo(2);
        Rectangulo r = new Rectangulo(5d, 7d);
        
        System.out.println("Calculos Circulo: ");
        System.out.println(c.calculoArea());
        System.out.println(c.calculoPerimetro());
        
        System.out.println("\nCalculos Rectangulo: ");
        System.out.println(r.calculoArea());
        System.out.println(r.calculoPerimetro());
                
                
               
    }
    
}
