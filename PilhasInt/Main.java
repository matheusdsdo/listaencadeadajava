package PilhasInt;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PilhaInt pi = new PilhaInt();
        
        pi.empilhar(5);
        pi.empilhar(3);
        pi.desempilhar();
        pi.empilhar(2);
        pi.empilhar(8);
        pi.desempilhar();
        pi.desempilhar();
        pi.empilhar(9);
        pi.empilhar(1);
        pi.desempilhar();
        pi.empilhar(7);
        pi.empilhar(6);
        pi.desempilhar();
        pi.desempilhar();
        pi.empilhar(4);
        pi.desempilhar();
        pi.desempilhar();
        
        
        pi.listar();
    }
}
