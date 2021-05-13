
package Exercicio1;

public class Elemento {
    private String info;
    private Elemento proximo;
    
    public Elemento (String info){
        this.info = info;
    }
    
    public String getInfo(){
        return this.info;
    }
    
    public Elemento getProximo(){
        return this.proximo;
    }
    
    public void setProximo(Elemento elemento){
        this.proximo = elemento;
    }
}
