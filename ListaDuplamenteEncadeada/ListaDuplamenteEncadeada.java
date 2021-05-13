package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
    
    private Elemento inicio;
    private int quantidade = 0;
    private int limite = 10;
    
    public void adicionar(String info){
        if (quantidade < limite){
            if(this.inicio == null){
                this.inicio = new Elemento(info);
                quantidade++;
            } else {
                Elemento elemento = this.inicio;
                while(elemento.getProximo() != null){
                    elemento = elemento.getProximo();
                }
                elemento.setProximo(new Elemento(info));
                quantidade++;
                elemento.getProximo().setAnterior(elemento);
            }
        } else {
            rejeita(info);
        }
    }
    
    public void listaIndice(int posicao){
        Elemento elemento = this.inicio;
        for (int i = 0; i < posicao; i++) {
            elemento = elemento.getProximo();
        }
        System.out.println("O "+posicao+" elemento é: "+elemento.getInfo());
    }  
    
    public void adicionar(String info, int lugar){
        if (verifica(lugar)){
            int p = 0;
            Elemento elemento = this.inicio;
            while(p < lugar){
                elemento = elemento.getProximo();
                p++;
            }
            
            Elemento prox = elemento.getProximo();
            Elemento ante = elemento.getAnterior();
            
            elemento.setProximo(new Elemento(info));
            
            elemento.setAnterior(ante);
            elemento.getProximo().setProximo(prox);
            
        } else {
            System.out.println("Local desejado não existe, será adicionado no final da lista.");
            adicionar(info);
        }
        
        if (quantidade < limite){
            
        } else {
            rejeita(info);
        }
    }
    
    public void listar(){
        quantidade = 0;
        Elemento elemento = this.inicio;
        System.out.println(elemento.getInfo());
        quantidade++;
        while(elemento.getProximo() != null){
            elemento = elemento.getProximo();
            System.out.println(elemento.getInfo());
            quantidade++;
        }
        while(elemento.getAnterior() != null){
            elemento = elemento.getAnterior();
            System.out.println(elemento.getInfo());
        }
        System.out.println("Quantidade: "+quantidade);
    }
    
    public boolean verifica(int l){
        if (l < quantidade){
            return true;
        } else {
            return false;
        }
    }
    public void rejeita(String info){
            System.out.println("Limite de "+limite+" excedido.");
            System.out.println("Rejeitado: "+info+".\n");
    }
    
public void remover(String info){
         Elemento elemento = this.inicio;
        if(elemento.getInfo().equals(info)){
            this.inicio = elemento.getProximo();
            this.inicio.setAnterior(null);
        } else {
            while(elemento != null){
                if(elemento.getInfo().equals(info)){
                    if(elemento.getProximo() != null){
                        elemento.getAnterior().setProximo(elemento.getProximo());
                        elemento.getProximo().setAnterior(elemento.getAnterior());
                    } else {
                        elemento.getAnterior().setProximo(null);
                    }
                }
                elemento = elemento.getProximo();
            }
        }
    }
}
