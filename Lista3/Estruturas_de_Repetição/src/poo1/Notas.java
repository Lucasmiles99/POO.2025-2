package poo1;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Sistema de correção de prova");
            System.out.println("2 - Inverter número inteiro positivo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    sistemaProva(sc);
                    break;
                case 2:
                    inverterNumero(sc);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("⚠ Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    public static void sistemaProva(Scanner sc) {
        char[] gabarito = new char[10];
        System.out.println("\nDigite o gabarito da prova (10 questões, respostas A-E):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = sc.next().toUpperCase().charAt(0);
        }

        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;
        int totalAlunos = 0;
        int somaNotas = 0;
        String continuar;

        do {
            int acertos = 0;
            System.out.println("\n=== Respostas do aluno " + (totalAlunos + 1) + " ===");
            for (int i = 0; i < 10; i++) {
                System.out.print("Questão " + (i + 1) + ": ");
                char resposta = sc.next().toUpperCase().charAt(0);
                if (resposta == gabarito[i]) {
                    acertos++;
                }
            }

            System.out.println("Acertos do aluno: " + acertos + " de 10");
            System.out.println("Nota final: " + acertos);

            if (acertos > maiorNota) maiorNota = acertos;
            if (acertos < menorNota) menorNota = acertos;
            somaNotas += acertos;
            totalAlunos++;

            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\n=== RESULTADOS FINAIS ===");
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.printf("Média da turma: %.2f\n", (somaNotas / (double) totalAlunos));
    }

    public static void inverterNumero(Scanner sc) {
        System.out.print("\nDigite um número inteiro positivo: ");
        int numero = sc.nextInt();

        String numeroStr = Integer.toString(numero);
        String invertido = new StringBuilder(numeroStr).reverse().toString();

        System.out.println("Número invertido: " + invertido);
    }
}