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
public class Main {
    public static void main(String[] args) {
        System.out.println("Clinicão");
        Fila f = new Fila();
        
        f.enfileirar(new Paciente("Freddie","Shih-tzu","Vômito"));
        f.enfileirar(new Paciente("Pig","Siamês","Tosse"));
        f.enfileirar(new Paciente("Catra","Pug","Problema respiratório"));
        f.enfileirar(new Paciente("Marlin","Pastor Alemão","Raiva"));
        
        f.desenfileirar();
        f.desenfileirar();
        
        f.enfileirar(new Paciente("Marlos","Pintscher","Vômito"));
        
        f.desenfileirar();
        f.desenfileirar();
        f.desenfileirar();
        
    }
}
