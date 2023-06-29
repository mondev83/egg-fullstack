
import Entidad.Triangulo;

/**
 *
 * @author monde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Triangulo[] triangulos = {
            new Triangulo(60, 70),
            new Triangulo(30, 14),
            new Triangulo(20, 12),
            new Triangulo(40, 16)};

        double maxArea = Double.MIN_VALUE;
        Triangulo objNum = null;
        int cont = 0;
        int pos = 0;
        for (Triangulo obj : triangulos) {
            double area = obj.getArea();
            cont++;
            if (area > maxArea) {
                maxArea = area;
                objNum = obj;
                pos = cont;
            }
        }
        System.out.println("El triangulo " + pos + " es el de mayor area de superficie.");
        System.out.println("Su superficie es de: " + maxArea);
        System.out.println("Sus valores son : " + objNum);
        
    }

}
