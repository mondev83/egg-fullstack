package Entidad;

import Interface.Alquiler;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author monde
 */
public abstract class Barco implements Alquiler {

    protected String matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    /*ALQUILER_BARCO
    NUMERO DIAS = EGRESO-INGRESO
    VALOR MODULO = ESLORA * 10 (EN METROS)
    NUMERO DIAS * VALOR MODULO*/
    @Override
    public double calculoAlquiler(Amarre aux) {

        LocalDate fechaIngreso = aux.getFechaAquiler();
        LocalDate fechaEgreso = aux.getFechaDevolucion();
        
        double numeroDias = Period.between(fechaIngreso, fechaEgreso).getDays();
        double valorModulo = this.eslora*10;

        return numeroDias*valorModulo;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion;
    }

}
