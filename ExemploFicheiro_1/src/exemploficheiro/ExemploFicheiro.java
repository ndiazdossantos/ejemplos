/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploficheiro;

import com.noesencillito.lectura.Lectura;
import java.io.File;
import java.util.LinkedList;

/**
 *
 * @author noese
 */
public class ExemploFicheiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // https://docs.oracle.com/javase/7/docs/api/java/io/File.html
       
       // creamos el objeto importando el paquete com.noesencillito.lectura.Lectura
       Lectura obxLectura= new Lectura();
       
       //nombre del fichero , importamos la clase File
       File f = new File("numeros.txt");
       
       LinkedList <Integer>lista = obxLectura.lerNumeros(f);
       for(Integer v :lista)
            System.out.println("** "+v);
   
    }
    
}
