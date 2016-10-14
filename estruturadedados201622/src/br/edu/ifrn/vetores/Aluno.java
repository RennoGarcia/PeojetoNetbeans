/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.vetores;

import java.util.Date;

/**
 *
 * @author Renno
 */
public class Aluno {
    
    private String nome;
    private long matricula;
    private String email;
    private double rendaFamiliar;
    private Date dataNascimento;

    
    //sobescrita do método que está contido em Object
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", email=" + email + ", rendaFamiliar=" + rendaFamiliar + ", dataNascimento=" + dataNascimento + '}';
    }
    
    //construtor
    public Aluno(){
        nome = "sem nome";
        matricula = 0;
        email = "sem email";
    }
    
    
    public void SetNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(double rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }    
    
}


