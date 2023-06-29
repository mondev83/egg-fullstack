/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pooejguia;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author monde
 */
public class POOEjGuia {

    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        ps.mostrarPersona(p1);

    }
}
