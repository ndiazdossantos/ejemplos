/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobexectos;

/**
 *
 * @author ndiazdossantos
 */
public class Alumno {
  private String nome;
  private int nota;
  // constructor con parámetros
public Alumno (String nom,int not){
    nome= nom;
    nota= not;
}  
//constructor sen parámetros
public Alumno (){
    
}

public void setNota(int not){
    nota= not;  
} 
public int getNota (){
    return nota;
    
}
public void setNome(String nom) {
    nome = nom;   
}
public String getNome(){
      return nome;
}
public void amosar(){
   System.out.println("nome "+ nome + "\tnota"+ nota);
}

    String setNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
