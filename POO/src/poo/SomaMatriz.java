/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JOptionPane;



/**
 *
 * @author Renno
 */
public class SomaMatriz {
    public static void main (String [] args){
    
        int linha = Integer.parseInt(JOptionPane.showInputDialog("Linha: "));
        int coluna = Integer.parseInt(JOptionPane.showInputDialog("Coluna: "));
           
        int matrizA[][]= new int[linha][coluna];
        int matrizB[][]= new int[linha][coluna];
        

        //numeros da matrix A
        for(int i=0; i<linha ; i++){ 
            for(int j=0; j<coluna ; j++){
                int matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("A[" + (i+1) + "]["+ (j+1) + "]"));
            }
        }
        
         for(int i=0; i<linha ; i++){ 
            for(int j=0; j<coluna ; j++){
               int matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("B["+ (i+1)+ "]["+ (j+1)+ "]"));
            }
        }
        
         String matrizC ="";
            for (int i =0; i<linha; i++){
                for (int j =0; j<linha; j++){

                    matrizC += (matrizA[i][j]+ matrizB[i][j]) + " ";
            }
         }
         
    }
}
