package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class EdificioDeOficinas extends Edificio {

    private int cantOficinas;
    private int personasPorOfi;
    private int cantPisos;

    public EdificioDeOficinas() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("\n[Edificio de Oficinas]");
        System.out.print("Oficinas por piso: ");
        this.cantOficinas = sc.nextInt();
        System.out.print("Personas por oficina: ");
        this.personasPorOfi = sc.nextInt();
        System.out.print("Cantidad de pisos: ");
        this.cantPisos = sc.nextInt();

        System.out.print("Ancho: ");
        super.ancho = sc.nextDouble();
        System.out.print("Alto: ");
        super.alto = sc.nextDouble();
        System.out.print("Largo: ");
        super.largo = sc.nextDouble();
    }

    public EdificioDeOficinas(int cantOficinas, int personasPorOfi, int cantPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.personasPorOfi = personasPorOfi;
        this.cantPisos = cantPisos;
    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public int getCantPersonas() {
        return personasPorOfi;
    }

    public void setCantPersonas(int personasPorOfi) {
        this.personasPorOfi = personasPorOfi;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    @Override
    public double calcularSuperficie() {
        return this.ancho * this.largo;
    }

    @Override
    public double calcularVolumen() {
        return this.ancho * this.largo * this.alto;
    }

    // Muestre cuantas personas entrarían en un piso y cuantas en todo el edificio.
    public void cantPersonas() {

        int personasPorPiso = this.cantOficinas * this.personasPorOfi;
        System.out.println("Personas por piso: " + personasPorPiso);

        int personasPorEdificio = personasPorPiso * this.cantPisos;
        System.out.println("Personas por edificio: " + personasPorEdificio);

    }

    @Override
    public String toString() {
        return "OfiPorPiso: " + cantOficinas + " / PersonasPorOfi: " + personasPorOfi + " / CantPisos: " + cantPisos + " / " + super.toString();
    }

}
