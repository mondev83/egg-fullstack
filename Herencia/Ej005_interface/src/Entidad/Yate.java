package Entidad;

import java.util.Scanner;

/**
 *
 * @author monde
 */
public class Yate extends Barco {

    protected int cv;
    protected int camarotes;

    public Yate() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("[Ingresar datos barco]");
        System.out.print("Matricula: ");
        super.setMatricula(sc.next());
        System.out.print("Eslora: ");
        super.setEslora(sc.nextInt());
        System.out.print("Año fabricacion: ");
        super.setAnioFabricacion(sc.nextInt());
        System.out.print("Cantidad CV: ");
        this.cv = sc.nextInt();
        System.out.print("Cantidad camarotes: ");
        this.camarotes = sc.nextInt();
    }

    public Yate(int cv, int camarotes, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
    public double calculoAlquiler(Amarre aux) {
        return super.calculoAlquiler(aux) + this.cv + this.camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + super.toString() + "cv=" + cv + ", camarotes=" + camarotes + '}';
    }

}
