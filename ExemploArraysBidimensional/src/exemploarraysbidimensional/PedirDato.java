/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraysbidimensional;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class PedirDato {
    
    public static int pedirInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce int ");
        int n=sc.nextInt();
        return n;
    }
    public static int pedirIntMensaxe(String mensaxe ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce int ");
        int n=sc.nextInt();
        return n;
    }
    
    public static String pedirString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce String ");
        String n=sc.next();
        return n;
    }
    public static String pedirMensaxe(String mensaxe){
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduce String ");
        mensaxe=sc.next();
        return mensaxe;
    }
      
}
