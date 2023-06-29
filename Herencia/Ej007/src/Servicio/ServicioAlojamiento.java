package Servicio;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel4;
import Entidad.Hotel5;
import Entidad.Residencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author monde
 */
public class ServicioAlojamiento {

    List<Alojamiento> listaAlojamientos = new ArrayList<>();

    public void crearAlojamiento() {

        Hotel4 a1 = new Hotel4("Restaurante1", 50, true,
                10, 110, 10, 0, "Hotel1 ****",
                "Direccion1", "Caba", "Gerente1");
        Hotel4 a2 = new Hotel4("Restaurante2", 40, false,
                30, 210, 40, 0, "Hotel2 ****",
                "Direccion2", "Caba", "Gerente2");
        Hotel5 a3 = new Hotel5(100, 20, 10, "Restaurante3", 50,
                true, 20, 40, 10, 0, "Hotel3 *****", "Direccion3", "Caba", "Gerente3");
        Hotel5 a4 = new Hotel5(120, 40, 15, "Restaurante4", 50,
                false, 40, 50, 10, 0, "Hotel4 *****", "Direccion4", "Caba", "Gerente4");
        Camping a5 = new Camping(10, 2, true, true,
                120, "Camping1", "Direccion5", "Mendoza", "Gerente5");
        Residencia a6 = new Residencia(5, false, true, true, 200, "Residencia1",
                "Direccion6", "Cordoba", "Gerente5");

        listaAlojamientos.add(a1);
        listaAlojamientos.add(a2);
        listaAlojamientos.add(a3);
        listaAlojamientos.add(a4);
        listaAlojamientos.add(a5);
        listaAlojamientos.add(a6);

        for (Alojamiento aux : listaAlojamientos) {
            if (aux instanceof Hotel5) {
                Object object = (Object) aux;

            }

        }
    }

    private int calcularPrecioHabitacion() {

        int valAgregadoResto = 0;
        int valAgregadoGimnasio = 0;
        int valAgregadoLimosinas = 0;

        for (Alojamiento alojamiento : listaAlojamientos) {
            if (alojamiento instanceof Hotel5) {
                valAgregadoLimosinas += ((Hotel5) alojamiento).getCantidadLimosinas();

            }
            if (alojamiento instanceof Object) {
                Object object = (Object) alojamiento;
                
            }
        }
        valAgregadoLimosinas *= 15;


        if (capacidadRestaurante < 30) {
            valAgregadoResto = 10;

        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valAgregadoResto = 30;
        } else {
            valAgregadoResto = 50;
        }

        if (gimnasioA) {
            valAgregadoGimnasio = 50;
        } else {
            valAgregadoGimnasio = 30;
        }

        return 50 + valAgregadoResto + valAgregadoGimnasio + valAgregadoLimosinas;
    }
}
