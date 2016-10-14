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
public class Vetor {

    private int[] vetor;

    public int getMaior() {

        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
    public int getMenor() {

        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    /**
     * construtor*
     */
    public Vetor() {
        vetor = new int[10];
    }

    public Vetor(int numeroElementos) {
        vetor = new int[numeroElementos];

    }

    public void gerarValoresAleatorios() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
    }
}
