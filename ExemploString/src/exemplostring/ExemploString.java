/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplostring;

/**
 *
 * @author noese
 */
public class ExemploString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadea1 = "Daniel Castelao";
       String cadea2 = "impega";
       
       // tamaño cadea1
        System.out.println(cadea1.length());
       // son = o != cadea e cadea2
        System.out.println(cadea1.compareTo(cadea2));
       // caracter, posicion 5( usuario )de cadea2
        System.out.println(cadea2.charAt(5));
       // concatena cadea1 e cade2
        System.out.println(cadea1.concat(cadea2));
       // pasa cadea1 a minusculas
        System.out.println(cadea1.toLowerCase());
       // pasa cadea2 a MAIUSCULAS
       System.out.println(cadea2.toUpperCase());
    }
    
}
