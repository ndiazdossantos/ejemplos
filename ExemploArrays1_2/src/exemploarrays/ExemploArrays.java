/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays;
import metodos.MetodosArrays;

/**
 *
 * @author noese
 */
public class ExemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MetodosArrays obx1 = new MetodosArrays();
   
       int valores[]={1,2,3,4,5,6,7};
       MetodosArrays.buscar(valores); 
       MetodosArrays.visualizar(valores);
    }
    
}