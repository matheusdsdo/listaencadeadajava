
package ListaCircular;

public class Elemento {
    private Pessoa p;
    private Elemento proximo;
    
    public Elemento (Pessoa p){
        this.p = p;
    }
    
    public Pessoa getPessoa(){
        return this.p;
    }
    
    public void setPessoa(Pessoa p){
        this.p = p;
    }
    
    public Elemento getProximo(){
        return this.proximo;
    }
    
    public void setProximo(Elemento elemento){
        this.proximo = elemento;
    }

    @Override
    public String toString() {
        return p.toString();
    }
    
    
}
