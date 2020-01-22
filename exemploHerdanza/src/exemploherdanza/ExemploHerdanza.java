/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherdanza;

/**
 *
 * @author noese
 */
public class ExemploHerdanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Revista obx1 = new Revista(35,20,"Jueves");
        System.out.println(obx1.toString());
        System.out.println(obx1); // == anterior
        Libro obx2 = new Libro(40,15,"8347a","Pepe","La Vida");
        System.out.println(obx2);
        
        
        //polimorfismo
        Publicacion lib= new Libro(200,3.5f,"paco","la vela","203a");
        System.out.println(lib);
        
        Publicacion revis = new Revista(700,50.3f,"El diario");
        System.out.println(revis);
        
        lib.amosar();
        revis.amosar();
        
   
           
           
    }
    
}
