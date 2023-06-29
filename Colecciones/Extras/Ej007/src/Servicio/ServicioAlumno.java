package Servicio;

import Entidad.Alumno;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author monde
 */
public class ServicioAlumno {

    private List<Alumno> listaAlumnos = new ArrayList<>();

    public void baseAlumnos() {

        altaAlumno(new Alumno("Juan", "Perez", LocalDate.of(2001, 4, 20), "Argentina"));
        altaAlumno(new Alumno("Maria", "Gonzalez", LocalDate.of(2002, 6, 10), "Chilena"));
        altaAlumno(new Alumno("Pedro", "Fernández", LocalDate.of(2003, 8, 5), "Venezolana"));
        altaAlumno(new Alumno("Lucia", "Martinez", LocalDate.of(2000, 10, 15), "Argentina"));
        altaAlumno(new Alumno("Jorge", "Garcia", LocalDate.of(2001, 7, 25), "Chilena"));
        altaAlumno(new Alumno("Ana", "Sanchez", LocalDate.of(2003, 3, 7), "Venezolana"));
        altaAlumno(new Alumno("Diego", "Rodriguez", LocalDate.of(2002, 12, 30), "Argentina"));
        altaAlumno(new Alumno("Laura", "Lopez", LocalDate.of(2001, 9, 2), "Chilena"));
        altaAlumno(new Alumno("Carlos", "Gomez", LocalDate.of(2002, 2, 28), "Venezolana"));
        altaAlumno(new Alumno("Florencia", "Diaz", LocalDate.of(2003, 11, 17), "Argentina"));
        altaAlumno(new Alumno("Gustavo", "Hernandez", LocalDate.of(2000, 8, 7), "Chilena"));
        altaAlumno(new Alumno("Carla", "Perez", LocalDate.of(2001, 5, 21), "Venezolana"));
        altaAlumno(new Alumno("Luis", "Garcia", LocalDate.of(2002, 10, 2), "Argentina"));
        altaAlumno(new Alumno("Marta", "Sanchez", LocalDate.of(2003, 1, 15), "Chilena"));
        altaAlumno(new Alumno("Javier", "Gonzalez", LocalDate.of(2000, 12, 5), "Venezolana"));
        altaAlumno(new Alumno("Sofia", "Fernandez", LocalDate.of(2001, 3, 30), "Argentina"));
        altaAlumno(new Alumno("Lucas", "Martinez", LocalDate.of(2002, 5, 17), "Chilena"));
        altaAlumno(new Alumno("Juan", "Torres", LocalDate.of(1992, 5, 1), "Argentina"));
        altaAlumno(new Alumno("Pedro", "Gomez", LocalDate.of(1994, 10, 13), "Chilena"));
        altaAlumno(new Alumno("Maria", "Garcia", LocalDate.of(1991, 2, 28), "Argentina"));
    }

    public void altaAlumno(Alumno alumno) {
        this.listaAlumnos.add(alumno);
    }

    public void bajaAlumno(Alumno alumno) {
        this.listaAlumnos.remove(alumno);
    }

    public void modificarAlumno() {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Desea modificar algún alumno: (s/n)");
        char opc = sc.next().toLowerCase().charAt(0);

        if (opc == 's') {
            System.out.print("Ingrese el nombre del alumno/a a modificar: ");
            String nombre = sc.next();
            System.out.print("Ingrese el apellido del alumno/a a modificar: ");
            String apellido = sc.next();

            Alumno alumno = this.listaAlumnos.stream()
                    .filter(a -> a.getNombre().equalsIgnoreCase(nombre) && a.getApellido().equalsIgnoreCase(apellido))
                    .findFirst()
                    .orElse(null);

            if (alumno != null) {
                System.out.print("Ingrese nuevo nombre: ");
                alumno.setNombre(sc.next());
                System.out.print("Ingrese nuevo apellido: ");
                alumno.setApellido(sc.next());

                System.out.println("Ingrese nueva nacionalidad:");
                System.out.println("1. Argentina");
                System.out.println("2. Chilena");
                System.out.println("3. Venezolana");
                System.out.print("» ");
                byte opcion = sc.nextByte();
                switch (opcion) {
                    case 1:
                        alumno.setNacionalidad("Argentina");
                        break;
                    case 2:
                        alumno.setNacionalidad("Chilena");
                        break;
                    case 3:
                        alumno.setNacionalidad("Venezolana");
                        break;
                    default:
                        System.out.println("No existe la opción!");
                }
                
            } else {
                System.out.println("» El alumno ingresado no existe!");
            }
        }
    }

