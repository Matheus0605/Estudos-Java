package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma distancia em metros: ");
        double metros = sc.nextDouble();

        System.out.println((metros / 1000) + "Km");
        System.out.println((metros / 100) + "Hm");
        System.out.println((metros / 10) + "Dam");
        System.out.println((metros * 10) + "Dm");
        System.out.println((metros * 100) + "Cm");
        System.out.println((metros * 1000) + "MM");
       
        sc.close();

    }
    
}
