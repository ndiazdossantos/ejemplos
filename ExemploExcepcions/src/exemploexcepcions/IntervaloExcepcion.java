/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcions;

/**
 *
 * @author noese
 */
public class IntervaloExcepcion extends Exception {
       public IntervaloExcepcion() {
        super();
    }

    public IntervaloExcepcion(String mensaxe) {
        super(mensaxe);
    }

    
}