
import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<String, Perro> listaAdopcion = new HashMap<>();

        listaAdopcion.put("chiquito", new Perro("Chiquito", "Labrador", 3));
        listaAdopcion.put("filo", new Perro("Filo", "Caniche", 4));
        listaAdopcion.put("luna", new Perro("Luna", "Pitbull", 2));
        listaAdopcion.put("pepa", new Perro("Pepa", "Yorki", 6));

        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("JuanJo"));
        listaPersonas.add(new Persona("Joaco"));
        listaPersonas.add(new Persona("Beth"));
        listaPersonas.add(new Persona("Edu"));

        Map<String, String> listaFamilia = new HashMap();
        for (Persona persona : listaPersonas) {
            Perro adoptarPerro = persona.elegirPerro(listaAdopcion);
            //System.out.println(persona.getNombre() + " adopto a " + adoptarPerro.getNombre());
            listaFamilia.put(persona.getNombre(), adoptarPerro.getNombre());
        }

        System.out.println("\nLista de Perros y sus papis:");
        for (Map.Entry<String, String> entry : listaFamilia.entrySet()) {
            String persona = entry.getKey();
            String perro = entry.getValue();
            System.out.println(persona + " adopto a " + perro);
        }

    }
}
