/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.vetores;

/**
 *
 * @author renno
 */
public class Vetores {
    public static void main(String[] args) {
        int valor;
        valor = 10;
        char aluno;
        aluno = 'a';
    
    /**vetor **/
    
        int [] vetorInt = new int[100];
        System.out.println(vetorInt.length);
        int vetorIntII [] = new int[50];
        System.out.println(vetorIntII.length);
        
        vetorInt[0]=1;
        int num =2;
        System.out.println(vetorInt[0]);
        
        for (int x = 0; x < vetorInt.length; x++) {
            vetorInt[x] = num*2;
            num = num*2;
        }
        
        for (int x = 0; x < vetorInt.length; x++) {
            System.out.println(vetorInt[x]);
        }
    }     
}
    
