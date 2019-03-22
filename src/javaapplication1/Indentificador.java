/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author helio
 */
class Indentificador {

    private String nome;
    private ArrayList<Integer> linhas;

    public Indentificador(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Indentificador)) {
            return false;
        }
        final Indentificador other = (Indentificador) obj;
        return this.getNome().equals(other.getNome());
    }

    public String getNome() {
        return nome;
    }
   
   

    public void setNome(String nome) {
        this.nome = nome;
    }

}
