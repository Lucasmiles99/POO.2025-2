package poo1;

import java.io.*;
import java.util.Scanner;

public class SuperMercados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PRODUTOS = 5;
        final int SUPERMERCADOS = 5;

        double[][] precos = new double[PRODUTOS][SUPERMERCADOS];

        for (int i = 0; i < PRODUTOS; i++) {
            for (int j = 0; j < SUPERMERCADOS; j++) {
                System.out.print("Digite o preço do produto " + (i + 1) +
                                 " no supermercado " + (j + 1) + ": ");
                precos[i][j] = scanner.nextDouble();
            }
        }

        StringBuilder resultado = new StringBuilder("\n--- RELATÓRIO DE PREÇOS ---\n");

        resultado.append("\nPreços em cada supermercado:\n");
        for (int j = 0; j < SUPERMERCADOS; j++) {
            resultado.append("Supermercado ").append(j + 1).append(": ");
            for (int i = 0; i < PRODUTOS; i++) {
                resultado.append(String.format("R$ %.2f ", precos[i][j]));
            }
            resultado.append("\n");
        }

        resultado.append("\nMédia de preço por produto:\n");
        for (int i = 0; i < PRODUTOS; i++) {
            double soma = 0;
            for (int j = 0; j < SUPERMERCADOS; j++) {
                soma += precos[i][j];
            }
            double media = soma / SUPERMERCADOS;
            resultado.append("Produto ").append(i + 1).append(": R$ ")
                     .append(String.format("%.2f", media)).append("\n");
        }

        double[] somaSuper = new double[SUPERMERCADOS];
        resultado.append("\nSoma de preços por supermercado:\n");
        for (int j = 0; j < SUPERMERCADOS; j++) {
            double soma = 0;
            for (int i = 0; i < PRODUTOS; i++) {
                soma += precos[i][j];
            }
            somaSuper[j] = soma;
            resultado.append("Supermercado ").append(j + 1).append(": R$ ")
                     .append(String.format("%.2f", soma)).append("\n");
        }

        int indiceMaisBarato = 0, indiceMaisCaro = 0;
        for (int j = 1; j < SUPERMERCADOS; j++) {
            if (somaSuper[j] < somaSuper[indiceMaisBarato]) {
                indiceMaisBarato = j;
            }
            if (somaSuper[j] > somaSuper[indiceMaisCaro]) {
                indiceMaisCaro = j;
            }
        }

        resultado.append("\nSupermercado mais barato: Supermercado ")
                 .append(indiceMaisBarato + 1)
                 .append(" (Total: R$ ").append(String.format("%.2f", somaSuper[indiceMaisBarato])).append(")\n");

        resultado.append("Supermercado mais caro: Supermercado ")
                 .append(indiceMaisCaro + 1)
                 .append(" (Total: R$ ").append(String.format("%.2f", somaSuper[indiceMaisCaro])).append(")\n");

        System.out.println(resultado);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("supermercados.txt"))) {
            writer.write(resultado.toString());
            System.out.println("\nDados gravados em 'supermercados.txt'");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }

        System.out.println("\n--- Lendo do arquivo ---");
        try (BufferedReader reader = new BufferedReader(new FileReader("supermercados.txt"))) {
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