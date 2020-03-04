/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistobxectos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author noese
 */
public class ActualizarArrayList {
    public Xogador crearXogador(){
        Xogador x = new Xogador(PedirDato.pedirString(),PedirDato.pedirInt());
        return x;
    }
    public void amosar(ArrayList<Xogador>lista){
        Iterator it = lista.iterator();
       while(it.hasNext())
            System.out.println(it.next());
        
    }
    public void buscarElemento(ArrayList<Xogador>lista){
        String nome=JOptionPane.showInputDialog("Nome Xogador: ");
        for(Xogador x:lista){
            if(nome.equals(x.nome))
                System.out.println("nome Xogador: "+nome+" ten o dorsal: "+x.dorsal);
        }   
    }
    public void darBaixa(ArrayList<Xogador>lista){
        int num= Integer.parseInt(JOptionPane.showInputDialog("Dorsal xogador "));
        for(int i=0;i<lista.size();i++){
            if(num == lista.get(i).dorsal)
                lista.remove(lista.get(i));
                }
    }
    public void ordenar(ArrayList<Xogador>lista){
        Collections.sort(lista);
    }
}
