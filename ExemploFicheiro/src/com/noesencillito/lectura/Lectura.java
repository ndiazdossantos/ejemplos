/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noesencillito.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Lectura {
    Scanner sc;
    public void lerLineas(File ficheiro){
        try{
            sc = new Scanner(ficheiro);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (FileNotFoundException ex){
            System.out.println("error lerLiñas "+ex.toString());
        }
    }
        
        public void lerPalabra(File ficheiro){
            try{
                sc = new Scanner(ficheiro);
                while(sc.hasNext()){
                    System.out.println(sc.next());
                }
            }catch(FileNotFoundException ex){
                System.out.println("erro lectura palabra "+ex.toString());   
            }
    }
        
        public void lerPalabrasUsoDelimitadores(File ficheiro){
              try{
               // sc = new Scanner(ficheiro).useDelimiter(",");   //primera prueba
                sc = new Scanner(ficheiro).useDelimiter(",\\s*");   // segunda prueba con espacios en blanco
                while(sc.hasNext()){
                    System.out.println(sc.next());
                }
            }catch(FileNotFoundException ex){
                System.out.println("erro lectura palabra "+ex.toString());   
            }
    }
}