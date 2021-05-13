/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filas;

/**
 *
 * @author mathe
 */
public class Paciente {
    private String nome;
    private String raca;
    private String sintoma;

    public Paciente() {
    }

    public Paciente(String nome, String email, String cpf) {
        this.nome = nome;
        this.raca = email;
        this.sintoma = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return raca;
    }

    public void setData(String email) {
        this.raca = email;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }    
}
