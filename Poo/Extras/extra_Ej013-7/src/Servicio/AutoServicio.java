package Servicio;

import Entidad.Auto;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class AutoServicio {

    Auto fichaAuto = new Auto();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Auto cargarAuto() {
String [] carnet =  new String[3];
        System.out.print("Nombre del titular: ");
        fichaAuto.setTitular(sc.next());
        
        System.out.println("Vencimiento carnet (dd/mm/aaaa):");
        System.out.print("Día: ");carnet[0] = sc.next();
        System.out.print("Mes: ");carnet[1] = sc.next();
        System.out.print("Año: ");carnet[2] = sc.next();
        fichaAuto.setVencCarnet(carnet);
        
        System.out.print("Color del vehículo: ");
        fichaAuto.setColor(sc.next());
        
        System.out.print("Modelo del vehículo (año): ");
        fichaAuto.setModelo(sc.nextInt());

        return fichaAuto;
    }

    public void cambioTitular() {

        System.out.print("\nDesea cambiar el titular? (S/N): ");
        char opc = sc.next().toLowerCase().charAt(0);

        if (opc == 's') {
            System.out.println("Titular actual del vehículo: " + fichaAuto.getTitular());
            System.out.print("Ingrese el nombre del nuevo titular: ");
            fichaAuto.setTitular(sc.next());
        }

    }

    public void nuevoTrayecto() {

        System.out.print("\nIndique el trayecto recorrido en km: ");
        int kms = sc.nextInt();
        fichaAuto.setKm(kms + fichaAuto.getKm());
        System.out.println("El vehículo tiene " + fichaAuto.getKm() + " totales.");
    }

    public boolean serviceVehiculo() {

        int kms = 10000;
        boolean service = false;

        if (fichaAuto.getKm() > kms) {
            System.out.println("El supero los " + kms + " kms, debe realizar el service.");
            service = true;
        } else {
            System.out.println("Faltan recorrer " + (kms - fichaAuto.getKm())
                    + " km para hacer el service.");
        }
return service;
    }

    public void mostraFicha() {
        System.out.println(fichaAuto.toString());
    }

}
