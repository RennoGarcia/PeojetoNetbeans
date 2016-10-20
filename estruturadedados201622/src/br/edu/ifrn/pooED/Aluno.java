/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.pooED;

import java.util.ArrayList;

/**
 *
 * @author Renno
 *
 */
public class Aluno {
    
    private String nome;
    private String matricula;
    private ArrayList<Disciplina>  disciplinas = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void realizarMatricula(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
}
