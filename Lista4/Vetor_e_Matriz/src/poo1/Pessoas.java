package poo1;

import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[5];
        double[] alturas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            idades[i] = scanner.nextInt();
            System.out.print("Digite a altura da pessoa " + (i+1) + " (em metros): ");
            alturas[i] = scanner.nextDouble();
        }

        System.out.println("\n=== Idades e Alturas em ordem inversa ===");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i+1) + " -> Idade: " + idades[i] + " anos, Altura: " + alturas[i] + " m");
        }

        int maisVelho = 0, maisNovo = 0;
        int maisBaixo = 0, maisAlto = 0;

        for (int i = 1; i < 5; i++) {
            if (idades[i] > idades[maisVelho]) maisVelho = i;
            if (idades[i] < idades[maisNovo]) maisNovo = i;
            if (alturas[i] > alturas[maisAlto]) maisAlto = i;
            if (alturas[i] < alturas[maisBaixo]) maisBaixo = i;
        }

        System.out.println("\n=== Mais velho e mais novo ===");
        System.out.println("Mais velho: " + idades[maisVelho] + " anos, " + alturas[maisVelho] + " m");
        System.out.println("Mais novo: " + idades[maisNovo] + " anos, " + alturas[maisNovo] + " m");

        System.out.println("\n=== Mais alto e mais baixo ===");
        System.out.println("Mais alto: " + idades[maisAlto] + " anos, " + alturas[maisAlto] + " m");
        System.out.println("Mais baixo: " + idades[maisBaixo] + " anos, " + alturas[maisBaixo] + " m");

        double somaIdades = 0, somaAlturas = 0;
        for (int i = 0; i < 5; i++) {
            somaIdades += idades[i];
            somaAlturas += alturas[i];
        }
        double mediaIdade = somaIdades / 5;
        double mediaAltura = somaAlturas / 5;

        System.out.println("\nMédia de idade: " + mediaIdade);
        System.out.println("Média de altura: " + mediaAltura);

        System.out.println("\n=== Abaixo da média de idade ===");
        for (int i = 0; i < 5; i++) {
            if (idades[i] < mediaIdade) {
                System.out.println("Pessoa " + (i+1) + " -> Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\n=== Acima da média de idade ===");
        for (int i = 0; i < 5; i++) {
            if (idades[i] >= mediaIdade) {
                System.out.println("Pessoa " + (i+1) + " -> Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\n=== Abaixo da média de altura ===");
        for (int i = 0; i < 5; i++) {
            if (alturas[i] < mediaAltura) {
                System.out.println("Pessoa " + (i+1) + " -> Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\n=== Acima da média de altura ===");
        for (int i = 0; i < 5; i++) {
            if (alturas[i] >= mediaAltura) {
                System.out.println("Pessoa " + (i+1) + " -> Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        scanner.close();
    }
}