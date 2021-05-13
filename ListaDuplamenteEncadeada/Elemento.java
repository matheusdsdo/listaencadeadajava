
package ListaDuplamenteEncadeada;


public class Elemento {
    private String info;
    private Elemento proximo;
    private Elemento anterior;
    
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
    
      public Elemento getAnterior(){
        return this.anterior;
    }
    
    public void setAnterior(Elemento elemento){
        this.anterior = elemento;
    }
}

