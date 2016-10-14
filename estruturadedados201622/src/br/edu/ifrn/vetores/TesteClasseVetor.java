/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.vetores;

/**
 *
 * @author Renno
 */
public class TesteClasseVetor {

    public static void main(String[] args) {

        Vetor vetor10 = new Vetor();
        vetor10.gerarValoresAleatorios();
        System.out.println("Maior valor do vetor de tamanho 10 : "+vetor10.getMaior());
        System.out.println("Menor valor do vetor de tamanho 10 : "+vetor10.getMenor());
        //**
        //Vetor vetor100 = new Vetor(100);
        //vetor100.gerarValoresAleatorios();
        //System.out.println(vetor100.getMaior());
        //CONTINUAR
    
    }
}
