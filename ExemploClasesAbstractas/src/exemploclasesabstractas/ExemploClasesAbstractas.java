/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesabstractas;

import circulo.Circulo;

/**
 *
 * @author noese
 */
public class ExemploClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Poligonos tri = new Triangulo(4f,2f);
      tri.calcularArea();
      
      Poligonos rec = new Rectangulo(5f,3f);
      rec.calcularArea();
      
      
      //1ero
      Circulo c = new Circulo(2f);
      c.calcularArea();
      //2do lo mismo de otra manera
      Poligonos poli = new Circulo(2f);
      poli.calcularArea();
      
    }
    
}