    public List<Alumno> ordenarPorApellidoAsc() {
        return this.listaAlumnos.stream()
                .sorted(Comparator.comparing(Alumno::getApellido))
                .collect(Collectors.toList());
    }

    public List<Alumno> ordenarPorNombreDesc() {
        return this.listaAlumnos.stream()
                .sorted(Comparator.comparing(Alumno::getNombre).reversed())
                .collect(Collectors.toList());
    }

    public int calcularEdadAlumno(String nombre, String apellido) {
        Alumno alumno = this.listaAlumnos.stream()
                .filter(a -> a.getNombre().equalsIgnoreCase(nombre) && a.getApellido().equalsIgnoreCase(apellido))
                .findFirst()
                .orElse(null);
        if (alumno != null) {
            LocalDate fechaNacimiento = alumno.getFechaNacimiento();
            LocalDate fechaActual = LocalDate.now();
            return Period.between(fechaNacimiento, fechaActual).getYears();
        } else {
            return -1;

        }

    }

    public List<Alumno> ordenarPorNacionalidad(String nacionalidad) {
        return this.listaAlumnos.stream()
                .filter(alumno -> alumno.getNacionalidad().equalsIgnoreCase(nacionalidad))
                .collect(Collectors.toList());
    }

    public void reportFinal() {

        //System.out.println("[ REPORTE FINAL DE ALUMNOS]");
        // Lista para ordenar por apellido
        List<Alumno> listaPorApellido = ordenarPorApellidoAsc();
        System.out.println("\n» Lista de alumnos/as por apellido ascendente: ");
        listaPorApellido.forEach(System.out::println);

        // Lista para ordenar por apellido
        List<Alumno> listaPorNombre = ordenarPorNombreDesc();
        System.out.println("\n» Lista de alumnos/as por nombre descendente: ");
        listaPorNombre.forEach(System.out::println);

        // Calcular edad alumno
        String nombre = "Maria";
        String apellido = "Garcia";
        int edad = calcularEdadAlumno(nombre, apellido);
        System.out.println("\n» La edad de " + nombre + " " + apellido + " es: " + edad);

        // Creo una lista nueva para filtrar solo los mayores de 25
        List<Alumno> listaMayores25 = this.listaAlumnos.stream()
                .filter(alumno -> Period.between(alumno.getFechaNacimiento(), LocalDate.now()).getYears() > 25)
                .collect(Collectors.toList());

        // Creo una lista nueva para filtrar los apellidos con L y P
        List<Alumno> listaApellidosLP = this.listaAlumnos.stream()
                .filter(alumno -> alumno.getApellido().startsWith("L") || alumno.getApellido().startsWith("P"))
                .collect(Collectors.toList());

        // Creo listas por nacionalidad
        List<Alumno> listaNacionalidadArg = this.listaAlumnos.stream()
                .filter(alumno -> alumno.getNacionalidad().contains("Argentina"))
                .collect(Collectors.toList());
        System.out.println("\n» Lista alumnos Argentinos: ");
        listaNacionalidadArg.forEach(System.out::println);

        List<Alumno> listaNacionalidadChi = this.listaAlumnos.stream()
                .filter(alumno -> alumno.getNacionalidad().contains("Chilena"))
                .collect(Collectors.toList());
        System.out.println("\n» Lista alumnos Chilenos");
        listaNacionalidadChi.forEach(System.out::println);

        List<Alumno> listaNacionalidadVen = this.listaAlumnos.stream()
                .filter(alumno -> alumno.getNacionalidad().contains("Venezolana"))
                .collect(Collectors.toList());
        System.out.println("\n» Lista alumnos Venezolanos: ");
        listaNacionalidadVen.forEach(System.out::println);

        System.out.println("\n[ CANTIDAD ALUMNOS ]");
        System.out.println("» Mayores de 25 años: " + listaMayores25.size());
        System.out.println("» Apellido que comienza con L o P: " + listaApellidosLP.size());
        System.out.println("» Argentinos: " + ordenarPorNacionalidad("Argentina").size());
        System.out.println("» Chilenos: " + ordenarPorNacionalidad("Chilena").size());
        System.out.println("» Venezolanos: " + ordenarPorNacionalidad("Venezolana").size());

    }

}
