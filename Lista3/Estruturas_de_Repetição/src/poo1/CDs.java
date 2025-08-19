package poo1;

import java.util.Scanner;

public class CDs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de CDs da coleção: ");
        int qtdCDs = scanner.nextInt();

        double total = 0;

        for (int i = 1; i <= qtdCDs; i++) {
            System.out.print("Digite o valor do CD " + i + ": R$ ");
            double valor = scanner.nextDouble();
            total += valor;
        }

        double media = total / qtdCDs;

        System.out.println("\nValor total investido: R$ " + total);
        System.out.println("Valor médio gasto por CD: R$ " + media);

        scanner.close();
    }
}