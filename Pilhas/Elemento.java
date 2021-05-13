package Pilhas;

public class Elemento {
    private Pessoa pessoa;
    private Elemento proximo;

    public Elemento (Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return pessoa.getNome();
    }
    
    
}

