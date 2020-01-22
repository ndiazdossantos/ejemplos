/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherdanza;

/**
 *
 * @author noese
 */
public class Revista extends Publicacion {
    private String nome;
    
   public Revista(){
       super();
   } 
    
  public Revista(int paxinas, float prezo,String nome){
     super(paxinas,prezo);
     this.nome=nome;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString()+"nome=" + nome; //añadimos el super.toString() para poner acceder al toString de la clase publicacion
        
    }

    @Override
    public void amosar(){
        System.out.println("Son unha revista");
    }
         
    
    
    
    
}
