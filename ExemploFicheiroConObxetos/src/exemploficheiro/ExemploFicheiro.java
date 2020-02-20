/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploficheiro;

import com.noesencillito.escritura.EscribirFicheiro;
import com.noesencillito.lectura.Lectura;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author noese
 */
public class ExemploFicheiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       // https://docs.oracle.com/javase/7/docs/api/java/io/File.html
       
       // creamos el objeto importando el paquete com.noesencillito.lectura.Lectura
     /*  Lectura obxLectura= new Lectura();
       
      //nombre del fichero , importamos la clase File
       File f = new File("xogadores.txt");
       
       LinkedList <Integer>lista = obxLectura.lerNumeros(f);
       for(Integer v :lista)
            System.out.println("** "+v);
       
      obxLectura.lerObxectos(f);
    */
    
      // siguiente clase , comenzamos con escribirFicheiro
       
        Lectura obxLec = new Lectura();
        EscribirFicheiro obxEsc = new EscribirFicheiro();
        obxEsc.escribirNumeros("num.txt"); // este fichero lo creara en el escritorio raiz
       // obxEsc.escribirNumeros("C:\\Users\\noesen\\Desktop\\enteiros.txt"); // se supone que nos creara en el escritorio el documento
       obxEsc.engadirNumeros("num.txt");
       obxEsc.escribirObxectos("obxetos.txt");
    }
    
}
