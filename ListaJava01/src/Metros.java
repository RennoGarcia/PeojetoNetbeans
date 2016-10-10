
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
public class Metros {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in) ; 
       
        System.out.println("Digite a quantidade de mestros medidos: ");
        double x  = scan.nextDouble();
        
        double milimetro = x*1000;
        System.out.println("a medida em milimetros é: "+ milimetro);
    }
    
}
