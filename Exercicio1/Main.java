package Exercicio1;

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
        
        
        lista.listar();
        
                lista.adicionarNaPosicao("Mario Brow", 3);
        /*
        lista.adicionar("Matuê");
        lista.adicionar("MC Poze do Rodo");
        lista.adicionar("Lula");
        lista.adicionar("Bolsonaro");
        */
        
        lista.listar();
        /*
        lista.listar();
        System.out.println("\n");
        
        lista.remover("Ana Tarouco");
        lista.listar();
        */
    }
}
