/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistobxectos;

/**
 *
 * @author noese
 */
public class Xogador implements Comparable {
    String nome;
    int dorsal;

    public Xogador() {
    }

    public Xogador(String nome, int dorsal) {
        this.nome = nome;
        this.dorsal = dorsal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Xogadores : "+"\n nome : "+nome+" Dorsal: "+dorsal;
    }
   // siguiente dia de clase
    public int compareTo(Xogador t){
        if(this.dorsal< t.dorsal)
            return -1;
        else if(this.dorsal>t.dorsal)
            return 1;
        else
            return 0;
    }
   /* @Override
    public int compareTo(Object o){
    Xogador x = (Xogador) o;
    if(this.dorsal<x.dorsal)
        return -1;
    else if(this.dorsal>x.dorsal)
        return -1;
    else
    return 0;
}
*/
    @Override
       public int compareTo(Object o){
        
         Xogador xog = (Xogador)o ;
         
         if(this.nome.compareToIgnoreCase(xog.nome)==0)
           return 0;
         else if(this.nome.compareToIgnoreCase(xog.nome)>0)
             return 1;
         else 
              return -1 ;
        
    }
    
}
