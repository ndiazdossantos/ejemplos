/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploob1;

/**
 *
 * @author ndiazdossantos
 */
public class Ejemploob1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //instancio os obxectos
      //este é o constructor por defecto polo que os valores se os amosamos deberian ter o valor 0
      Consumo obxConsumo1 = new Consumo ();
      //amosamos os datos
      obxConsumo1.amosar(); //executamos e podemos observar como todos os valores son 0
     //creamos un obxConsumo2 co constructor con parametros
     Consumo obxConsumo2 = new Consumo(30,50,90.4f,7.3f); // temos que ver en que orden van os parametros en Consumo xa que asi é como irán (non está no exercicio,proba de explicacion)
    //visualizamos de novo
     obxConsumo2.amosar();
     // facemos os métodos de acceso en Consumo.java
     //damoslle os valores que nos indican no exercicio boletin3 sempre atraves do obxeto
     obxConsumo1.setkm(50f);
     obxConsumo1.setpGas(1.57f);
     obxConsumo1.amosar();//coprobamos si verdaderaimente cambiou
     //creamos obxeto consumo 2 con todos os parametros (xa o temos enriba)
     //temos que facer as operación que nos piden no exercicio, esto o faremos na clase Consumo.java
     
     //chamamos as operacions
     float valor=obxConsumo2.consumoMedio();
     //visualizamos o valor
     System.out.println("Consumo Medio= "+valor);
     //damoslle o valor a litros
     obxConsumo2.setlitros(10);
     obxConsumo2.amosar(); // comprobamos que se ve
     //proseguimos 
     float var=obxConsumo2.getvMed();
     System.out.println("Velocidade media = "+ var);
     
     float cse=obxConsumo2.consumoEuros();
     System.out.println("Consumo euros = "+cse);
     
     /* para simplificar podese escribrir nunha linea de codigo
     System.out.println("Velocidade media = "+obxConsumo2.getvMed()+var");
     */
    }
    
}
