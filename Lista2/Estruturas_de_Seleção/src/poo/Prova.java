package poo;

import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] gabarito = {"a","a","b","b","c","c","d","d","e","e"};
        String[] respostas = new String[10];
        int pontuacao = 0;

        System.out.println("Digite as respostas do candidato (a, b, c, d ou e):");

        for (int i = 0; i < 10; i++) {
            System.out.print("Resposta Q" + (i+1) + ": ");
            String resposta = scanner.nextLine().trim().toLowerCase();

            while (!resposta.matches("[abcde]")) {
                System.out.print("Resposta inválida. Digite apenas a, b, c, d ou e: ");
                resposta = scanner.nextLine().trim().toLowerCase();
            }

            respostas[i] = resposta;
        }

        System.out.println("\nResultado da prova:");

        for (int i = 0; i < 10; i++) {
            if (respostas[i].equals(gabarito[i])) {
                System.out.println("Q" + (i+1) + " : " + respostas[i] + " : Correto");
                pontuacao++;
            } else {
                System.out.println("Q" + (i+1) + " : " + respostas[i] + " : Errada, resposta correta (" + gabarito[i] + ")");
            }
        }

        System.out.println("\nPontuação Final: " + pontuacao);

        scanner.close();
    }
}