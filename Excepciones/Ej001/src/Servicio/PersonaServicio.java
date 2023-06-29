package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 * Inicializar un objeto de la clase Persona, a null
 * y tratar de invocar el método esMayorDeEdad() a través de ese objeto. Luego,
 * englobe el código con una cláusula try-catch para probar la nueva excepción
 * que debe ser controlada.
 *
 * @author monde
 */
public class PersonaServicio {

    public static Persona crearPersona() {

        Scanner leer = new Scanner(System.in);

        Persona p0 = new Persona();

        System.out.print("Ingrese su nombre: ");
        p0.setNombre(leer.next());

        System.out.print("Ingrese su edad: ");
        p0.setEdad(leer.nextShort());

        System.out.print("Ingrese su peso (kg): ");
        p0.setPeso(leer.nextFloat());

        System.out.print("Ingrese su altura (mt): ");
        p0.setAltura(leer.nextFloat());

        System.out.print("Ingrese su sexo: ");
        p0.setSexo(Character.toUpperCase(leer.next().charAt(0)));

        while (p0.getSexo() != 'H' && p0.getSexo() != 'M' && p0.getSexo() != 'O') {
            System.out.println("Sexo inválido. Ingrese H, M u O.");
            System.out.print("Ingrese su sexo: ");
            p0.setSexo(Character.toUpperCase(leer.next().charAt(0)));
        }

        return p0;
    }

    public int calcularIMC(Persona p0) {

        float pesoIdeal = ((float) (p0.getPeso() / Math.pow(p0.getAltura(), 2)));

        if (pesoIdeal < 20) {
            // Debajo del peso ideal
            byte imc = -1;
            return imc;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            // Peso ideal
            byte imc = 0;
            return imc;
        } else {
            // Sobrepeso
            byte imc = 1;
            return imc;
        }
    }

    public boolean esMayorDeEdad(Persona p0){
        boolean edad = p0.getEdad() >= 18;
        return edad;
    }

    public void porcentaje(int peso[], boolean edad[]) {

        byte bajopeso = 0;
        byte pesoideal = 0;
        byte sobrepeso = 0;
        byte mayor = 0;
        byte menor = 0;

        for (int i = 0; i < 4; i++) {

            switch (peso[i]) {
                case -1:
                    bajopeso++;
                    break;
                case 0:
                    pesoideal++;
                    break;
                default:
                    sobrepeso++;
                    break;
            }

            if (edad[i] == true) {
                mayor++;
            } else {
                menor++;
            }
        }
        System.out.println("");
        System.out.println("Debajo del peso ideal(" + bajopeso + "): " + (bajopeso * 100) / 4 + "%");
        System.out.println("Peso ideal(" + pesoideal + "): " + (pesoideal * 100) / 4 + "%");
        System.out.println("Sobrepeso(" + sobrepeso + "): " + sobrepeso * 100 / 4 + "%");
        System.out.println("-------------------");
        System.out.println("Mayores(" + mayor + "): " + (mayor * 100) / 4 + "%");
        System.out.println("Menores(" + menor + "): " + (menor * 100) / 4 + "%");

    }
}
