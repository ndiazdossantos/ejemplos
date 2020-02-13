/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploparking;

/**
 *
 * @author noese
 */
public class Garaxe {
    private int numeroCoches;
    private final int capacidad=5;
    private Coche coche=new Coche();
    
    public void validar(){
    numeroCoches=0;
    do{
        numeroCoches++;
        System.out.println("Plaza Disponible");
        coche.pedirDatos();
        coche.amosar();
    }while(numeroCoches<5);
        System.out.println("Parking lleno");
}
    
}
