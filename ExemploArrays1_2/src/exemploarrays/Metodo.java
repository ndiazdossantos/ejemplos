/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays;

import java.util.Scanner;
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
        public void buscar(int[] lista){ //1º buscar elemento 2º borrar elemento 3ºordenar arrays
            Scanner sc = new Scanner(System.in);
            int atopado=0;
            System.out.println("Introduce numero que quieres buscar: ");
            int buscar =sc.nextInt() ;
            for(int i=0;i<lista.length;i++){
                if(buscar== lista[i]){
                    atopado = 1;
                break;
            }
            }
                if (atopado==0){
                    System.out.println("Non esta");
                }
                else{
                    System.out.println("Esta");
                }
            
        }

        
}
