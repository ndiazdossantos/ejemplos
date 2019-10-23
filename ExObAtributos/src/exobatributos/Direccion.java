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
public class Direccion {
    
    private String eMail;
    private String telefono; //lo ponemos como string aunque sea numerico ya que no hacemos operaciones con el.
  
    
    public Direccion (){
        
    }
    
    public Direccion(String email,String tlfn){
        this.eMail= email;
        telefono=tlfn;
    }
    //metodos de acceso
    
    public void setEmail(String email){ // el nombre tipo string es el que queramos
        this.eMail= email; //2ºeMail es el nombre asignado arriba
    }
    public String getEmail(){
        return eMail;
    }
    public void setTelefono(String tlfn){
        this.telefono=tlfn;
    }
    public String getTelefono(){
        return telefono;
    }
    
    
    
}
