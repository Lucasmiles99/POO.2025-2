package poo1;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int qtdTurmas = scanner.nextInt();

        int totalAlunos = 0;

        for (int i = 1; i <= qtdTurmas; i++) {
            int alunos;
            do {
                System.out.print("Digite a quantidade de alunos da turma " + i + " (máximo 40): ");
                alunos = scanner.nextInt();

                if (alunos > 40) {
                    System.out.println("Erro! Uma turma não pode ter mais de 40 alunos. Tente novamente.");
                }
            } while (alunos > 40);

            totalAlunos += alunos;
        }

        double media = (double) totalAlunos / qtdTurmas;

        System.out.println("\nNúmero médio de alunos por turma: " + media);

        scanner.close();
    }
}