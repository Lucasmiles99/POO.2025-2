package poo1;

import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int n = scanner.nextInt();

        int somaIdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double media = (double) somaIdades / n;

        System.out.println("\nA média de idade da turma é: " + media);

        if (media >= 0 && media <= 25) {
            System.out.println("A turma é JOVEM.");
        } else if (media >= 26 && media <= 60) {
            System.out.println("A turma é ADULTA.");
        } else if (media > 60) {
            System.out.println("A turma é IDOSA.");
        } else {
            System.out.println("Média inválida.");
        }

        scanner.close();
    }
}