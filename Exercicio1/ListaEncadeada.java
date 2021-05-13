package Exercicio1;

public class ListaEncadeada {
    
    private Elemento inicio;
    
    private int limite = 10;
    private int tamanho = 0;
    
    public void adicionar(String info){
        if (verificaTamanho()){
            if(this.inicio == null){
                this.inicio = new Elemento(info);
                tamanho++;
            } else {
                Elemento elemento = this.inicio;
                while(elemento.getProximo() != null){
                    elemento = elemento.getProximo();
                }
                elemento.setProximo(new Elemento(info));
                tamanho++;
            }
        } else {
            System.out.println("Já alcançou o tamanho total\n");
        }
    }
    
    public void adicionarNaPosicao(String info, int pos){
        pos--;
        System.out.println("");
                if (verificaTamanho()){
                    if(tamanho>=pos){
                            int position = 0;
                            Elemento elemento = this.inicio;
                            while(position < pos){
                                elemento = elemento.getProximo();
                                position++;
                            }
                            Elemento proximo = elemento.getProximo();
                            elemento.setProximo(new Elemento(info));
                            elemento.getProximo().setProximo(proximo);
                            tamanho++;
                    } else {
                        adicionar(info);  
                    }                  
                } else {
                    System.out.println("Já alcançou o tamanho total\n");
                }
            }
    
    
    public void listar(){
        tamanho = 0;
        Elemento elemento = this.inicio;
        System.out.println("Nome: "+elemento.getInfo());
        tamanho++;
        while(elemento.getProximo() != null){
            elemento = elemento.getProximo();
            System.out.println("Nome: "+elemento.getInfo());
            tamanho++;
        }
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
    
    private boolean verificaTamanho(){
        if (limite>tamanho){
            System.out.println("Aceito!");
            return true;       
        } else {
            System.out.println("Negado!");
            return false;
        }
    }
}
