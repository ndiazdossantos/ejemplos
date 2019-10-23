/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exobatributos;

/**
 *
 * @author ndiazdossantos
 */
public class Alumno {
 
 private String nome;
 private int nota;
 private Direccion dire = new Direccion();

//constructores

public Alumno(){
    
} 

public Alumno(String nom,int not,Direccion di){
   nome=nom;
   nota=not;
   dire=di;
   
}

//metodos de acceso

public void setNombre(String nom){
    nome=nom;
}
public String getNombre(){
    return nome;
}
public void setNota(int not){
    nota=not;
} 
public int getNota(){
    return nota;
}
 public void setDireccion(Direccion di){
     dire=di;
 }
 public Direccion getDireccion(){
  return dire;
 }
 
 public void mostrar(){
     System.out.println("Nombre= "+nome+"\nNota"+nota+"\nEmail="+dire.getEmail()+"\nTelefono= "+dire.getTelefono());

 }
 
 
 
 



}
