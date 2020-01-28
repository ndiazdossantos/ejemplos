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
   // Xogador[]xogadores = new Xogador[elemento()];
    //Xogador[]xogadores= new Xogador[elementos()]; //mas vale que sobre que no que falte
    public static int elementos(){          // debemos ponerlo static
        System.out.println("Numero de xogadores : ");
        return PedirDato.pedirInt();
    }
    /*public Xogador[] crearArrays(){
        String nom;
        int dor;
        for(int i=0;i<xogadores.length;i++){
            nom=PedirDato.pedirString();
            dor=PedirDato.pedirInt();
           xogadores [i] = new Xogador(nom,dor);
         // todo en una linea de codigo:  xogadores[i]=new Xogador(PedirDato.pedirString(),PedirDato.pedirInt());
        }
        return xogadores;
    }
*/
    public Xogador[] crearArraysProfe(Xogador[]xogadores){
        String nom;
        int dor;
        for(int i=0;i<xogadores.length;i++){
            nom=PedirDato.pedirMensaxe("Teclee nombre xogador : ");
            dor=PedirDato.pedirInt();
           xogadores [i] = new Xogador(nom,dor);
         // todo en una linea de codigo:  xogadores[i]=new Xogador(PedirDato.pedirString(),PedirDato.pedirInt());
        }
        return xogadores;
    }
      public void amosarArrays(Xogador[] lista){
          for(Xogador elemento:lista)   //foreach
         System.out.println(elemento);
      }  
}
