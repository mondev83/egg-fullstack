package Servicio;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalServicio;
import Entidad.Profesor;
import Enumaracion.CursoDepto;
import Enumaracion.EstadoCivil;
import Enumaracion.Seccion;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class ServicioPersona {

    List<Persona> listaPersonas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    boolean loop = true;

    public void constructorParametros() {
        Persona a1 = new Estudiante(CursoDepto.LENGUAJES, "Antonio Rios", 30405061, EstadoCivil.SOLTERO);
        Persona a2 = new Estudiante(CursoDepto.FULLSTACK, "David Bisbal", 30405060, EstadoCivil.SOLTERO);
        Persona p1 = new Profesor(CursoDepto.LENGUAJES, 2010, 10, "Hector Jirafales", 13704050, EstadoCivil.CASADO);
        Persona s1 = new PersonalServicio(Seccion.SECRETARIA, 2000, 20, "Tita Merelo", 4050601, EstadoCivil.VIUDO);

        listaPersonas.add(a1);
        listaPersonas.add(a2);
        listaPersonas.add(p1);
        listaPersonas.add(s1);
    }

    public void constructorVacio() {

        while (loop) {            
            
            System.out.println("[Tipo de persona a cargar]");
            System.out.println("1. Estudiante");
            System.out.println("2. Profesor");
            System.out.println("3. Personal Servicio");
            System.out.print("» ");
            char opc = sc.next().charAt(0);
            clearConsole();
            switch (opc) {
                case '1':
                    Persona estudiante = new Estudiante();
                    listaPersonas.add(estudiante);
                    break;
                case '2':
                    Persona profesor = new Profesor();
                    listaPersonas.add(profesor);
                    break;
                case '3':
                    Persona personal = new PersonalServicio();
                    listaPersonas.add(personal);
                    break;
                default:
                    System.out.println("Opcion no valida!");
            }
            continuar();
        }
        loop = true;
    }

    public void modificarPersona() {
        boolean key = false;

        while (loop) {            
            
            System.out.print("Ingrese DNI de la persona: ");
            int dni = sc.nextInt();

            for (Persona persona : listaPersonas) {
                if (dni == persona.getDni()) {
                    System.out.println("\nEl DNI ingresado corresponde a: " + persona.getNombreCompleto());

                    System.out.println("\nSeleccione que accion desea realizar:");
                    System.out.println("1. Modificar estado civil"); // todos
                    System.out.println("2. Reasignacion despacho"); // profesor
                    System.out.println("3. Reasignacion curso estudiante"); // estudiante
                    System.out.println("4. Cambio departamento profesor"); // profesor
                    System.out.println("5. Cambio seccion personal servicio"); // personal servicio
                    System.out.print("» ");
                    int opcion = sc.nextInt();
                    clearConsole();

                    switch (opcion) {
                        case 1:
                            cambioEstadoCivil(persona);
                            System.out.println("\nEstado civil actualizado: " + persona.getEstadoCivil());
                            key = true;
                            break;
                        case 2:
                            if (persona instanceof Empleado) {
                                Empleado empleado = (Empleado) persona;
                                reasignarDespacho(empleado);
                            } else {
                                System.out.println("El DNI no corresponde a un empleado!");
                            }
                            key = true;
                            break;
                        case 3:
                            if (persona instanceof Estudiante) {
                                Estudiante estudiante = (Estudiante) persona;
                                reasignarCurso(estudiante);
                            } else {
                                System.out.println("El DNI no corresponde a un estudiante!");
                            }
                            key = true;
                            break;
                        case 4:
                            if (persona instanceof Profesor) {
                                Profesor profesor = (Profesor) persona;
                                reasignarDepartamento(profesor);
                            } else {
                                System.out.println("El DNI no corresponde a un profesor!");
                            }
                            key = true;
                            break;
                        case 5:
                            if (persona instanceof PersonalServicio) {
                                PersonalServicio personal = (PersonalServicio) persona;
                                reasignarSeccion(personal);
                            } else {
                                System.out.println("El DNI no corresponde a un personal de servicio!");
                            }
                            key = true;
                            break;
                        default:
                            System.out.println("Opcion no valida!");
                    }
                    break;
                }
            }
            if (!key) {
                System.out.println("No se encontró ninguna persona con el DNI ingresado.");
            }
            continuar();
        }
        loop = true;
    }

    public void cambioEstadoCivil(Persona aux) {

        System.out.println("\nEl estado civil actual es: " + aux.getEstadoCivil());
        System.out.println("Actualizar estado civil a: ");
        System.out.println("1. Soltero");
        System.out.println("2. Casado");
        System.out.println("3. Divociado");
        System.out.println("4. Viudo");
        System.out.print("» ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                aux.setEstadoCivil(EstadoCivil.SOLTERO);
                break;
            case 2:
                aux.setEstadoCivil(EstadoCivil.CASADO);
                break;
            case 3:
                aux.setEstadoCivil(EstadoCivil.DIVORCIADO);
                break;
            case 4:
                aux.setEstadoCivil(EstadoCivil.VIUDO);
                break;
        }

    }

    private void reasignarDespacho(Empleado aux) {

        System.out.println("\nEl despacho actual es: " + aux.getNumDespacho());
        System.out.println("Actualizar numero de despacho a: ");
        aux.setNumDespacho(sc.nextInt());
        System.out.println("Despacho actualizado a: " + aux.getNumDespacho());

    }

    private void reasignarCurso(Estudiante aux) {

        System.out.println("\nEl curso actual es: " + aux.getCurso());
        System.out.println("Actualizar curso a: ");
        System.out.println("1. Matematica");
        System.out.println("2. Lenguajes");
        System.out.println("3. Arquitectura");
        System.out.println("4. FullStack");
        System.out.print("» ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                aux.setCurso(CursoDepto.MATEMATICA);
                break;
            case 2:
                aux.setCurso(CursoDepto.LENGUAJES);
                break;
            case 3:
                aux.setCurso(CursoDepto.ARQUITECTURA);
                break;
            case 4:
                aux.setCurso(CursoDepto.FULLSTACK);
                break;
        }
        System.out.println("Curso actualizado a: " + aux.getCurso());
    }

    private void reasignarDepartamento(Profesor aux) {

        System.out.println("\nEl departamento actual es: " + aux.getDepartamento());
        System.out.println("Actualizar departamento a: ");
        System.out.println("1. Matematica");
        System.out.println("2. Lenguajes");
        System.out.println("3. Arquitectura");
        System.out.println("4. FullStack");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                aux.setDepartamento(CursoDepto.MATEMATICA);
                break;
            case 2:
                aux.setDepartamento(CursoDepto.LENGUAJES);
                break;
            case 3:
                aux.setDepartamento(CursoDepto.ARQUITECTURA);
                break;
            case 4:
                aux.setDepartamento(CursoDepto.FULLSTACK);
                break;
        }
        System.out.println("Departamento actualizado a: " + aux.getDepartamento());

    }

    private void reasignarSeccion(PersonalServicio aux) {

        System.out.println("\nLa seccion actual del empleado es: " + aux.getSeccion());
        System.out.println("Actualizar seccion a: ");
        System.out.println("1. Biblioteca");
        System.out.println("2. Decanato");
        System.out.println("3. Secretaria");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                aux.setSeccion(Seccion.BIBLIOTECA);
                break;
            case 2:
                aux.setSeccion(Seccion.DECANATO);
                break;
            case 3:
                aux.setSeccion(Seccion.SECRETARIA);
                break;
        }
        System.out.println("Seccion actualizada a: " + aux.getSeccion());
    }

    public void listadoPersonas() {
        System.out.println("Listado completo de personas:");
        for (Persona persona : listaPersonas) {

            if (persona instanceof Estudiante) {
                Estudiante alumno = (Estudiante) persona;
                System.out.println(alumno.toString());
            }
            if (persona instanceof Profesor) {
                Profesor profesor = (Profesor) persona;
                System.out.println(profesor.toString());
            }
            if (persona instanceof PersonalServicio) {
                PersonalServicio personal = (PersonalServicio) persona;
                System.out.println(personal.toString());

            }
        }

    }

    private void continuar() {
        System.out.print("\nRealizar nueva operacion? (s/n): ");
        char opc = sc.next().toLowerCase().charAt(0);
        loop = opc == 's';
        clearConsole();
    }

    public static void clearConsole() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(50); // Delay para limpiar controla
        } catch (AWTException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            ex.printStackTrace();
        }
    }

}
