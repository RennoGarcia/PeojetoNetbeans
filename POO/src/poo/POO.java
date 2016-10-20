/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author Renno
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Linha");
        int linha = teclado.nextInt();
        
        System.out.println("Coluna");
        int coluna = teclado.nextInt();
    
        int matrizA[][]= new int[linha][coluna];
        int matrizB[][]= new int[linha][coluna];
        int matrizC[][]= new int[linha][coluna];
        
        //numeros da matrix A
        for(int i=0; i<linha ; i++){
            //entrada da 
            for(int j=0; j<coluna ; j++){
                System.out.printf("A[%d][%d]: ", i+1, j+1);
                matrizA[i][j] = teclado.nextInt();
                
            }
        }
        
        //numeros da matrix B
        for(int i=0; i<linha ; i++){
            //entrada da 
            for(int j=0; j<coluna ; j++){
                System.out.printf("B[%d][%d]: ", i+1, j+1);
                matrizB[i][j] = teclado.nextInt();        
            }
        }
        //A+B
        for(int i= 0; i<linha; i++){
                for(int j=0; j<coluna ; j++){
                    matrizC[i][j] = matrizA[i][j] + matrizB[i][j];     
                }
            }
        for(int i= 0; i<linha; i++){   
            for(int j=0; j<coluna ; j++){
                System.out.print(matrizC[i][j]+  " ");
            }
                System.out.println("");
            }
        
        
        }
        
    
    }
    

