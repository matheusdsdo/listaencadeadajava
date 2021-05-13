
package ListaCircular;


public class Pessoa {
    private String nome;
    private String data;
    private String cpf;
    
    public Pessoa(){}

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", data=" + data + ", cpf=" + cpf + '}';
    }

    public Pessoa(String nome, String data, String cpf) {
        this.nome = nome;
        this.data = data;
        this.cpf = cpf;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
