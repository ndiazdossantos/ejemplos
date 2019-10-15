/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploob1;

/**
 *
 * @author ndiazdossantos
 */
public class Consumo {
    //parametros
    private float km;
    private float litros;
    private float vMed;
    private float pGAs;
    
 //constructores
    public Consumo(){
        /* deixar esto en braco é o mesmo que poñer
        km=0;
        litros=0:
        etc etc
        */
        
    }
    // creamos un constructor con parametros para darlle o valor que queremos
    
    public Consumo (float k,float l,float vM, float pG){
// ahora damoslle os valores, ex: km doulle o valor de k. SEMPRE DE DEREITA A ESQUERDA
        km=k;
        litros=l;
        vMed=vM;
        pGAs= pG;    
    }
    //vamos crear un método para visualizar todos os datos que teño (os valores de cada un, datos laranxa variables en verde)
    public void amosar(){
        System.out.println("KM : "+km+" litros : "+litros+"vMed : "+vMed+"pGas: "+pGAs);
    }
    // vamos a clase principal Ejemploob1 para instanciar os obxectos
    
   // facemos os métodos getters e setters
    public void setkm(float k){
        km=k;
    }
    public float getkm(){
        return km;
    }
    public void setlitros(float l){
        litros=l;
    }
    public float getlitros(){
        return litros;
    }
    public void setvMed(float vM){
        vMed=vM;
    }
    public float getvMed(){
        return vMed;
    }
    public void setpGas(float pG){
        pGAs=pG;
    }
    public float getpGas(){
        return pGAs;
    }
    // vamos al mainclass a darlle os valores que nos indican no exercicio Boletin3
    
    //facemos as operacions que nos piden dandolle valor
    
    public float consumoMedio(){
        float consu = 100*litros/km;
        return consu;
    }
    //o indicamos na mainclass
 
}
