/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploparking;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Coche {
  private String matricula;  
  private float precio;
  private float cartosRecibidos;
  private float cartosDevoltos;
  private int tempo;
  Scanner sc =new Scanner(System.in);
  
  public void calcularPrecio(){
      System.out.println("Introduce numero de horas");
      tempo=sc.nextInt();
      if(tempo<=3)
          precio=1.50f;
      else{
          int tempo2=tempo-3;
          precio=(tempo2*0.2f)+1.5f;
      }
      do{
          System.out.println("O precio é "+precio+"\n Introduce o diñeiro");
          cartosRecibidos=sc.nextFloat();
          cartosDevoltos=cartosRecibidos-precio;
      }while(cartosRecibidos<precio);
  }
  public void pedirDatos(){
      System.out.println("Introduce matrícula");
      matricula=sc.next();
      calcularPrecio();
  }
  public void amosar(){
      System.out.println("Factura : "+"\nMatricula"+matricula+"\nTiempo: "+tempo+"\nPrecio: "+precio+"\nDinero entregado : "+cartosRecibidos+"\nDinero devuelto: "+cartosDevoltos+"\nGracias por confiar en nosotros");
  }
  
  
}
