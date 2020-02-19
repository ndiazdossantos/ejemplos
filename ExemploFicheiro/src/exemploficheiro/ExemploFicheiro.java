/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploficheiro;

import com.noesencillito.lectura.Lectura;
import java.io.File;

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
       File f = new File("palabras.txt");
       
       // ejemplo cogiendo la ruta
       File c = new File("C:\\Users\\noese\\Desktop\\DAM\\PROG\\ExemploFicheiro\\palabras2.txt");
       
       
       obxLectura.lerLineas(f);
       obxLectura.lerLineas(c);
       
       // cogemos el primer fichero
       obxLectura.lerPalabra(f);
       
       // cogemos el segundo fichero
       obxLectura.lerPalabra(c);  /* lo que sucede es que el next nos lee hasta que tenemos un espacio en blanco, por eso se 
                                                                 visualiza de tal forma */
       
      
       //usando el limitador de una "," pero nos sigue marcando los espacios, por lo que lo haremos nuevamente con espacios en blanco
       // obxLectura.lerPalabrasUsoDelimitadores(c);
       
       
      //segunda prueba con "," y espacios
      obxLectura.lerPalabrasUsoDelimitadores(c);
       
       
       
       
       
       
    }
    
}
