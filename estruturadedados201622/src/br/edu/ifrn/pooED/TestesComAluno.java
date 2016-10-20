/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.pooED;

/**
 *
 * @author 20121014040377
 */
public class TestesComAluno {
    public static void main (String [] args){
        
        Aluno [] alunos = new Aluno [10];
        alunos[0] = new Aluno();
        alunos[1] = new AlunoEspecial();
        
        alunos[0].realizarMatricula(new Disciplina());
        AlunoEspecial alunoEspecial = (AlunoEspecial) alunos[1];
     
        
        System.out.println(alunos[0].getNome());
        
    }
}
