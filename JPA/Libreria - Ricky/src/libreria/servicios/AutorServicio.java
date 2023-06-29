/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import libreria.entidades.Autor;

/**
 *
 * @author Urano
 */
public class AutorServicio {
    
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("LibreriaPU");
    private EntityManager em = EMF.createEntityManager();
    
   
    public void crearAutor(Autor autor) {
        try {
           em.getTransaction().begin(); // inicia transaccion
           em.persist(autor);          
           em.getTransaction().commit(); //inserta transaccion
           
       } catch (Exception e) {
           em.getTransaction().rollback();
       }
    
    
    }
//    public void agregarAutor() {
//         Autor autor = new Autor();
//         autor.setNombre("Borges");
//         autor.setAlta(true);
//         
//         em.getTransaction().begin();
//         em.persist(autor);
//         em.getTransaction().commit();
         
    
//}
   public void eliminar(Autor autor) {
       try {
           em.getTransaction().begin(); // inicia transaccion
           em.remove(em.merge(autor));
           em.getTransaction().commit(); //inserta transaccion
           
       } catch (Exception e) {
           em.getTransaction().rollback();
       }
   
   
   }
   
   public void modificar(Autor autor) {
       try {
           em.getTransaction().begin(); // inicia transaccion
           em.merge(autor);
           em.getTransaction().commit(); //inserta transaccion
           
       } catch (Exception e) {
           em.getTransaction().rollback();
       }
   
   
   }
   
   public List<Autor> listaAutores(){
       Query q = em.createQuery("SELECT a FROM Autor a");
       return q.getResultList();
   
   
   
   }
}
