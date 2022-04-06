package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        System.out.println("Numero final? ");
        int n = sc.nextInt();
        System.out.println();
        
        for (int i=0; i<=n; i+=5) {
            
            System.out.println(i);
        } 
        
        System.out.println("Acabou!!");
        
    
    }
        

}
