package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual preço do produto? ");
        double preco = sc.nextDouble();
        preco -= (preco * 5) / 100;

        System.out.println("Com desconto de 5% aplicado, o produto passar a ser R$"+ preco);
        
        sc.close();
    }
    
}
