/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraysbidimensional;

import javax.swing.JOptionPane;

/**
 *
 * @author noese
 */
public class ExemploArraysBidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        int[]mediaAlumnos=new int[3];
        int[]mediaModulos=new int[4];
        String[]alumnos={"alum1","alum2","alum3"};
        String[]modulos={"M1","M2","M3","M4"};
        int opcion;
        MetodoMatriz obx1 = new MetodoMatriz();
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("*** MENU ***<<<\n1--> Crear Matriz \n2---> Amosar\n3--> Amosar Todo\n4--> Media Alumnos\n5--> Media Modulo\n6--> Sair\n7-->Teclea Opcion\n"));
            switch(opcion){
                case 1: matriz = obx1.crearMatriz(matriz);
                break;
                case 2: obx1.amosar(matriz);
                break;
                case 3: obx1.amosarTodo(matriz, alumnos, modulos);
                break;
                case 4: mediaAlumnos=obx1.mediaAlumnos(matriz, mediaAlumnos);
                break;
                case 5: mediaModulos=obx1.mediaModulos(matriz, mediaModulos);
                break;
                case 6: obx1.sair();
            }
        }while(opcion<6);
    
        
}
}