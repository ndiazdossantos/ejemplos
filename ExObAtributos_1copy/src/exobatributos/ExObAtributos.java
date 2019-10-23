/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exobatributos;

import java.util.Scanner;

/**
 *
 * @author ndiazdossantos
 */
public class ExObAtributos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos objeto al y mostramos
        Alumno al = new Alumno();
        al.mostrar();
        
        //creamos nuevo objeto y pedimos Nome nota email telefono ( todo por teclado)
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce Nombre= ");
        String nome=sc.nextLine();
        System.out.print("Introduce Nota= ");
        int nota=sc.nextInt();
        System.out.println("Introduce Email= ");
        String email=sc.next();
        System.out.println("Introduce Telefono= ");
        String telefono=sc.next();
       
        Direccion d = new Direccion(email,telefono);
        Alumno al1 = new Alumno(nome,nota,d);
        //visualizamos
        al1.mostrar();
    
        //tambien se puede hacer de esta forma
      //Alumno al1 = new Alumno(nome,nota,new Direccion(email,telefono));
        
       //--- visualizamos sin utilizar el metodo mostrar
       
       System.out.println("Nombre="+al1.getNombre()+"\nNota = "+al1.getNota()+"\nEmail= "+al1.getDireccion().getEmail()+"\nTelefono= "+al1.getDireccion().getTelefono());
       
        
    }
    
}
