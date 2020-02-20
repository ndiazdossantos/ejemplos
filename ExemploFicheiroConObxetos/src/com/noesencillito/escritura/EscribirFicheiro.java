/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noesencillito.escritura;

import exemploficheiro.Xogador;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author noese
 */
public class EscribirFicheiro {
  // FileWriter( )      PrintWriter
   
    PrintWriter esc = null;
    FileWriter fich;
    
    public void escribirNumeros(String nombreFichero){
        try{
            fich = new FileWriter(nombreFichero); // para añadir ..(nombreFichero,true) lo veremos en el proximo metodo
            esc = new PrintWriter(fich);
            esc.println(2);
            esc.println(3);
        }catch (IOException ex){
            System.out.println("erro escribirNumeros"+ ex.toString());
        }
        finally{
            esc.close();
        }
    }
    
    public void engadirNumeros(String nombreFichero){
          try{
            fich = new FileWriter(nombreFichero,true); // para añadir ..(nombreFichero,true)
            esc = new PrintWriter(fich);
            esc.println(5);
            esc.println(6);
        }catch (IOException ex){
            System.out.println("erro escribirNumeros"+ ex.toString());
        }
        finally{
            esc.close();
        }
    }
    
    public void escribirObxectos(String nombreFichero) throws IOException{ // no nos olvidemos de importar de los otros paquetes 
        try{
            
        
        Xogador x1 = new Xogador("Pedro",6);
        Xogador x2 = new Xogador("Rafinha",12);
        fich = new FileWriter(nombreFichero); // borramos el true para que se sobreescriba en vez de que añada
        esc = new PrintWriter(fich);
        esc.print(x1.getNome()+" , "+x1.getDorsal());
        esc.println(); // como un salto de linea
        esc.print(x2);
        
        
    }catch (IOException ex) {
            System.out.println("erro "+ex.toString());
}
        finally{
            esc.close();
        }
    }
}
