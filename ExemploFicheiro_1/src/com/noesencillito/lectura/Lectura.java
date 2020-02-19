/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noesencillito.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
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
            finally{
                sc.close(); // CERRAMOS EL FICHERO
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
              finally{
                sc.close(); // CERRAMOS EL FICHERO
                        }
    }
        //importamos la clase LinkedList que proviene de List
        public LinkedList<Integer> lerNumeros(File ficheiro){
           List<Integer> listaNumeros = new LinkedList();
           // lo primero que hay que hacer es abrir el fichero en modo lectura
           try{
           sc = new Scanner(ficheiro);
           while(sc.hasNextInt()){
                      Integer valor = sc.nextInt();
                      if(valor%2!=0) // si el valor es impar lo añadimos a la lista
                      listaNumeros.add(valor);
                     //tamen pode usarse 
                     //listaNumeros.add(sc.nextInt());
                }
            }catch(FileNotFoundException ex){
                System.out.println("erro lectura palabra "+ex.toString());   
            }
           finally{
                sc.close(); // CERRAMOS EL FICHERO
                        }
           return (LinkedList)listaNumeros;  //como esta referenciado a List, tenemos que hacerle un cast a LinkedList
        }
        
        
        
        
        
        
}