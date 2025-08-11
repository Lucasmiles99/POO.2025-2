package poo;

import java.util.Scanner;

public class MediaAluno2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media == 10) {
            System.out.println("Aprovado com Distinção - Média: " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado - Média: " + media);
        } else {
            System.out.println("Reprovado - Média: " + media);
        }

        scanner.close();
    }
}