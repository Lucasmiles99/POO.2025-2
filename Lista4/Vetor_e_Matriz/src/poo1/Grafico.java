package poo1;

import java.util.Scanner;

public class Grafico {
    public static void main(String[] args) {
        final int N = 5; 
        int[] valores = new int[N];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            int valor;
            do {
                System.out.print("Digite um valor entre 0 e 20 para a posição " + (i + 1) + ": ");
                valor = scanner.nextInt();
                if (valor < 0 || valor > 20) {
                    System.out.println("Valor inválido! Digite novamente.");
                }
            } while (valor < 0 || valor > 20);
            valores[i] = valor;
        }

        System.out.println("\nGráfico dos valores:");
        for (int i = 0; i < N; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();
    }
}