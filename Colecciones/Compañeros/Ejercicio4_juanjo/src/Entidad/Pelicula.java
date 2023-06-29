package Entidad;


public class Pelicula {
    
//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el t�tulo, director y duraci�n de la pel�cula (en horas).
//Implemente las clases y m�todos necesarios para esta situaci�n, teniendo en cuenta lo
//que se pide a continuaci�n:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidi�ndole al usuario
//todos sus datos y guard�ndolos en el objeto Pelicula.
//Despu�s, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Despu�s de ese bucle realizaremos las siguientes acciones:
    
    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
    
    
}
