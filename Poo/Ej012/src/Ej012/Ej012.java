
package Ej012;

import Entidad.Persona;
import Servicio.PersonaServicio;


public class Ej012 {

    
    public static void main(String[] args) {
        
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        
        System.out.println(ps.menorQue(p1));
        System.out.println(ps.mostrarPersona(p1));
    }
    
}
