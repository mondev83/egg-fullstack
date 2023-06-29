package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class ServicioAlumno {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listaAlumnos = new ArrayList();

    public void crearAlumno() {

        boolean nuevoAlumno = true;
        
        while (nuevoAlumno) {

            Alumno alumno = new Alumno();
            ArrayList<Integer> listaNotas = new ArrayList<>();
            
            System.out.print("\nNombre alumno: ");
            alumno.setNombre(sc.next());

            for (int i = 0; i < 3; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                int nota = sc.nextInt();

                if (nota > 10) {
                    listaNotas.add(10);
                } else if (nota < 1) {
                    listaNotas.add(1);
                } else {
                    listaNotas.add(nota);
                }
            }

            alumno.setListaNotas(listaNotas);
            listaAlumnos.add(alumno);

            System.out.println("Crear un nuevo alumno? (s/n)");
            char opcion = sc.next().toLowerCase().charAt(0);

            nuevoAlumno = opcion == 's'; // If 's' nuevoAlumno(true) else (false)

        }

    }

    public void buscarAlumno() {

        boolean enLista = false;

        System.out.print("\nNombre del alumno a buscar: ");
        String nombre = sc.next();
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                enLista = true;
                int notaFinal = notaFinal(alumno);
                System.out.println("-----------------");
                System.out.println("Nota final de " + alumno.getNombre() + ": " + notaFinal);
            }
        }
        if (!enLista) {
            System.out.println("-----------------");
            System.out.println("El alumno no forma parte de la lista.");
        }
    }

    public int notaFinal(Alumno alumno) {
        int sumaNotas = 0;
        for (Integer nota : alumno.getListaNotas()) {
            sumaNotas += nota;
        }
        return sumaNotas / alumno.getListaNotas().size();
    }

}
