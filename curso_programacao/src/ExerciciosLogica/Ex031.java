package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex031 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);;
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("        JOKEMPO        ");
        System.out.println("-----------------------");
        System.out.println("[1] Pedra \n[2] Papel \n[3] Tesoura");
        System.out.println("Jogador 1: ");
        int j1 = sc.nextInt();
        System.out.println("Jogar 2: ");
        int j2 = sc.nextInt();

        if (j1 == 1 & j2 == 2 || j1 == 2 & j2 == 1) {
            System.out.println("Papel embrulha Pedra!");
        }
        else if (j1 == 2 & j2 == 3 || j1 == 3 & j2 == 2 ) {
            System.out.println("Tesoura corta Papel!");
        }
        else if (j1 == 3 & j2 == 1 || j1 == 1 & j2 == 3) {
            System.out.println("Pedra quebra Tesoura!");
        }
        else {
            System.out.println("Tente novamente!");
        }



        sc.close();
    }
    
}
