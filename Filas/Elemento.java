/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filas;

/**
 *
 * @author mathe
 */
public class Elemento {
    private Paciente pessoa;
    private Elemento proximo;

    public Elemento (Paciente pessoa){
        this.pessoa = pessoa;
    }
    
    public Paciente getPessoa() {
        return pessoa;
    }

    public void setPessoa(Paciente pessoa) {
        this.pessoa = pessoa;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return pessoa.getNome();
    }
    
    
}
