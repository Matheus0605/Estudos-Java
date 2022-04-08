package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos Km`s foram percorridos: ");
        double km = sc.nextDouble();
        System.out.println("Por quantos dias: ");
        int dias = sc.nextInt();
        int cobrar = (int) ((90 * dias) + (km * 0.20));

        System.out.println(cobrar);
        

        sc.close();

    }
    
}
