/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopaquetes;
// copia y pega del paquete del proyecto MeusMetodos a este paquete
import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Metodos {
    

    public float validaFloatPositivo() {
        Scanner sc = new Scanner(System.in);
        float valor;
        do{
        valor = sc.nextFloat();
        }while (valor<=0);
        return valor;
        //tamen podemos facer return sc.nextFloat();
        }
    
        public static float darValor(){
        Scanner sc = new Scanner(System.in);
        float valor;
        do{
        valor = sc.nextFloat();
        }while (valor<=0);
        return valor;
        }
            
        }
    


