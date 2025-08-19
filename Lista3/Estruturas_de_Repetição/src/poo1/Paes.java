package poo1;

import java.util.Scanner;

public class Paes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o preço do pão: R$ ");
        double precoPao = scanner.nextDouble();

        System.out.println("\nPanificadora Pão de Ontem - Tabela de preços\n");

        for (int i = 1; i <= 50; i++) {
            double valor = i * precoPao;
            System.out.printf("%2d - R$ %.2f\n", i, valor);
        }

        scanner.close();
    }
}