package ListaCircular;


public class ListaCircular {
    
    private Elemento inicio;
    int contagem;
    int limite = 10;
    
    public void adicionar(Pessoa p){
        if (verifica()){
            if(this.inicio == null){
                this.inicio = new Elemento(p);
                contagem++;
                this.inicio.setProximo(this.inicio);
            } else {
                Elemento elemento = this.inicio;
                contagem++;
                while(!elemento.getProximo().getPessoa().equals(this.inicio.getPessoa())){
                    elemento = elemento.getProximo();
                }
                elemento.setProximo(new Elemento(p));
                elemento.getProximo().setProximo(this.inicio);
            }
            System.out.println("Contagem: "+contagem);
        }
    }
    
    public void listar(){
        contagem = 0;
        Elemento elemento = this.inicio;
        contagem++;
        System.out.println(elemento.getPessoa());
        while(!elemento.getProximo().getPessoa().equals(this.inicio.getPessoa())){
            elemento = elemento.getProximo();
            contagem++;
            System.out.println(elemento.getPessoa());
        }
        System.out.println("Contagem: "+contagem);
    }
    
    public void remover(String cpf){
        contagem = 0;
        Elemento elemento = this.inicio;
        contagem++;
        if(elemento.getPessoa().equals(cpf)){
            this.inicio = elemento.getProximo();
            contagem++;
            while(!elemento.getProximo().getPessoa().getCpf().equals(cpf)){
                elemento = elemento.getProximo();
            }
            elemento.setProximo(this.inicio);
        } else {
            while(!elemento.getProximo().getPessoa().equals(this.inicio.getPessoa())){
                if(!elemento.getProximo().getPessoa().getCpf().equals(cpf)){
                    elemento = elemento.getProximo();
                } else {
                    elemento.setProximo(elemento.getProximo().getProximo());
                    break;
                }
            }
        }
    }
    
    public void adicionar (Pessoa p, int pos){
        
        if (verifica()){
            if (pos > contagem){
                System.out.println("Essa posição não existe, será adicionado no final da lista!");
                adicionar(p);
            } else {
                Elemento elemento = this.inicio;
                contagem = 1;
                if (pos == 1){
                    Elemento proximo = elemento.getProximo();
                    elemento = new Elemento(p);
                    elemento.getProximo().setProximo(proximo);
                } else {
                    while (contagem < pos){
                        elemento = elemento.getProximo();
                        contagem++;
                    }
                    Elemento proximo = elemento.getProximo();  
                    elemento.setProximo(new Elemento(p));
                    elemento.getProximo().setProximo(proximo);
                }
            }
        }
    }
    
    public void listar (int pos){
        contagem = 0;
        Elemento elemento = this.inicio;
        contagem++;
        if (pos == 1){
            System.out.println("Listado via indice: "+elemento);
        } else {
            while(contagem < pos){
                elemento = elemento.getProximo();
                contagem++;
            }
            System.out.println("Listado via indice: "+elemento);
        }
    }
    
    public boolean verifica(){
        if (contagem > limite){
            System.out.println("Limite máximo atingido.");
            return false;
        } else {
            System.out.println("Autorizado!");
            return true;
        }
    }
 
}
