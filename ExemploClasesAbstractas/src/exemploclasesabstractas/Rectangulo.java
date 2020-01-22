/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesabstractas;

/**
 *
 * @author noese
 */
public class Rectangulo extends Cuadrilatero {

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

   
    
   @Override
   public void calcularArea(){
       // Cuadrilatero cu = new Rectangulo();  no podemos instanciar un obxecto por ser abstracto
     // 2 Cuadrilatero cu = new Rectangulo();
     // 2  System.out.println("Area rectangulo = "+ (cu.getBase()* super.getAltura())); // si ponemos super nos lleva a la superclase, son dos formas de hacerlo , creamos un objeto referenciado
                                                                                    // o accedemos a este dato mediante super
       System.out.println(" Area rectangulo "+super.getAltura()*super.getBase());
   }
}
