package poo1;

import java.util.Scanner;

public class Eleicao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] candidatos = {"", "José", "João", "Maria", "Ana"};

        int[] votosCandidatos = new int[5]; 
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;

        System.out.println("=== ELEIÇÃO PRESIDENCIAL ===");
        System.out.println("1 - José");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("Digite 0 para encerrar a votação.");
        System.out.println("=============================\n");

        while (true) {
            System.out.print("Digite seu voto: ");
            int voto = sc.nextInt();

            if (voto == 0) {
                break; 
            }

            switch (voto) {
                case 1: case 2: case 3: case 4:
                    votosCandidatos[voto]++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBrancos++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.");
            }
        }

        System.out.println("\n=== RESULTADOS ===");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Candidato " + candidatos[i] + ": " + votosCandidatos[i] + " votos");
        }
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos em Branco: " + votosBrancos);

        if (totalVotos > 0) {
            double percNulos = (votosNulos * 100.0) / totalVotos;
            double percBrancos = (votosBrancos * 100.0) / totalVotos;

            System.out.printf("Percentual de Nulos: %.2f%%\n", percNulos);
            System.out.printf("Percentual de Brancos: %.2f%%\n", percBrancos);
        } else {
            System.out.println("Nenhum voto registrado.");
        }

        sc.close();
    }
}