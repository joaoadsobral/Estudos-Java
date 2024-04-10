package application;

import java.util.Scanner;

public class ProgramaNegativos {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Quantos números serão digitados? ");
        int n = input.nextInt();
        int[] vect = new int[n];

        for(int i=0; i<vect.length; i++){
            System.out.println("Digite um número : ");
            vect[i] = input.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS");

        for(int i=0; i<vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        input.close();
    }
}

