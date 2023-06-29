/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);

        // Intanciamos un obejto persona con sus atributos vacios
        Persona p1 = new Persona();
        
        System.out.println("Ingrese el nombre:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el apodo:");
        p1.setApodo(leer.next());
        System.out.println("Ingrese la edad:");
        p1.setEdad(leer.nextInt());

        // Este método retorna un objeto persona con sus atributos
        // lleno de informacion
        return p1;

    }

    public void mostrarPersona(Persona p1) {

        System.out.println("El nombre es: " + p1.getNombre());
        System.out.println("El apodo es: " + p1.getApodo());
        System.out.println("La edad es: " + p1.getEdad());
    }

}
