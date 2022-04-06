package Exercicios;

import java.util.Locale;
import java.util.Scanner;


import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Ex018 {
    
    public static void main(String[] args) {
         
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Contagem regressiva 10 em 10-----------");
        System.out.print("Numero inicial: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i=n; i>=0; i-=10) {
            System.out.print(i + " ");  
        }

        System.out.println("Acabou!!");

    }


}
