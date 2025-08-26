package poo1;

import java.io.*;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int N = scanner.nextInt();
        scanner.nextLine(); 

        String[] nomes = new String[N];
        double[][] notas = new double[N][2];
        double[] medias = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("\nNome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Nota 1: ");
            notas[i][0] = scanner.nextDouble();

            System.out.print("Nota 2: ");
            notas[i][1] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        StringBuilder relatorio = new StringBuilder("\n--- RELATÓRIO DE NOTAS ---\n");

        relatorio.append("\nNotas e médias dos alunos:\n");
        for (int i = 0; i < N; i++) {
            medias[i] = (notas[i][0] + notas[i][1]) / 2.0;
            relatorio.append(nomes[i]).append(": ")
                     .append("Nota1=").append(notas[i][0]).append(", ")
                     .append("Nota2=").append(notas[i][1]).append(", ")
                     .append("Média=").append(String.format("%.2f", medias[i]))
                     .append("\n");
        }

        double maiorNota = notas[0][0], menorNota = notas[0][0];
        String alunoMaiorNota = nomes[0], alunoMenorNota = nomes[0];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                    alunoMaiorNota = nomes[i];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                    alunoMenorNota = nomes[i];
                }
            }
        }
        relatorio.append("\nMaior nota: ").append(maiorNota).append(" (Aluno: ").append(alunoMaiorNota).append(")\n");
        relatorio.append("Menor nota: ").append(menorNota).append(" (Aluno: ").append(alunoMenorNota).append(")\n");

        double maiorMedia = medias[0], menorMedia = medias[0];
        String alunoMaiorMedia = nomes[0], alunoMenorMedia = nomes[0];

        for (int i = 1; i < N; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = nomes[i];
            }
        }
        relatorio.append("\nMaior média: ").append(String.format("%.2f", maiorMedia))
                 .append(" (Aluno: ").append(alunoMaiorMedia).append(")\n");
        relatorio.append("Menor média: ").append(String.format("%.2f", menorMedia))
                 .append(" (Aluno: ").append(alunoMenorMedia).append(")\n");

        double somaMedias = 0;
        for (double m : medias) somaMedias += m;
        double mediaGeral = somaMedias / N;

        relatorio.append("\nMédia geral da turma: ").append(String.format("%.2f", mediaGeral)).append("\n");

        relatorio.append("\nAlunos acima da média geral:\n");
        for (int i = 0; i < N; i++) {
            if (medias[i] > mediaGeral) {
                relatorio.append(nomes[i]).append(" (Média ").append(String.format("%.2f", medias[i])).append(")\n");
            }
        }

        relatorio.append("\nAlunos abaixo da média geral:\n");
        for (int i = 0; i < N; i++) {
            if (medias[i] < mediaGeral) {
                relatorio.append(nomes[i]).append(" (Média ").append(String.format("%.2f", medias[i])).append(")\n");
            }
        }

        System.out.println(relatorio);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notas_alunos.txt"))) {
            writer.write(relatorio.toString());
            System.out.println("\nRelatório gravado em 'notas_alunos.txt'");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }

        System.out.println("\n--- Lendo do arquivo ---");
        try (BufferedReader reader = new BufferedReader(new FileReader("notas_alunos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}