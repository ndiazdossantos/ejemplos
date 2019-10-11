
package exemplo1;

import java.util.Scanner;

public class Exemplo1 {
    
    public static void main(String[] args) {
        // calcula lonxitude da cirfunferencia
     /*   float radio = 2.5f, lonxitude;   
        lonxitude = 2*3.14f*radio;
        System.out.println("lonxitude = " + lonxitude); */
     
   /*  float radio = 2.5f;
     System.out.println("lonxitude = "+ (2*3.14*radio)); */
   
   /* float radio = 2.5f;
   
   float lonxitude = 2*3.14f*radio;
    System.out.println("lonxitude = "+ lonxitude); */
    
    // utilizando a constante PI
    
   /* float radio = 2.5f;
   final float PI = 3.14f;
    System.out.println("lonxitude= "+ (2*PI*radio)); */
   
   // utilizando a clase Math
   
  /* float radio = 2.5f;
   float lonxitude = (float) (2*Math.PI*radio);
    System.out.println("lonxitude = "+ lonxitude); */
     
    //pedir datos de teclado
    
  Scanner sc= new Scanner (System.in);
   System.out.println("teclea radio : ");
  float radio = sc.nextFloat();
   
  System.out.println("lonxitude ="+ (2*Math.PI*radio));
  
    
  
    }
    
}
