package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public abstract class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consEnergia;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consEnergia, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consEnergia = consEnergia;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsEnergia() {
        return consEnergia;
    }

    public void setConsEnergia(Character consEnergia) {
        this.consEnergia = consEnergia;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {

        letra = Character.toLowerCase(letra);

        if (letra >= 'a' && letra <= 'f') {
            this.consEnergia = letra;
        } else {
            this.consEnergia = 'f';

        }
    }

    private void comprobarColor(String color) {

        color = color.toLowerCase();

        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};

        for (String aux : colores) {
            if (aux.equals(color)) {
                this.color = color;
                break;
            } else {
                this.color = "Blanco";
            }

        }

    }

    public void crearElectrodomestico() {

        Scanner sc = new Scanner(System.in);
        
        this.precio = 0d;
        
        System.out.print("Color: ");
        this.color = sc.next();
        System.out.print("Peso: ");
        this.peso = sc.nextInt();
        System.out.print("Consumo energético (letras entre A y F): ");
        this.consEnergia = sc.next().charAt(0);

        comprobarConsumoEnergetico(this.consEnergia);
        comprobarColor(this.color);

    }

    public Double precioFinal() {

        switch (this.consEnergia) {
            case 'a':
                this.precio += 1000;
                break;
            case 'b':
                this.precio += 800;
                break;
            case 'c':
                this.precio += 6000;
                break;
            case 'd':
                this.precio += 500;
                break;
            case 'e':
                this.precio += 300;
                break;
            case 'f':
                this.precio += 100;
                break;
        }

        if (peso > 0 && peso < 20) {
            this.precio += 100;
        } else if (peso > 19 && peso < 50) {
            this.precio += 500;
        } else if (peso > 49 && peso < 80) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }

        return this.precio;
    }

    @Override
    public String toString() {
        return "\nColor = " + color + "\nConsumo Energético = " + consEnergia + "\nPeso = " + peso + "\nPrecio = " + precio;
    }
}
