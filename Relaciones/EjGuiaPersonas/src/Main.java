
import Entidad.Dni;
import Entidad.Persona;


/**
 * 
 * EJERCICIO PERSONA
 * Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
 * objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
 * acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Tito", "Rober", new Dni('A', 30405060));
        Persona p2 = new Persona("Chiquito", "Felipe", new Dni('B', 30405061));
        Persona p3 = new Persona("Pepe", "Bondi", new Dni('C', 30405062));
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
    
    
    
}
