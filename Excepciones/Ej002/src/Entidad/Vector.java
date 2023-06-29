package Entidad;

/**
 *
 * @author monde
 */
public class Vector {

    private int[] vector1 = new int[3];

    public void error() throws ArrayIndexOutOfBoundsException {

        try {

           vector1[4] = 10;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
    }
}
