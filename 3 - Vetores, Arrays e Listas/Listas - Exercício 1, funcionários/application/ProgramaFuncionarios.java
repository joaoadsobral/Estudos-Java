package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;


public class ProgramaFuncionarios {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Funcionarios> listaFuncionarios = new ArrayList<>();

        // Leitura dos dados
        System.out.println("Quantos funcionarios serão registrados? ");
        int n = input.nextInt();

        for (int i=0; i<n; i++) {

            System.out.printf("Funcionario : %d%n", i + 1);
            System.out.println("ID :");
            int id = input.nextInt();
            //verificar se já existe um id cadastrado

            while (existe(listaFuncionarios, id)) {
                System.out.println("Esse id já foi cadastrado, insira um novo id: ");
                id = input.nextInt();
            }
            System.out.println("Nome do Funcionário : ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("Salário do funcionário : ");
            double salario = input.nextDouble();

            Funcionarios funcionarios = new Funcionarios(id, nome, salario);

            listaFuncionarios.add(funcionarios);
        }

        // Aumento salarial
        System.out.print("Selecione o ID do funcionário que irá receber o aumento : ");
        System.out.println();
        int id = input.nextInt();
        Funcionarios funcionarios = listaFuncionarios.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
        if (funcionarios != null) {
            System.out.println("Insira a aumentoSalarial : ");
            double porcentagem = input.nextDouble();
            funcionarios.aumentoSalarial(porcentagem);
        }
        else {
            System.out.println("Esse id não existe.");
        }

        // Printando os funcionarios
        System.out.println("Lista de funcionarios");
        for (Funcionarios x : listaFuncionarios) {
            System.out.println(x);
        }

        input.close();
    }

    // Função para verificar se o id já foi cadastrado
    public static boolean existe(List<Funcionarios> listaFuncionarios, int id) {
        Funcionarios funcionarios = listaFuncionarios.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
        // Se der nulo, o resultado vai ser falso, então vai retornar que não existe um ID previamente cadastrado
        return funcionarios != null;
    }
}
