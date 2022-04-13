package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex027 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Segunda nota ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;

        if (media <= 4.9) {
            System.out.printf("A media do aluno é %.1f: REPROVADO!", media);
        }
        else if (media >= 5 & media <= 6.9) {
            System.out.printf("A media do aluno é %.1f: Recuperação!", media);
        }
        else {
            System.out.printf("A media do aluno é %.1f: APROVADO!", media);
        }


        sc.close();
    }
    
}
