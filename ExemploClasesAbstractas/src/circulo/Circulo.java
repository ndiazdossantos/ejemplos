/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

import exemploclasesabstractas.Poligonos;

/**
 *
 * @author noese
 */
public class Circulo extends Poligonos {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    
    @Override
    public void calcularArea(){
        System.out.println(" Area circulo = "+ (Math.PI*Math.pow(radio, 2)));
        
    }
    
}
