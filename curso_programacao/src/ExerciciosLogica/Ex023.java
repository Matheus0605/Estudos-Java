package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex023 {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("--------------------");
            System.out.println("Dia das mulheres");
            System.out.println("--------------------");
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Qual seu sexo: ");
            String sexo = sc.next();
            System.out.println("Qual o valor da comprar: ");
            double compra = sc.nextDouble();

            if (sexo == "Feminino") {
                double desc = compra - (compra * 13) / 100;
                System.out.println("Para homes o desconto é de 13%");
                System.out.printf("O valor de R$%.2f agora fica R$%.2f",compra, desc);
            }
            else {
                double desc = compra - (compra * 5) / 100;
                System.out.println("Para homes o desconto é de 5%");
                System.out.printf("O valor de R$%.2f agora fica R$%.2f",compra, desc);
            }
            


            sc.close();
        }
    
}
