package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Motor extends Barco {

    protected int cv;

    public Motor() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("[Ingresar barco a motor]");
        System.out.print("Matricula: ");
        super.setMatricula(sc.next());
        System.out.print("Eslora: ");
        super.setEslora(sc.nextInt());
        System.out.print("Año fabricacion: ");
        super.setAnioFabricacion(sc.nextInt());
        System.out.print("Cantidad CV: ");
        this.cv = sc.nextInt();
    }

    public Motor(int cv, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
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
        return super.calculoAlquiler(obj) + this.cv;
    }

    @Override
    public String toString() {
        return "Motor{" + super.toString() + "cv=" + cv + '}';
    }

}
