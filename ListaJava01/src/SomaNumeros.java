
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renno
 */
public class SomaNumeros {
    
   public static void main (String [] args){
        Scanner scan = new Scanner(System.in) ; 
       
        System.out.println("Digite um numero: ");
        int x  = scan.nextInt();
        
        System.out.println("Digite agora um outro numero: ");
        int y  = scan.nextInt();
        
        int soma = x +y;
        System.out.println("A soma dos dois números é igual a :" + soma);
        
   }
}
