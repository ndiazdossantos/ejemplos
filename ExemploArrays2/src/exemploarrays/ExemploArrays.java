/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays;

/**
 *
 * @author noese
 */
public class ExemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Metodo obx1 = new Metodo();
       obx1.crearArrays();
       obx1.amosar();
       //creamos array
       int valores[]={1,2,3,4,5};
       obx1.visualizar(valores);
       
       // creamos un array de 3 elementos
        System.out.println("Creo array en main");
       int[]datos=new int[3];
       datos=obx1.encherArrays(datos);
       obx1.visualizar(datos);
    }
    
}