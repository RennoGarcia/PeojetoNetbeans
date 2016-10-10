
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
public class HoraMinutoSegundo {
    public static void main(String [] args){
    
        Scanner scan = new Scanner(System.in) ; 
       
        System.out.println("Digite as horas: ");
        int h = scan.nextInt();
        
        System.out.println("Digite os minutos: ");
        int m = scan.nextInt();
        
        System.out.println("Digite os segundos: ");
        int s = scan.nextInt();
        
        /**
        * Hora = (h*60)*60;
        * Minuto = m*60;
        * Segundo = s
        **/
        int totalsegundos = ((h*60)*60)+ m*60+ s;
    
        System.out.println(totalsegundos + " Segundos");
    }
}
