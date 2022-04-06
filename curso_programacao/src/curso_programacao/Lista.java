package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Lista {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Funcionario> list = new ArrayList<>();

        System.out.println("Cargo: ");
        String cargo = sc.nextLine();
        System.out.println("Id: ");
        int id = sc.nextInt();
        System.out.println("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Salario: ");
        double salario = sc.nextDouble();


        if (nome.equals("Matheus")) {
            
            Funcionario novaLista = new Funcionario(id,cargo,salario); 
            System.out.println(novaLista);
        } 
        else {
            Funcionario novaLista = new Funcionario(id,nome,salario); 
            System.out.println(novaLista);

        }  
            

    }
}
