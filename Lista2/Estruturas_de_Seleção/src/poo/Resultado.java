package poo;

import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.2f%n", media);

        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Em Exame");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Média inválida");
        }

        scanner.close();
    }
}