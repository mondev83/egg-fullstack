package extra_ej002;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Extra_Ej002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los dos puntos es: " + distancia);
        

    }
}

class Puntos {

    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public void crearPuntos() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el valor para x1: ");
        x1 = scan.nextDouble();
        System.out.print("Ingrese el valor para y1: ");
        y1 = scan.nextDouble();
        System.out.print("Ingrese el valor para x2: ");
        x2 = scan.nextDouble();
        System.out.print("Ingrese el valor para y2: ");
        y2 = scan.nextDouble();
        scan.close();
    }

    public double calcularDistancia() {

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return distancia;
    }
}
