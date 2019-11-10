/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobucles1;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Metodos {
    private int num;
    Scanner sc=new Scanner(System.in);
    
    public int setDato(){
        System.out.println("teclea numero: ");
       /* num=sc.nextInt();
        return num;*/
       return sc.nextInt();
    }
     
    public void verDatos(){
        num = setDato();
        while(num !=0){
            System.out.println(num);
            num = setDato();
        }
        System.out.println(" rematamos ");
    }
            
            
            
}
