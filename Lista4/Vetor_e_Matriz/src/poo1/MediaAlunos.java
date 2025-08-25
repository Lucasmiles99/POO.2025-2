package poo1;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[10][4]; 
        double[] medias = new double[10];
        int aprovados = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            System.out.println("\nDigite as 4 notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            medias[i] = soma / 4.0;

            if (medias[i] >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Aluno %d: %.2f%n", (i + 1), medias[i]);
        }

        System.out.println("\nNúmero de alunos com média >= 7.0: " + aprovados);

        scanner.close();
    }
}