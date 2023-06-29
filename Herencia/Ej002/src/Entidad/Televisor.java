package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Televisor extends Electrodomestico {

    protected Integer resolucion;
    protected boolean tdt;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean tdt, Double precio, String color, Character consEnergia, Integer peso) {
        super(precio, color, consEnergia, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[Datos del Electodoméstico/Televisor] ");
        super.crearElectrodomestico();
        System.out.print("Resolución en pulgadas: ");
        this.resolucion = sc.nextInt();
        System.out.println("Sintonizador TDT: ");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.print("> ");
        char rta = sc.next().charAt(0);
        this.tdt = rta == '1';

    }

    @Override
    public Double precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio *= 1.3d;
        }

        if (this.tdt) {
            this.precio += 500d;
        }

        return this.precio;

    }

    @Override
    public String toString() {
        return "[Televisor]" + "\nResolución = " + resolucion + "\nSintonizador TDT = " + tdt + super.toString();
    }

}
