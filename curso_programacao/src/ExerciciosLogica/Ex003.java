package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Ex003 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Mês: ");
        String mes = sc.nextLine();
        System.out.print("Nome do Funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Salario ganho: ");
        double salario = sc.nextDouble();

        System.out.printf("O Funcionario %s ganhou %.2f no mes de %s", nome, salario, mes);


        sc.close();

    }



}
