
package PilhasInt;

public class Inteiro {
    private int numero;
    private Inteiro proximo;

    public Inteiro(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Inteiro getProximo() {
        return proximo;
    }

    public void setProximo(Inteiro proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Numero: " + numero + '.';
    }
    
    
}
