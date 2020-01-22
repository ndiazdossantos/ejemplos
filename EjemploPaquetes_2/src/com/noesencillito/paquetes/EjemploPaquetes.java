/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noesencillito.paquetes;
import com.noesencillito.circulo.AreaCirculo;
import com.noesencillito.circulo.Lonxitude;
import com.noesencillito.triangulo.PerimetroTriangulo;
import validaciones.Validar;

/**
 *
 * @author noese
 */
public class EjemploPaquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        com.noesencillito.triangulo.Area tri = new com.noesencillito.triangulo.Area();
        tri.areaTriangulo(6f, 2f);
        PerimetroTriangulo per = new PerimetroTriangulo();
        per.perimetroTrianguloIsosceles(6f, 2f);
        AreaCirculo acir = new AreaCirculo();
        acir.superficieCirculo(6);
        Lonxitude lcir = new Lonxitude();
        lcir.lonxitudeCirculo(6);
        Metodos aux = new Metodos();
        float base=aux.validaFloatPositivo();
        float altura= aux.validaFloatPositivo();
        com.noesencillito.rectangulo.Area rec = new com.noesencillito.rectangulo.Area();
        rec.areaRectangulo(base, altura);
        // static
        float b = Metodos.darValor();
        float alt= Metodos.darValor();
        float n=Validar.validaFloatPositivo();
        
    }
    }
