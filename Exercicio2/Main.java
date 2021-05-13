package Exercicio2;

import Exercicio2.*;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.adicionar("Jovani Romarinho");
        lista.adicionar("Ana Tarouco");
        lista.adicionar("Galo del Fabro");
        lista.adicionar("Nelson Vendrame");
        lista.adicionar("Mano Lima");
        lista.adicionar("José Flavio");
        lista.adicionar("Daniel Marin");
        lista.adicionar("Dhieimes Alef");
        
        System.out.println("\n");
        lista.listaIndice(3);
        System.out.println("\n");
        
        lista.listar();
        System.out.println("\n");
        
    }
}
