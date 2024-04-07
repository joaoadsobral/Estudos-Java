package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Conta usuario;

        System.out.println("Enter account number: ");
        int numero_conta = input.nextInt();

        System.out.println("Enter account holder: ");
        input.nextLine();
        String nome = input.nextLine();

        System.out.println("Is there na initial deposit? (y/n)");
        char resposta = input.next().charAt(0);

        if(resposta == 'y'){
            System.out.println("Enter initial deposit value: ");
            double deposito = input.nextDouble();
            usuario = new Conta(numero_conta, nome, deposito);
        }
        else{
            usuario = new Conta(numero_conta, nome);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(usuario);

        System.out.println("Enter a deposit value:");
        double deposito = input.nextDouble();
        System.out.println("Updated account data:");
        usuario.entrada(deposito);
        System.out.println(usuario);

        System.out.println("Enter a withdraw value: ");
        double saque = input.nextDouble();
        System.out.print("Updated account data:");
        usuario.retirada(saque);
        System.out.println(usuario);

        input.close();
    }
}
