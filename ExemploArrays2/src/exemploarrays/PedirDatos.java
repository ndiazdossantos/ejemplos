/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class PedirDatos {
    Scanner sc = new Scanner(System.in);
 public void pedirDorsal(int dorsal){
     System.out.println("Introduce numero del dorsal ");
     dorsal=sc.nextInt();
 }
 public void pedirNombre(String nombre){
     System.out.println("Introduce nombre del jugador");
     nombre=sc.next();
 }
}


