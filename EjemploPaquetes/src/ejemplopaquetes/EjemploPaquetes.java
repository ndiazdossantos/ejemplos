/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopaquetes;
import triangulo.AreaTriangulo;
import triangulo.PerimetroTriangulo;
import circulo.*; //importo todas as clases do paquete
import rectangulo.*;

/**
 *
 * @author noese
 */
public class EjemploPaquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AreaTriangulo tri = new AreaTriangulo();
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
        Area rec = new Area();
        rec.areaRectangulo(base, altura);
        // static
        float b = Metodos.darValor();
        float alt= Metodos.darValor();
        rec.areaRectangulo(b, alt);
        //simplificando
        rec.areaRectangulo(Metodos.darValor(), Metodos.darValor());
        
    }
    
}
