/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays;

import metodos.PedirDato;

/**
 *
 * @author noese
 */
public class Metodo {
    int [] numeros = new int [6];
     public void crearArrays(){
         for(int i = 0; i < numeros.length;i++){
             numeros[i]=PedirDato.pedirInt();
         }
         
     }
    public void amosar(){
        for(int i = 0; i<numeros.length;i++){
            System.out.println(numeros[i]);  
        }
    }
        //recibimos o array como parametro
        public void visualizar(int[]lista){
            for(int i = 0;i<lista.length;i++)
                System.out.println("***"+lista[i]);
        }

    // crear array y devolver
        public int[]encherArrays(int[] lista){
           for(int i=0; i< lista.length;i++){
              lista[i]= PedirDato.pedirInt();
        }
           return lista;
        }
        
}
