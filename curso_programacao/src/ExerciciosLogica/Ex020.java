package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex020 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é PAR");
        }
        else {
            System.out.println(num + " é IMPAR");
        }


        sc.close();
    }
    
}
