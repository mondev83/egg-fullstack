package Entidad;

import java.util.Arrays;

public class Curso {

    private String nombreCurso;
    private String turno;
    private double cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

   

    @Override
    public String toString() {
        return "{Datos del Curso}"
                + "\n Nombre : " + nombreCurso
                + "\n Turno: " + turno
                + "\n Horas por día: " + cantidadHorasPorDia
                + "\n Dias por semana: " + cantidadDiasPorSemana
                + "\n Precio por hora: $" + precioPorHora
                + "\n Alumnos: " + Arrays.toString(alumnos);
    }

}
