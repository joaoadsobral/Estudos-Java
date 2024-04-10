package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class ProgramaAlturas {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = input.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i=0; i<vect.length; i++){
            System.out.printf("Dados da %da  pessoa:%n", i + 1);
            System.out.println("Nome :");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("Idade :");
            int idade = input.nextInt();
            System.out.println("Altura :");
            double altura = input.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
        }

        int dadosIdades = 0;
        double soma_altura = 0;
        for (int i=0; i<vect.length; i++){
            soma_altura += vect[i].getAltura();

            if (vect[i].getIdade() < 16){
                dadosIdades += 1;
            }
        }

        double media = soma_altura / vect.length;
        double porcentagem = (double) (dadosIdades * 100) / vect.length;
        System.out.printf("Altura média : %.2f%n", media);
        System.out.printf("Pessoas com idade menor que 16 anos = %.1f%%\n", porcentagem );

        for (int i=0; i<vect.length; i++){
            if (vect[i].getIdade() < 16){
                System.out.printf("%s%n", vect[i].getNome());
            }
        }
        
        input.close();
    }
}
