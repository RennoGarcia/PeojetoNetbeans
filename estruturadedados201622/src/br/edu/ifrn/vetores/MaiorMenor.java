/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.vetores;

import java.util.Random;

/**
 *
 * @author Renno
 */
public class MaiorMenor {
    public static void main(String [] args){
        Random random = new Random();
        int [] vetor = new int [10];
        
        for (int x=0 ; x < vetor.length ; x++){
         
            vetor[x] = (int) (Math.random() * 100);    
            //vetor[x] = random.nextInt();
        }
        
        for (int y=0 ; y < vetor.length ; y++){
            System.out.println(vetor[y]);
        } 
        
        int maior =0 , menor= 0;
        
        for (int z =0; z < vetor.length; z++){
         
            if(vetor[z]< 50){
                menor = menor +1;
            }else{
                maior = maior +1 ;
            }
        }
        System.out.println("existe(m) "+ maior +" numero(s) maior que zero");
        System.out.println("existe(m) "+ menor +" numero(s) menor que zero");
        
        int M = 0;
        
        }
        
      
}
