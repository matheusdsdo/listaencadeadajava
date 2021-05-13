
package PilhasLetra;

public class Letra {
    private char letra;
    private Letra proximo;

    public Letra(char letra) {
        this.letra = letra;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Letra getProximo() {
        return proximo;
    }

    public void setProximo(Letra proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return ""+letra;
    }
    
}
