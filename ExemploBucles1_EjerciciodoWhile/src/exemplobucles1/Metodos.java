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
    
    public int pedirDoWhile(){
           System.out.println(" teclea numero : ");
           num=sc.nextInt();
           return num;
    }
     
    public void verDoWhile(){
        int acumulador=0;
        int contador=0;
        do{
            num=pedirDoWhile();
            if(num%2==0)
            acumulador=acumulador+num;
            contador++;
        }while(contador<=5);
        System.out.println(" suma de pares =  "+acumulador);
        }
    }
            // teclear 5 numeros y calcular la suma de los pares
           
