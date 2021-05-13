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
public class Fila {
    private Elemento inicio;
    private int tamanho;
    
    public Fila(){
        this.tamanho = 0;
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    
    public boolean vazia(){
        if (this.tamanho>0){
            System.out.println("A pilha não está vazia.");
            return true;
        }
        System.out.println("A pilha está vazia.");
        return false;
    }
    
    public void enfileirar(Paciente paciente){
        if (this.inicio == null){
            System.out.println("Paciente chegando ao consultório: "+paciente.toString());
            this.inicio = new Elemento(paciente);
        } else {
            Elemento elemento = this.inicio;
            while(elemento.getProximo() != null){
                elemento = elemento.getProximo();
            }
            elemento.setProximo(new Elemento(paciente));
            System.out.println("Paciente chegando ao consultório: "+paciente.toString());
        }
        tamanho++;
    }
    
    public void listar(){
        Elemento elemento = this.inicio;
        System.out.println(elemento);
        while(elemento.getProximo() != null){
            elemento = elemento.getProximo();
            System.out.println("Paciente(s) na fila de espera: "+elemento);
        }
    }
    
    public Paciente desenfileirar(){
        System.out.println("Removendo: ");
        if (this.inicio == null){
            return null;
        } else {
            Elemento elemento = this.inicio;
            Paciente p = elemento.getPessoa();
            System.out.println("Paciente encaminhado ao atendimento: "+p.toString());
            this.inicio = elemento.getProximo();
            this.tamanho--;
            return elemento.getPessoa();
        }
    }
    
    public boolean buscaNome(String nome){
        Elemento elemento = this.inicio;
        if(elemento.getPessoa().getNome().equals(nome)){
                System.out.println("Paciente localizado: "+nome);
                return true;
            }
        while(elemento.getProximo() != null){
            if(elemento.getPessoa().getNome().equals(nome)){
                System.out.println("Paciente localizado: "+nome);
                return true;
            }
            elemento = elemento.getProximo();
        }
        System.out.println("Paciente não encontrado.");
        return false;
    }
}
