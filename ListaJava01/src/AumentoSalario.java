
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
public class AumentoSalario {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in) ; 
       
        System.out.println("Digite o salário atual: ");
        double Salario = scan.nextDouble();
        
        System.out.println("Digite em quantos % deseja  aumento de salário: ");
        double Aumento = scan.nextDouble();//recebe inteiro como valor %
        
        double total = Salario + (Salario * (Aumento/100)); //calculo da soma do salário mais o almento desejado
        
        System.out.println("O salário inicial é "+Salario+". O Aumento desejado é de "+Aumento+"%"+" O novo Salário é de:"+total);
    }
}
