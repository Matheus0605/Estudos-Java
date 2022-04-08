package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------------------");
        System.out.println("Pintando  a Parede");
        System.out.println("---------------------");
        System.out.println();
        System.out.print("Qual a altura: ");
        double alt = sc.nextDouble(); 
        System.out.print("Qual a largura: ");
        double lar = sc.nextDouble();

        double result = (alt + lar) / 2;
        System.out.println("Tinta necessaria para pintar: " + result);


        sc.close();

    }
    
}
