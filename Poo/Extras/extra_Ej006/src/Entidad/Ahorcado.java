package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Ahorcado {

    private char[] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private String ingresadas;
    private boolean[] palabraParcial;

    // Constructores
    public Ahorcado() {
        this.ingresadas = "";
        this.letrasEncontradas = 0;
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int jugadasMaximas, String ingresadas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.ingresadas = ingresadas;
    }

// Metodos
    public void crearJuego() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la palabra: ");
        String palabraUsuario = scan.next().toUpperCase();

// Se establece longitud del vector
        this.palabra = new char[palabraUsuario.length()];
        this.palabraParcial = new boolean[palabraUsuario.length()];

// Se guarda letra por letra la palabra en el vector        
        //this.palabra = palabraUsuario.toCharArray();
        for (int i = 0; i < this.palabra.length; i++) {
            this.palabra[i] = palabraUsuario.charAt(i);
        }

        System.out.print("Ingrese la cantidad de jugadas maximas: ");
        this.jugadasMaximas = scan.nextInt();
        System.out.println("==================================");
        System.out.println("            JUEGO CREADO");
        System.out.println("==================================");
        System.out.println("");
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + this.palabra.length);
    }

    public void buscar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la letra a buscar: ");

        char letra = Character.toUpperCase(scan.next().charAt(0));

        // Como la variable la inicializo con "", para que no me entre al bucle la primera vuelta
        // lo condiciono a que entre una vez que la variable tenga una letra guardada.
        if (!"".equals(this.ingresadas)) {
            for (int i = 0; i < this.ingresadas.length(); i++) {
                if (this.ingresadas.charAt(i) == (letra)) {
                    System.out.println("La letra [" + letra + "] ya fue ingresada!");
                    System.out.print("Ingrese otra letra: ");
                    letra = Character.toUpperCase(scan.next().charAt(0));
                }
            }
        }
        // Voy concatenando en esta variable para que no me repita letras ingresadas
        this.ingresadas += letra;

        boolean buscar = false;
        for (int i = 0; i < this.palabra.length; i++) {

            if (this.palabra[i] == (letra)) {
                buscar = true;
                //break;
            }
        }

        if (buscar) {
            System.out.println("La letra " + letra + " es parte de la palabra");
        } else {
            System.out.println("La letra " + letra + " NO es parte de la palabra");
            this.jugadasMaximas--;
        }

        encontradas(letra);
    }

    public void encontradas(char letra) {
        int faltantes = 0;
        for (int i = 0; i < this.palabra.length; i++) {

            if (this.palabra[i] == (letra)) {
                this.letrasEncontradas++;
                this.palabraParcial[i] = true;
            }
        }
        faltantes = this.palabra.length - this.letrasEncontradas;
        System.out.println("Numero de letras (encontradas, faltantes): (" + this.letrasEncontradas + "," + Math.abs(faltantes) + ")");
    }

    // idea joaco
    public void mostrar() {

        System.out.print("Palabra parcial: ");
        for (int i = 0; i < palabra.length; i++) {

            if (palabraParcial[i]) {
                System.out.print(palabra[i] + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

    public void intentos() {

        if (this.jugadasMaximas > 0) {
            System.out.println("Intentos restantes: " + this.jugadasMaximas);
            System.out.println("==============================");
        } else {
            System.out.println("");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("Se acabaron las oportunidades. AHORCADO!!");
            System.out.println("La palabra era: " + toString().toUpperCase());
            System.out.println("");
        }
    }

    public void juego() {

        crearJuego();

        while (this.jugadasMaximas > 0 && this.letrasEncontradas != this.palabra.length) {
            buscar();
            mostrar();
            longitud();
            intentos();

            if (this.letrasEncontradas == this.palabra.length) {
                System.out.println("");
                System.out.println("/////////////////////////////////////////////");
                System.out.println("            Descubrio la palabra: " + toString());
                System.out.println("//////////////////////////////////////////////");
                System.out.println("");

            }
        }
    }

    public String toString() {

        // Paso el array palabra a string;
        String palabra = String.valueOf(this.palabra);

        return palabra.toUpperCase();
    }
}
