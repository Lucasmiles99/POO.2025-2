package poo1;

import java.io.*;
import java.util.*;

public class Olimpiadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de atletas: ");
        int n = sc.nextInt();

        double[][] saltos = new double[n][5];
        double[] medias = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nDigite os 5 saltos do atleta " + (i + 1) + ":");
            double soma = 0;
            double menor = Double.MAX_VALUE;

            for (int j = 0; j < 5; j++) {
                System.out.print("Salto " + (j + 1) + ": ");
                saltos[i][j] = sc.nextDouble();

                soma += saltos[i][j];
                if (saltos[i][j] < menor) {
                    menor = saltos[i][j];
                }
            }

            medias[i] = (soma - menor) / 4.0;
            System.out.printf("Média do atleta %d (desprezando o pior salto): %.2f\n", (i + 1), medias[i]);
        }

        int indiceCampeao = 0, indiceUltimo = 0;
        for (int i = 1; i < n; i++) {
            if (medias[i] > medias[indiceCampeao]) {
                indiceCampeao = i;
            }
            if (medias[i] < medias[indiceUltimo]) {
                indiceUltimo = i;
            }
        }

        System.out.println("\n=== RELATÓRIO FINAL ===");
        for (int i = 0; i < n; i++) {
            System.out.print("Atleta " + (i + 1) + " - Saltos: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(saltos[i][j] + " ");
            }
            System.out.printf("| Média: %.2f\n", medias[i]);
        }

        System.out.printf("\nMédia do Campeão (Atleta %d): %.2f\n", (indiceCampeao + 1), medias[indiceCampeao]);
        System.out.printf("Média do Último Lugar (Atleta %d): %.2f\n", (indiceUltimo + 1), medias[indiceUltimo]);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("competicao_saltos.txt"))) {
            writer.write("=== RELATÓRIO FINAL ===\n");
            for (int i = 0; i < n; i++) {
                writer.write("Atleta " + (i + 1) + " - Saltos: ");
                for (int j = 0; j < 5; j++) {
                    writer.write(saltos[i][j] + " ");
                }
                writer.write(String.format("| Média: %.2f\n", medias[i]));
            }
            writer.write("\nMédia do Campeão (Atleta " + (indiceCampeao + 1) + "): " + String.format("%.2f", medias[indiceCampeao]) + "\n");
            writer.write("Média do Último Lugar (Atleta " + (indiceUltimo + 1) + "): " + String.format("%.2f", medias[indiceUltimo]) + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }

        System.out.println("\n=== LENDO DO ARQUIVO ===");
        try (BufferedReader reader = new BufferedReader(new FileReader("competicao_saltos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}