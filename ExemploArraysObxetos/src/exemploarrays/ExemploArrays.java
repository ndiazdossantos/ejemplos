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

 
    public static void main(String[] args) {
       Xogador[] futbol = new Xogador[Metodo.elementos()];
       Metodo obx1 = new Metodo();
       obx1.crearArraysProfe(futbol);
     //  obx1.ordenarDorsal(futbol);
      // obx1.amosarArrays(futbol);
       obx1.ordenarNombre(futbol);
       obx1.amosarArrays(futbol);
    }
    
}