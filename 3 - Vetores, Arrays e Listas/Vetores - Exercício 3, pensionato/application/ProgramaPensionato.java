package application;


import java.util.Locale;
import java.util.Scanner;
import entities.Quarto;

public class ProgramaPensionato {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos quartos serão alugados?");

        Quarto[] vect = new Quarto[10];
        int n = input.nextInt();

        for (int i=0; i<n; i++){
            System.out.printf("Inquilino : %d%n", i + 1);
            System.out.println("Nome do inquilino : ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("Email do inquilino");
            String email = input.next();
            input.nextLine();
            System.out.println("Quarto desejado : ");
            int quarto = input.nextInt();

            vect[quarto] = new Quarto(nome, email, quarto);
        }

        System.out.println("Quartos previamente ocupados : ");
        for (int i=0; i<vect.length; i++){
            if (vect[i] != null){
                System.out.println(vect[i]);
            }
        }
    }
}
