/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.vetores;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Renno
 */
public class TesteAluno {
    public static void main (String [] args){
        /*Scanner scan = new Scanner(System.in);
        
        Aluno [] alunos = new Aluno[10];
        alunos[0]=new Aluno();
        
        alunos[0].SetNome("joao");
        alunos[0].setEmail("joao@gmai.com");
        alunos[0].setMatricula(20121014);
        //alunos[0].setDataNascimento();
        
        System.out.println(alunos[0].getNome());
        System.out.println(alunos[0].getEmail());
        System.out.println(alunos[0].getMatricula());
       //referenciando elemento 1 para o 0 
        alunos[1]= alunos[0];
        
        System.out.println(alunos[1].getNome());
        System.out.println(alunos[1].getEmail());
        System.out.println(alunos[1].getMatricula());
    
        for(int i =0;i<alunos.length;i++){
            alunos[i] = new Aluno();
        
            System.out.println("Olá Usuário! insira o nome do novo aluno: ");
            alunos[i].SetNome( scan.nextLine());
            System.out.println("Insira seu email: ");
            alunos[i].setEmail( scan.nextLine());
            System.out.println("Insira a matricula do aluno: ");
            alunos[i].setMatricula( scan.nextLong());
            
        } */      
        
        ArrayList alunos = new ArrayList();
        alunos.add(new Aluno());
        
        Aluno aluno = new Aluno();
        aluno.SetNome("João");
        alunos.add(aluno);
        //System.out.println(new Aluno().getNome()); //provando a new devolve o endereço de referencia.
        
        //conversão de objeto para um tipo. facilita para o java para pegar o endereçamento.
        Aluno alunoTemp = (Aluno)alunos.get(0);
        
        System.out.println(alunoTemp.getNome());
        
        //Lista com tipo de elemento especificado entre as chaves. o Tipo aluno foi feito em outra classe.
        ArrayList<Aluno> alunosII = new ArrayList(); 
        alunosII.add(new Aluno());
        System.out.println(alunosII.get(0)); //imprime a referencia do objeto
        
    }
}
