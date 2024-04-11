package application;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        int[][] mat = new int[m][n];

        // Armazenando dados da matriz
        for (int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                mat[i][j] = input.nextInt();
            }
        }
        // Ler o numero que pertence a Matriz
        int numeroEscolhido = input.nextInt();

        // Fazer com que seja printado os numeros adjacentes ao numero escolhido na Matriz
        for (int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == numeroEscolhido) {
                    System.out.println("Position " + i + " ," + j +" :");
                    if (j > 0) {
                        System.out.println("Numero a esquerda = " + mat[i][j - 1]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Numero a direita = " + mat[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Numero acima = " + mat[i - 1][j]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Numero embaixo = " + mat[i + 1][j]);
                    }
                }

                System.out.println(mat.length + ", " + mat[0].length);
            }
        }
    }
}
