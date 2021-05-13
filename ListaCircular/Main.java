package ListaCircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        
        lista.adicionar(new Pessoa("Gil do Vigor","02/05/2021","1"));
        lista.adicionar(new Pessoa("Saul Goodman","03/05/2013","2"));
        lista.adicionar(new Pessoa("Aparicio Streinstrasser","06/09/2015","3"));
        lista.adicionar(new Pessoa("Delegado Jairo","01/12/2020","4"));
        
        lista.listar();
        System.out.println("\n");
        
        lista.listar(2);
        
        lista.adicionar(new Pessoa("Neymar Junior","12/04/1994","5"),2);
        
        lista.remover("2");
        lista.listar();
        
    }
}
