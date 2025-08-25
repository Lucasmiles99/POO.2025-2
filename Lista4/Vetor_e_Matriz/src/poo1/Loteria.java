package poo1;

import java.io.*;
import java.util.*;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> sorteio = gerarNumerosAleatorios(6, 60);
        List<Integer> numerosSorteados = new ArrayList<>(sorteio);
        Collections.sort(numerosSorteados);

        System.out.println("=== LOTERIA ===");
        System.out.println("Números sorteados: " + numerosSorteados);

        System.out.print("Quantas cartelas deseja gerar? ");
        int n = sc.nextInt();

        int[][] cartelas = new int[n][6];
        int[] acertos = new int[n];

        for (int i = 0; i < n; i++) {
            Set<Integer> cartelaSet = gerarNumerosAleatorios(6, 60);
            List<Integer> cartela = new ArrayList<>(cartelaSet);
            Collections.sort(cartela);

            for (int j = 0; j < 6; j++) {
                cartelas[i][j] = cartela.get(j);
            }

            int cont = 0;
            for (int num : cartela) {
                if (sorteio.contains(num)) {
                    cont++;
                }
            }
            acertos[i] = cont;
        }

        System.out.println("\n=== RESULTADOS ===");
        for (int i = 0; i < n; i++) {
            System.out.print("Cartela " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(cartelas[i][j] + " ");
            }
            System.out.println("| Acertos: " + acertos[i]);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("loteria.txt"))) {
            writer.write("Números sorteados: " + numerosSorteados + "\n");
            for (int i = 0; i < n; i++) {
                writer.write("Cartela " + (i + 1) + ": ");
                for (int j = 0; j < 6; j++) {
                    writer.write(cartelas[i][j] + " ");
                }
                writer.write("| Acertos: " + acertos[i] + "\n");
            }
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }

        System.out.println("\n=== LENDO DO ARQUIVO ===");
        try (BufferedReader reader = new BufferedReader(new FileReader("loteria.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        sc.close();
    }

    public static Set<Integer> gerarNumerosAleatorios(int quantidade, int limite) {
        Random rand = new Random();
        Set<Integer> numeros = new HashSet<>();
        while (numeros.size() < quantidade) {
            numeros.add(rand.nextInt(limite) + 1);
        }
        return numeros;
    }
}