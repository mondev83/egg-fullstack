package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Velero extends Barco {

    protected int numMastiles;

    public Velero() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("[Ingresar Velero]");
        System.out.print("Matricula: ");
        super.setMatricula(sc.next());
        System.out.print("Eslora: ");
        super.setEslora(sc.nextInt());
        System.out.print("Año fabricacion: ");
        super.setAnioFabricacion(sc.nextInt());
        System.out.print("Cantidad Mastiles: ");
        this.numMastiles = sc.nextInt();
    }

    public Velero(int numMastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int getEslora() {
        return eslora;
    }

    @Override
    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    @Override
    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    @Override
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public double calculoAlquiler(Amarre obj) {
        return super.calculoAlquiler(obj) + this.numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + super.toString() + "numMastiles=" + numMastiles + '}';
    }

}
