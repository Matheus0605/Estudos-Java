package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex013 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quanto é seu salário: ");
        double sal = sc.nextDouble();
        sal += sal * 15 / 100;

        System.out.println("Seu salário teve um aumento de 15% \n Agora passou a ser R$"+ sal);


        sc.close();
    
    }
    
}
