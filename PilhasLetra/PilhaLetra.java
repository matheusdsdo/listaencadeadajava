package PilhasLetra;

public class PilhaLetra {
    private Letra topo;
    private String original;

    public void criar(String palavra){
        this.original = palavra;
        System.out.println("Original: "+original);
        for (int i = 0; i < palavra.length(); i++) {
            if (this.topo == null){
                this.topo = new Letra(palavra.charAt(i));
            } else {
                Letra letra = this.topo;
                this.topo = new Letra(palavra.charAt(i));
                this.topo.setProximo(letra);
            }
        }
    }
    
    public boolean palindroma(){
        Letra letra = this.topo;
        String montagem = topo.toString();
        for (int i = 0; i < original.length()-1; i++) {
            letra = letra.getProximo();
            montagem += letra.getLetra();
        }    
        System.out.println("Montagem: "+montagem);
        if (montagem.equals(this.original)){
            System.out.println("É palíndromo");
            return true;
        } else {
            System.out.println("Não é palíndromo");
            return false;
        }
    }
    
    public void listar(){
        //LISTA A PALAVRA INVERTIDA
        Letra letra = this.topo;
        System.out.println(letra.toString());
        while(letra.getProximo() != null){
            letra = letra.getProximo();
            System.out.println(letra.toString());
        }
    }
    

    public String getOriginal() {
        return original;
    }
}
