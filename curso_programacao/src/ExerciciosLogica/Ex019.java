package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex019 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Segunda nota: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;
        
        System.out.println("Sua media é " + media);
        if (media >= 7.0) {
            System.out.println("O aluno teve um bom aproveitamento.");
            System.out.println("APROVADO!");
        }
        else {
            System.out.println("O aluno NAO teve aproveitamento");
            System.out.println("REPROVADO!");
        }

        sc.close();
    }
    
}
