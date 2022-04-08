package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex009 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos reais voce tem? ");
        double reais = sc.nextDouble();

        double dolar = reais / 3.45;
        System.out.printf("Com R$ %.2f voce pode comprar $%.2f em dolar. ",reais,dolar);


        sc.close();

    }

}
