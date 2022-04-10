package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex022 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu ano de nascimento: ");
        int anoNasc = sc.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        
        int idade = anoAtual - anoNasc;
        if (idade > 18) {
            int alist = idade - 18;
            System.out.printf("Olá %s, voce ja tem %d anos e aqui esta.\nO tempo que fez em anos que seu alistamento passou: %d",nome,idade,alist );
        }
        else {
            int alist = 18 - idade;
            System.out.printf("Olá %s, voce ja tem %d anos e aqui esta.\nO tempo que falta em anos para se alistar: %d",nome,idade,alist );
        }



        sc.close();
    }
    
}
