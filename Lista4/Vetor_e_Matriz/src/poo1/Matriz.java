package poo1;

import java.io.*;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite um número ímpar entre 3 e 11: ");
            n = scanner.nextInt();
            if (n < 3 || n > 11 || n % 2 == 0) {
                System.out.println("Valor inválido! Deve ser ímpar e entre 3 e 11.");
            }
        } while (n < 3 || n > 11 || n % 2 == 0);

        int[][] matriz = new int[n][n];

        System.out.println("\nDigite os valores da matriz (" + n + "x" + n + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int soma = 0, maior = matriz[0][0], menor = matriz[0][0];
        int pares = 0, impares = 0;
        int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int valor = matriz[i][j];
                soma += valor;

                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;

                if (valor % 2 == 0) pares++;
                else impares++;

                if (i == j) somaDiagonalPrincipal += valor;
                if (i + j == n - 1) somaDiagonalSecundaria += valor;
            }
        }

        double media = (double) soma / (n * n);

        System.out.println("\nMatriz informada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }

        StringBuilder resultado = new StringBuilder();
        resultado.append("\n--- Estatísticas da Matriz ---\n");
        resultado.append("Soma dos elementos: ").append(soma).append("\n");
        resultado.append("Média dos elementos: ").append(String.format("%.2f", media)).append("\n");
        resultado.append("Maior valor: ").append(maior).append("\n");
        resultado.append("Menor valor: ").append(menor).append("\n");
        resultado.append("Quantidade de pares: ").append(pares).append("\n");
        resultado.append("Quantidade de ímpares: ").append(impares).append("\n");
        resultado.append("Soma da diagonal principal: ").append(somaDiagonalPrincipal).append("\n");
        resultado.append("Soma da diagonal secundária: ").append(somaDiagonalSecundaria).append("\n");

        System.out.println(resultado.toString());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("matriz_resultados.txt"))) {
            writer.write("Matriz:\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    writer.write(matriz[i][j] + "\t");
                }
                writer.write("\n");
            }
            writer.write(resultado.toString());
            System.out.println("Resultados salvos em 'matriz_resultados.txt'");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }

        System.out.println("\n--- Conteúdo do arquivo ---");
        try (BufferedReader reader = new BufferedReader(new FileReader("matriz_resultados.txt"))) {
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