package poo1;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int N = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / N;

        System.out.println("A média aritmética das " + N + " notas é: " + media);

        scanner.close();
    }
}