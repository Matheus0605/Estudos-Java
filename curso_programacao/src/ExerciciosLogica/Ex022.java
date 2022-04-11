package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex022 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qualquer ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println(ano + " é bissexto");
        }
        else {
            System.out.println(ano + " não é bissexto");
        }


        sc.close();
    }
    
}
