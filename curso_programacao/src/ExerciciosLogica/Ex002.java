package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;
import java.util.spi.LocaleServiceProvider;

public class Ex002 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String x = sc.nextLine();
        System.out.println("Ola " + x + ", muito prazer em te conhcer!");
        

        sc.close();
    }

}
