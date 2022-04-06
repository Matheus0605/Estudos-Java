package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = sc.nextInt();

        System.out.println("O sucessor de " + x  +" é " + (x+1));
        System.out.println("O antecessor de "+ x + " é "+ (x-1));



        sc.close();

    }
}
