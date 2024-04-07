package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class ProgramaFuncionario {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.nome = input.nextLine();
        System.out.print("Salário Bruto: ");
        funcionario.salariobruto = input.nextDouble();
        System.out.print("Taxas: ");
        funcionario.imposto = input.nextDouble();

        System.out.println("Funcionário: " + funcionario);

        System.out.print("Porcentagem de aumento de Salário: ");
        double taxa = input.nextDouble();
        funcionario.Calculadora(taxa);

        System.out.println("Salário atualizado = " + funcionario);

        input.close();
        }
    }