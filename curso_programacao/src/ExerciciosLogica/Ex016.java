package ExerciciosLogica;

import java.nio.charset.MalformedInputException;
import java.util.Locale;
import java.util.Scanner;

public class Ex016 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos cigarros voce fumar por dia? ");
        int cigarros = sc.nextInt();
        System.out.println("A quantos anos voce fuma? ");
        double anos = sc.nextInt();
        double min = (cigarros*10)*365;
        double dias = ((min/60)/24)*anos;

        System.out.printf("Em %.0f anos voce perdeu %.0f dias.", anos, dias ); 

        sc.close();
    }
    
}
