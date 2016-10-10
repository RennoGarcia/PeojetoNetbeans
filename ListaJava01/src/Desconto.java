
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
public class Desconto {
     public static void main(String [] args){
        Scanner scan = new Scanner(System.in) ; 
       
        System.out.println("Digite o valor do produto: ");
        double Preco = scan.nextDouble();
        
        System.out.println("Digite em quantos % de desconto: ");
        double Desconto = scan.nextDouble();//recebe inteiro como valor %
        
        double total = Preco - (Preco * (Desconto/100)); 
        
        System.out.println("preço................."+Preco+".");
        System.out.println("Desconto.............."+Desconto+"%");
        System.out.println("Valor total da compra:"+total+" Reais");
        
    }
}
