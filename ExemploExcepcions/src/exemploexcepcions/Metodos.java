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
public class Metodos {

    public void Division(int numerador, int denominador) {
        System.out.println("Resultado: " + (numerador / denominador));
    }

    public void Division2(float numerador, float denominador) {
        System.out.println("Resultado: " + (numerador / denominador));

    }

    public void DividirCapturaExcepcion(int numerador, int denominador) {
        try {
            System.out.println("Resultado: " + numerador / denominador);
        } catch (ArithmeticException e1) {
            System.out.println("erro al dividir" + e1.getMessage());
        } finally {
            System.out.println("***executase ");
        }
    }

    public void DividirCapturaMultiplesExcepcions(int numerador, int denominador) {
        try {
            System.out.println("Resultado: " + numerador / denominador);
        } catch (ArithmeticException e1) {
            System.out.println("erro al dividir" + e1.getMessage());
        } catch (Exception ex) {
            System.out.println("error xeral" + ex.toString());
        } finally {
            System.out.println("***executase ");
        }
    }

    public void dividirLanzandoExcepcion(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("non dividas entre 0");
        }
        System.out.println("resultado= " + numerador / denominador);
        System.out.println("Remato o programa");
    }

    public void dividirNosaExcepcion(int numerador, int denominador) throws NosaExcepcion {
        if (denominador == 0) {
            throw new NosaExcepcion("****non podes dividir entre 0");
        }
        System.out.println("resultado= " + numerador / denominador);
        System.out.println("Remato o programa");
    }
    public void OperacionIntervaloExcepcion(int numerador,int denominador) throws IntervaloExcepcion,NosaExcepcion{
        if(denominador==0)
            throw new NosaExcepcion("**** mpm podres dividir entre 0");
        if (8>numerador || 20<numerador){
          throw new IntervaloExcepcion("Numerador fuera de rango, debe estar entre 8 y 20");
    }
    System.out.println("resultado= " + numerador / denominador);
    System.out.println("Remato o programa");
}
}
