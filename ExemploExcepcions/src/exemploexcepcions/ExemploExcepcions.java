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
public class ExemploExcepcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx1 = new Metodos();
        //obx1.Division(6, 3);   nos da 2
        //obx1.Division(6, 0);   nos da error
        //obx1.Division2(6.0f, 0.0f); nos da infinity utilizando float en vez de tipo int
        //https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html
        //obx1.DividirCapturaExcepcion(6, 0);
        /*try{
         obx1.dividirLanzandoExcepcion(6, 0); 
        }catch(ArithmeticException e){
            System.out.println("erro"+e.toString());
        }
        System.out.println("O programa segue");
    }
         */
       /* try {
            obx1.dividirNosaExcepcion(4, 0);
        } catch (NosaExcepcion e) {
            System.out.println("erro" + e.toString());
        }
        System.out.println("o programa segue");
    }
*/
        try {
            obx1.OperacionIntervaloExcepcion(234,3);
        }catch(NosaExcepcion e){
            System.out.println("erro "+e.toString());
        } catch (IntervaloExcepcion ex) {
            System.out.println("erro " + ex.getMessage());
        }
        System.out.println("o programa segue");
    }
}
