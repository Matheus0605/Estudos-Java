package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex026 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite mais um numero: ");
        int n2 = sc.nextInt();

        if (n1>n2) {
            System.out.println("O primeiro valor é maior!");
        }
        else if (n2>n1) {
            System.out.println("O segundo valor é maior!");
        }
        else {
            System.out.println("Não existe valor maior, os dois são iguais!");
        }

        sc.close();
    }
    
}
