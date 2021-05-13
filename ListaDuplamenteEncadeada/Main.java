package ListaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        
        lista.adicionar("Matuê");
        lista.adicionar("Monark");
        lista.adicionar("Da Cunha");
        lista.adicionar("Hector Salamanca");
        lista.adicionar("Gus Fring");
        lista.adicionar("Walter White");
        lista.adicionar("Poze do Rodo");
        lista.adicionar("Bolsonaro");
        lista.adicionar("Eminem");
        
        lista.adicionar("Eduardo Bolsonaro",2);
        
        lista.listar();
        System.out.println("\n");
        
        lista.remover("Monark");
        lista.listar();
        
    }
}
