/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistobxectos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author noese
 */
public class ExemploArrayListObxectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ActualizarArrayList obx1 = new ActualizarArrayList();
        ArrayList<Xogador>listaXogadores= new ArrayList();
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("*** MENU ***<<<\n1--> Crear Xogador \n2---> Amosar\n3--> Dar de Baixa\n4--> Buscar elemento\n5--> Ordenar(luego usar amosar)\n6--> ****\n7--> Mostrar Tabla Ordenada\n8--> Buscar total de goles en la Jornada\n9-->Consultas por equipo e xornada indicando o n° de goles.\n10--> Sair\n11-->Teclea Opcion\n"));
            switch(opcion){
                case 1: listaXogadores.add(obx1.crearXogador());
                break;
                case 2: obx1.amosar(listaXogadores);
                break;
               case 3: obx1.darBaixa(listaXogadores);
               break;
               case 4: obx1.buscarElemento(listaXogadores);
                break;
                
                case 5: obx1.ordenar(listaXogadores);
                break;
               /* 
                case 6: obx1.ordenarEquipos(matriz, equipo, mediaGolesEquipo);
                break;
                case 7: obx1.mostraTablaOrdenada(matriz, equipo, xornada, mediaGolesXornada);
                break;
                case 8: obx1.totalGolesEquipo(equipo, mediaGolesEquipo);
                break;4r5r
                case 9: obx1.totalGolesJornada(equipo, xornada, matriz);
                break;
                case 10: obx1.consulta(equipo, xornada, matriz);
                break;
                case 11: obx1.sair();*/
            }
        }while(opcion<12);
    }
        
    
}
