package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoInstalacion;
    private boolean key = true;

    public Polideportivo() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("\n[Polideportivo]");
        System.out.print("Nombre: ");
        this.nombre = sc.next();
        System.out.println("Tipo de Instalacion:");
        System.out.println("1. Techado | 2. Abierto");
        System.out.print("» ");

        while (key) {
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    this.tipoInstalacion = "Techado";
                    key = false;
                    break;
                case 2:
                    this.tipoInstalacion = "Abierto";
                    key = false;
                    break;
                default:
                    System.out.println("No existe la opcion!");
            }
        }
        System.out.print("Ancho: ");
        super.ancho = sc.nextDouble();
        System.out.print("Alto: ");
        super.alto = sc.nextDouble();
        System.out.print("Largo: ");
        super.largo = sc.nextDouble();
    }

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return this.ancho * this.largo;
    }

    @Override
    public double calcularVolumen() {
        return this.ancho * this.largo * this.alto;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " / TipoInstalacion: " + tipoInstalacion + " / " + super.toString();
    }

}
