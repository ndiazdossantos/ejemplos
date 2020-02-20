/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noesencillito.lecturaEscritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author noese
 */
public class LecturaEscritura {
    Scanner sc;
     PrintWriter esc = null;
    FileWriter fich;
    
    public void escribirNumeros(String nombreFichero){
        try{
            fich = new FileWriter(nombreFichero); // para añadir ..(nombreFichero,true) lo veremos en el proximo metodo
            esc = new PrintWriter(fich);
            esc.println(2);
            esc.println(3);
             esc.println(4);
              esc.println(7);
               esc.println(4);
                esc.println(1); 
                 esc.println(6);
                  esc.println(7);
                   esc.println(8);
                    esc.println(2);
                    
                
        }catch (IOException ex){
            System.out.println("erro escribirNumeros"+ ex.toString());
        }
        finally{
            esc.close();
        }
    }
     public LinkedList<Integer> lerNumeros(File ficheiro) {
        List<Integer> listaNumeros = new LinkedList();
        // lo primero que hay que hacer es abrir el fichero en modo lectura
        try {
            sc = new Scanner(ficheiro);
            while (sc.hasNextInt()) {
                Integer valor = sc.nextInt();
                if (valor % 2 == 0) // si el valor es par lo añadimos a la lista
                {
                    listaNumeros.add(valor);
                }
                //tamen pode usarse 
                //listaNumeros.add(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro lectura palabra " + ex.toString());
        } finally {
            sc.close(); // CERRAMOS EL FICHERO
        }
        return (LinkedList) listaNumeros;  //como esta referenciado a List, tenemos que hacerle un cast a LinkedList
    }
}
