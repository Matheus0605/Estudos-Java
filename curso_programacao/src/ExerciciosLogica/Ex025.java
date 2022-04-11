package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex025 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Reta 1: ");
        int r1 = sc.nextInt();
        System.out.println("Reta 2: ");
        int r2 = sc.nextInt();
        System.out.println("Reta 3: ");
        int r3 = sc.nextInt();

        if (r1 < r2 + r3 & r2 < r1 + r3 & r3 < r1 + r2) {
            System.out.println("Formam um triangulo!");
        } 
        else {
            System.out.println("NÃO formam um triangulo");
        }



        sc.close();
    }
    
}
