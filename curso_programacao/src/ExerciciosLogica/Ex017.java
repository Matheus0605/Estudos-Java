package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Em que velocidade esta o carro? ");
        int vel = sc.nextInt();

        if (vel > 80) {
            double multa = (vel - 80) * 5;
            System.out.printf("Voce esta acima velocidade!! \nVoce esta sendo multado em R$%.2f",multa);
        }
        else {
            System.out.println("Prossiga com cuidado!");
        }



        sc.close();

    }
    
}
