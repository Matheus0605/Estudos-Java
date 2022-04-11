package ExerciciosLogica;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Ex024 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a distancia que pretende percorrer? ");
        double dist = sc.nextInt();

            if (dist > 200) {
                double conta = dist * 0.45;
                System.out.println("Valor da viajem: " + conta);
            }
            else {
                double conta = dist * 0.50;
                System.out.println("Valor da viajem: " + conta);
            }


            sc.close();
    }
    
}
