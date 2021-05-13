package Pilhas;

public class Pilha {
    private Elemento topo;
    private int tamanho;
    
    public Pilha(){
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
    
    public void empilhar(Pessoa pessoa){
        System.out.println("Adicionando novo elemento: ");
        if(this.topo == null){
            this.topo = new Elemento(pessoa);
        } else {
            Elemento elemento = this.topo;
            this.topo = new Elemento(pessoa);
            this.topo.setProximo(elemento);
        }
        this.tamanho++;
    }
    
    public void listar(){
        System.out.println("Listando a pilha:");
        Elemento elemento = this.topo;
        System.out.println(elemento);
        while(elemento.getProximo() != null){
            elemento = elemento.getProximo();
            System.out.println(elemento);
        }
    }
    
    public Pessoa desempilhar(){
        System.out.println("Removendo: ");
        if (this.topo == null){
            return null;
        } else {
            Elemento elemento = this.topo;
            this.topo = elemento.getProximo();
            this.tamanho--;
            return elemento.getPessoa();
        }
    }
}
