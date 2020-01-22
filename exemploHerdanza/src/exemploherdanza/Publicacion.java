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
public class Publicacion {

    private int numPaxinas;
    private float prezo;

    public Publicacion() {
    }

    public Publicacion(int numPaxinas, float prezo) {
        this.numPaxinas = numPaxinas;
        this.prezo = prezo;
    }

    public int getNumPaxinas() {
        return numPaxinas;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setNumPaxinas(int numPaxinas) {
        this.numPaxinas = numPaxinas;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "numPaxinas=" + numPaxinas + ", prezo=" + prezo;
    }
    public void amosar(){
        System.out.println("Son unha publicacion");
    }
}
