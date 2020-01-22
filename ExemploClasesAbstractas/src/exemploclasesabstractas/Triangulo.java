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
public class Triangulo extends Poligonos {
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public void calcularArea(){
        System.out.println(" Area triangulo "+ base*altura/2);
    }
}
