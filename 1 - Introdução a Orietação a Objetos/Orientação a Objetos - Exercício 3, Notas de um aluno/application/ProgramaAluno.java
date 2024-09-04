package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class ProgramaAluno {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();

        aluno.nome = input.nextLine();
        aluno.nota1 = input.nextDouble();
        aluno.nota2 = input.nextDouble();
        aluno.nota3 = input.nextDouble();
        System.out.printf("FINAL GRADE = %.2f%n", aluno.notafinal());

        if(aluno.notafinal() < 60){
            System.out.println("REPROVADO");
            System.out.printf("Para aprovação, faltou = %.2f%n", aluno.reprovado());
        }
        else{
            System.out.println("APROVADO");
        }

        input.close();
    }
}
