package ExerciciosLogica;

import java.nio.channels.AcceptPendingException;
import java.util.Locale;
import java.util.Scanner;

public class Ex011 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Valor de A: ");
        int a = sc.nextInt();
        System.out.println("Valor de B: ");
        int b = sc.nextInt();
        System.out.println("Valor de C: ");
        int c = sc.nextInt();

        int delta = b^2 - 4 *a * c;
        System.out.println("O valor de delta é "+ delta);


        sc.close();

    }
    
}
