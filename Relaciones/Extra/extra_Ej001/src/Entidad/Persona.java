package Entidad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Persona {

    private String nombre;
    private Map<String, Perro> perrosAdoptados;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.perrosAdoptados = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void adoptarPerro(Perro perro) {
        perro.adoptar();
        perrosAdoptados.put(perro.getNombre(), perro);
    }

    public Perro elegirPerro(Map<String, Perro> perrosEnAdopcion) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("\nLista de perros en adopcion:");
        for (Perro perro : perrosEnAdopcion.values()) {
            if (!perro.adopcion()) {
                System.out.println("[ " + perro.getNombre() + ", " + perro.getRaza() + ", " + perro.getEdad() + " años]");
            }
        }
        while (true) {
            System.out.println("\nHola," + nombre + "! Que perro queres adoptar? (escribir nombre):");
            String nombrePerro = sc.next().toLowerCase();
            if (perrosEnAdopcion.containsKey(nombrePerro)) {
                Perro perroElegido = perrosEnAdopcion.get(nombrePerro);
                if (!perroElegido.adopcion()) {
                    adoptarPerro(perroElegido);
                    return perroElegido;
                } else {
                    System.out.println(nombre + ", ese perro ya fue adoptado.");
                }
            } else {
                System.out.println(nombre + ", ese perro no existe en la lista.");
            }
        }
    }
}
