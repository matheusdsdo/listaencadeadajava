package Exercicio2;

import Exercicio1.*;

public class ListaEncadeada {
    
    private Elemento inicio;
    
    
    public void adicionar(String info){
        if(this.inicio == null){
            this.inicio = new Elemento(info);
        } else {
            Elemento elemento = this.inicio;
            while(elemento.getProximo() != null){
                elemento = elemento.getProximo();
            }
            elemento.setProximo(new Elemento(info));
        }
    }
    
    public void listar(){
        Elemento elemento = this.inicio;
        System.out.println(elemento.getInfo());
        while(elemento.getProximo() != null){
            elemento = elemento.getProximo();
            System.out.println(elemento.getInfo());
        }
    }
    
    public void listaIndice(int posicao){
        Elemento elemento = this.inicio;
        for (int i = 0; i < posicao; i++) {
            elemento = elemento.getProximo();
        }
        System.out.println("O "+posicao+" elemento é: "+elemento.getInfo());
    }  
    
    public void remover(String info){
        Elemento elemento = this.inicio;
        if(elemento.getInfo().equals(info)){
            this.inicio = elemento.getProximo();
        } else {
            while(elemento.getProximo() != null){
                if(elemento.getProximo().getInfo().equals(info)){
                    elemento.setProximo(elemento.getProximo().getProximo());
                } else {
                    elemento = elemento.getProximo();
                }
            }
        }
    }
}
