package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex018 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento (yyyy): ");
        int anoNasc = sc.nextInt();
        System.out.println("Ano atual: ");
        int anoAtual = sc.nextInt();
        int idade = anoAtual - anoNasc;
        if (idade >= 18) {
            System.out.println(idade + ", Voce ja tem idade suficiente para votar!");
        }
        else {
            System.out.println(idade + ",Voce ainda nao tem idade para votar!");
        }


        sc.close();
    }
    
}
