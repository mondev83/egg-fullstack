/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import java.util.List;
import libreria.entidades.Autor;
import libreria.servicios.AutorServicio;

/**
 *
 * @author Urano
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        AutorServicio autorServ = new AutorServicio();
        Autor autor = new Autor(451);
        Autor autor1 = new Autor(null, "Sebas", true);
        Autor autor2 = new Autor(null, "Horacio", true);
        Autor autor3 = new Autor(null, "Chiquito", true);
        
//        autorServ.crearAutor(autor);
//        autorServ.crearAutor(autor1);
//        autorServ.crearAutor(autor2);
//        autorServ.crearAutor(autor3);
        
        autorServ.eliminar(autor);
        
        List <Autor> autores = autorServ.listaAutores();
        
        for (Autor a : autores) {
            System.out.println("id: " + a.getId());
            System.out.println("nombre: " + a.getNombre());
            System.out.println("alta: " + a.getAlta());
        }
        
        
    }
    
}
