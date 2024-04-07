package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class ProgramaRetangulo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        retangulo.altura = input.nextDouble();
        retangulo.largura = input.nextDouble();

        System.out.printf("Perimetro do Retangulo = %.2f%n", retangulo.perimetro());
        System.out.printf("Area do Retangulo = %.2f%n", retangulo.area());
        System.out.printf("Diagonal do Retangulo = %.2f%n", retangulo.diagonal());

        input.close();
    }
}
