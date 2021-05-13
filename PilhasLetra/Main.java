
package PilhasLetra;

public class Main {
    public static void main(String[] args) {
        PilhaLetra pl = new PilhaLetra();
        String palavra = "amor a roma".toUpperCase().replace(" ", "");
        
        pl.criar(palavra);
        
        pl.listar();
        
        pl.palindroma();
    }
}
