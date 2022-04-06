package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int x = sc.nextInt();
        System.out.print("Digite mais um numero: ");
        int y = sc.nextInt();
        int soma = x + y;

        System.out.printf("%d + %d = %d",x, y, soma);



        sc.close();
    }


}
