package poo1;

import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de votantes: ");
        int totalVotantes = scanner.nextInt();

        int candidato1 = 0, candidato2 = 0, candidato3 = 0;

        for (int i = 1; i <= totalVotantes; i++) {
            System.out.println("\nVotante " + i + ", escolha seu candidato:");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            System.out.print("Seu voto: ");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                default:
                    System.out.println("Voto inválido! Não será contabilizado.");
            }
        }

        System.out.println("\n=== Resultado da Eleição ===");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");

        scanner.close();
    }
}