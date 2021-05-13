package Pilhas;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.empilhar(new Pessoa("Pablo Escobar","pablo@escobar.com","111.111.111-11"));
        pilha.empilhar(new Pessoa("Jeff Bezos","ceo@amazon.com","222.222.222-22"));
        pilha.empilhar(new Pessoa("Elon Musk","ceo@tesla.com","333.333.333-33"));
        pilha.empilhar(new Pessoa("Igor 3K","igao@flow.com","444.444.444-44"));
        pilha.empilhar(new Pessoa("Gabriel Pato","gabriel@pato.com","555.555.555-55"));      
    
        //LISTANDO
        pilha.listar();
        System.out.println("");
        //REMOVENDO (DESEMPILHANDO)
        Pessoa p = pilha.desempilhar();
        System.out.println("");
        pilha.listar();
        System.out.println("");
        //ADICIONANDO NOVO TOPO
        pilha.empilhar(new Pessoa("Jeb","jeb@minecraft.com","666.666.666-66"));
        System.out.println("");
        pilha.listar();
    }
}
