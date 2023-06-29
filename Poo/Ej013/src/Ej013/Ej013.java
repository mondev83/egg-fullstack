
package Ej013;

import Entidad.Curso;
import Service.CursoServicio;
import java.util.Arrays;


public class Ej013 {

    
    public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        Curso c1 = cs.crearCurso();
        
             System.out.println(c1.toString());
             cs.calcularGananciaSemanal(c1);
    }
    
}
