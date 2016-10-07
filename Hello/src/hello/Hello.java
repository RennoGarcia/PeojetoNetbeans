package hello;

import java.util.Scanner;

public class Hello {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ; 
        
        
        String nome;       
        float nota1;
        float nota2;
        float media;
        
        System.out.println("Olá Usuário! insira o nome do aluno: ");
        nome  = scan.nextLine();

        System.out.println("agora, insira a nota do primeiro bimestre");
        nota1 =scan.nextFloat();
        
        System.out.println("agora, a do segundo bimestre");
        nota2 =scan.nextFloat();
        
        media = (2*nota1 + 3*nota2)/5;
        System.out.println("A média de " + nome + " é :" + media);
        
    /**    public float media(float nota1, float nota2){
       
        }**/
    }
}