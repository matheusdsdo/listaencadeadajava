
package PilhasInt;

public class PilhaInt {
    private int numero;
    private Inteiro topo;
    private int tamanho;
    
    public void empilhar(int num){
        if (this.topo == null){
            this.topo = new Inteiro(num);
            tamanho++;
        } else {
            Inteiro inteiro = this.topo;
            this.topo = new Inteiro(num);
            this.topo.setProximo(inteiro);
            tamanho++;
        }
    }
    
    public void listar(){
        Inteiro inteiro = this.topo;
        System.out.println(inteiro.toString());
        while(inteiro.getProximo() != null){
            inteiro = inteiro.getProximo();
            System.out.println(inteiro.toString());
        }
    }
    
    public int desempilhar(){
            Inteiro inteiro = this.topo;
            this.topo = inteiro.getProximo();
            System.out.println("Removido: "+inteiro.getNumero());
            return inteiro.getNumero();   
    }   
}
