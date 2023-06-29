
import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*        
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        System.out.println("Precio final: $" + lavadora.precioFinal());
        
        Televisor tv = new Televisor();
        tv.crearTelevisor();
        System.out.println("Precio final: $" + tv.precioFinal());
         */
        Lavadora lavadora = new Lavadora(10, 1000d, "Rojo", 'a', 80);
        Lavadora lavadora2 = new Lavadora(10, 1000d, "Blanco", 'a', 80);

        Televisor tv = new Televisor(52, true, 1000d, "Gris", 'a', 80);
        Televisor tv2 = new Televisor(27, false, 1000d, "Negro", 'a', 80);

        List<Electrodomestico> listaElectro = new ArrayList<>();

        listaElectro.add(lavadora);
        listaElectro.add(lavadora2);
        listaElectro.add(tv);
        listaElectro.add(tv2);

        double totalLavadora = 0;
        System.out.println("[Lista de Lavadoras]");
        for (Electrodomestico art : listaElectro) {
            if (art instanceof Lavadora) {
                System.out.println("Precio final ART" + listaElectro.indexOf(art) + ": $" + art.precioFinal());
                totalLavadora += art.getPrecio();
            }
        }

        double totalTv = 0;
        System.out.println("\n[Lista de TVs]");
        for (Electrodomestico art : listaElectro) {
            if (art instanceof Televisor) {
                System.out.println("Precio final ART" + listaElectro.indexOf(art) + ": $" + art.precioFinal());
                totalTv += art.getPrecio();

            }
        }

        double totalElectro = totalLavadora + totalTv;
        System.out.println("\nPrecio Total listaElectro: $" + totalElectro);
    }
}
