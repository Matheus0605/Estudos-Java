package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex029 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.println("Salário: ");
        double sal = sc.nextDouble();
        System.out.println("Quantos anos trabalha na empresa: ");
        int anos = sc.nextInt();

        if (anos <= 3) {
            double nsal = sal + (sal * 3 / 100);
            System.out.println("Seu salário teve um aumento de 3% : " + nsal);
        }
        else if (anos > 3 & anos <= 10) {
            double nsal = sal + (sal * 12.5 / 100);
            System.out.println("Seu salário teve um aumento de 12.5% : " + nsal);
        }
        else {
            double nsal = sal + (sal * 20 / 100);
            System.out.println("Seu salário teve um aumento de 20% : " + nsal);
        }


        sc.close();
    }
    
}
