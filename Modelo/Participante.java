/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author aluno
 */
public class Participante implements ILeitor , IProgramador{

    private String nome;
    
    //Construtores

    public Participante() {
    }

    public Participante(String nome) {
        this.nome = nome;
    }
    
    //Getters & Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    @Override
    public void Lendo() {
        System.out.println("Lendo...");
    }

    @Override
    public void Programador() {
        System.out.println("Programando...");
    }
    
}
