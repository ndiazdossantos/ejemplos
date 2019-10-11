/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobexectos;

/**
 *
 * @author ndiazdossantos
 */
public class Exemplobexectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //instanciamos un obxecto
      Alumno pepito = new Alumno();
      pepito.amosar();
      Alumno antia = new Alumno("ant",8);
      antia.amosar();
      antia.setNome("Lucia");
      System.out.println("****"+ antia.getNome());
      /* pepito.darNota(7);
      int vNota = pepito.devolvernota();
      System.out.println(" pepito ten un "+ vNota); */
    }
    
}
