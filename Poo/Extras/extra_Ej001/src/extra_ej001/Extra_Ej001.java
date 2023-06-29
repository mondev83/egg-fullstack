package extra_ej001;

/**
 *
 * @author monde
 */
public class Extra_Ej001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static class Cancion {

        private String titulo;
        private String autor;

        public Cancion() {
            this.titulo = "";
            this.autor = "";
        }

        public Cancion(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

    }

}
