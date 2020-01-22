/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noesencillito.triangulo;

/**
 *
 * @author noese
 */
public class PerimetroTriangulo {
    public void perimetroTrianguloIsosceles(float base,float altura){
        float lado = (float)Math.sqrt(Math.pow(altura, 2)+Math.pow(base/2, 2));
        float perimetro= 2*lado+base;
        System.out.println("perimetro triangulo= "+perimetro);
    }
    
}
