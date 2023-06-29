package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Lavadora extends Electrodomestico {

    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, Character consEnergia, Integer peso) {
        super(precio, color, consEnergia, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[Datos del Electodoméstico/Lavadora] ");
        super.crearElectrodomestico();
        System.out.print("Capacidad de carga: ");
        this.carga = sc.nextInt();

    }

    @Override
    public Double precioFinal() {
        super.precioFinal();
        
        if (carga > 30) {
            this.precio += 500;
        }
        return this.precio;
    }

    @Override
    public String toString() {
        return "[Lavadora]" + "\nCarga = " + carga + super.toString();
    }

}
