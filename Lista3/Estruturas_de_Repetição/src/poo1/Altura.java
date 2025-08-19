package poo1;

import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAlunoMaisAlto = 0, numeroAlunoMaisBaixo = 0;
        int alturaMaisAlta = Integer.MIN_VALUE, alturaMaisBaixa = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno " + i + ": ");
            int numeroAluno = sc.nextInt();

            System.out.print("Digite a altura do aluno " + numeroAluno + " (em cm): ");
            int altura = sc.nextInt();

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                numeroAlunoMaisAlto = numeroAluno;
            }

            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                numeroAlunoMaisBaixo = numeroAluno;
            }
        }

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Aluno mais alto: Número " + numeroAlunoMaisAlto + " - Altura: " + alturaMaisAlta + " cm");
        System.out.println("Aluno mais baixo: Número " + numeroAlunoMaisBaixo + " - Altura: " + alturaMaisBaixa + " cm");

        sc.close();
    }
}