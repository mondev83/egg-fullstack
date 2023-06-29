package Entidad;

import java.util.InputMismatchException;

/**
 *
 * @author monde
 */
public class DivisionNumero {

    private int num1b;
    private int num2b;

    public DivisionNumero(String num1, String num2) {

        this.num1b = Integer.parseInt(num1);
        this.num2b = Integer.parseInt(num2);

    }

    public void division() {

        try {
            double resultado = this.num1b / this.num2b;

            System.out.println("- Resultado #" + resultado);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!");

        }
    }

}
