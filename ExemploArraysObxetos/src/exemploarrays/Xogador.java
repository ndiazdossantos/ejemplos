/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays;

/**
 *
 * @author noese
 */
public class Xogador {
    String nome;
    int dorsal;

    public Xogador() {
    }

    public Xogador(String nome, int dorsal) {
        this.nome = nome;
        this.dorsal = dorsal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", dorsal=" + dorsal;
    }
    
}
