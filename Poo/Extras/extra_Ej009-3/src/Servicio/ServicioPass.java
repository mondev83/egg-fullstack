package Servicio;

import Entidad.Pass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author monde
 */
public class ServicioPass {

    Scanner scan = new Scanner(System.in);

    Pass usr = new Pass();
    Pass usr1 = new Pass("Juan", 30405060);
    Pass usr2 = new Pass("Pedro", 30405061);
    Pass usr3 = new Pass("Laura", 30405062);

    public Pass crearPass(Pass usr) {
        
        System.out.println("Ingrese la contraseña:");
        usr.setPass(scan.next());

        while (usr.getPass().length() != 4) {
            System.out.println("La contraseña debe ser de 10 caracteres.");
            usr.setPass(scan.next());
        }
        return usr;
    }

    public String analizarPass(Pass usr) {
        int z = 0;
        int a = 0;
        String validar = "";

        for (int i = 0; i < usr.getPass().length(); i++) {
            if (usr.getPass().charAt(i) == 'z') {
                z++;
            }
            if (usr.getPass().charAt(i) == 'a') {
                a++;
            }
        }

        if (z >= 1 && a >= 2) {
            validar = "Nivel de contraseña ALTO";
        } else if (z >= 1 && a < 2) {
            validar = "Nivel de contraseña MEDIO";
        } else {
            validar = "Nivel de contraseña BAJO";
        }
        return validar;
    }

    public void modificarPass(Pass usr) {

        int cont = 0;

        System.out.println("Ingrese su contraseña actual:");
        String validarPass = scan.next();

        while (!validarPass.equals(usr.getPass()) && cont < 4) {
            System.out.println("Contraseña incorrecta, intentelo nuevamente." + cont + "/3");
            cont++;
            validarPass = scan.next();
        }

        if (validarPass.equals(usr.getPass())) {
            crearPass(usr);
        }

        if (cont == 3) {
            System.out.println("Supero el limite de intentos. Usuario bloqueado");
        }

    }

    public void modificarNombre(Pass usr) {

        int cont = 0;

        System.out.println("Ingrese su contraseña actual:");
        String validarPass = scan.next();

        while (!validarPass.equals(usr.getPass()) && cont < 4) {
            System.out.println("Contraseña incorrecta, intentelo nuevamente." + cont + "/3");
            cont++;
            validarPass = scan.next();
        }

        if (validarPass.equals(usr.getPass())) {
            System.out.println("Ingrese nuevo nombre: ");
            usr.setNombre(scan.next());
        }

        if (cont == 3) {
            System.out.println("Supero el limite de intentos. Usuario bloqueado");
        }

    }

    public void modificarDni(Pass usr) {

        int cont = 0;

        System.out.println("Ingrese su contraseña actual:");
        String validarPass = scan.next();

        while (!validarPass.equals(usr.getPass()) && cont < 4) {
            System.out.println("Contraseña incorrecta, intentelo nuevamente." + cont + "/3");
            cont++;
            validarPass = scan.next();
        }

        if (validarPass.equals(usr.getPass())) {
            System.out.println("Ingrese nuevo DNI: ");
            usr.setDni(scan.nextInt());
        }

        if (cont == 3) {
            System.out.println("Supero el limite de intentos. Usuario bloqueado");
        }

    }

    public void menuOpciones(Pass usr) {

        boolean salir = false;
        boolean pass = false;

        while (salir == false) {
            System.out.println("");
            System.out.println("-------");
            System.out.println("[Ingrese la opción deseada]");
            System.out.println("1. Ingrese la contraseña");
            System.out.println("2. Nivel seguridad de contraseña");
            System.out.println("3. Modificar Contraseña");
            System.out.println("4. Modificar Nombre");
            System.out.println("5. Modificar DNI");
            System.out.println("6. Datos del Usuario");
            System.out.println("9. Cambiar de usuario");
            System.out.println("0. Salir");
            System.out.print("» ");
            int opcion = scan.nextInt();
            clearConsole();
            if (opcion == 1) {
                crearPass(usr);
                pass = true;
            }
            if (opcion == 2 && pass == true) {
                System.out.println(analizarPass(usr));
            }
            if (opcion == 3 && pass == true) {
                modificarPass(usr);
            }
            if (opcion == 4 && pass == true) {
                modificarNombre(usr);
            }
            if (opcion == 5 && pass == true) {
                modificarDni(usr);
            }
            if (opcion == 6) {
                System.out.println(usr.toString());
            }
            if (opcion == 9) {
                menuUsr();
            }
            if (opcion == 0) {
                System.out.println("Saliendo!");
                salir = true;
            }
            if (pass == false) {
                System.out.println("Contraseña sin iniciar");
            }
        }
    }

    public Pass menuUsr() {
        System.out.print("Ingrese su DNI: ");
        int dni = scan.nextInt();

        if (dni == usr1.getDni()) {
            System.out.println("Bienvenido/a " + usr1.getNombre());
            menuOpciones(usr1);
        } else if (dni == usr2.getDni()) {
            System.out.println("Bienvenido/a " + usr2.getNombre());
            menuOpciones(usr2);
        } else if (dni == usr3.getDni()) {
            System.out.println("Bienvenido/a " + usr3.getNombre());
            menuOpciones(usr3);
        } else {
            System.out.println("Usuario inexistente!");
        }
        return usr;
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
