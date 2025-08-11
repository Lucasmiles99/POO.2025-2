package poo;

import java.util.Scanner;

public class MediaAproveitamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        char conceito;
        if (media >= 9.0 && media <= 10.0) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9.0) {
            conceito = 'B';
        } else if (media >= 6.0 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4.0 && media < 6.0) {
            conceito = 'D';
        } else if (media >= 0 && media < 4.0) {
            conceito = 'E';
        } else {
            System.out.println("Média inválida.");
            scanner.close();
            return;
        }

        String situacao = (conceito == 'A' || conceito == 'B' || conceito == 'C') ? "APROVADO" : "REPROVADO";

        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}