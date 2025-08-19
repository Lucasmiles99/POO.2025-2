package poo1;

import java.util.Scanner;

public class Divida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: R$ ");
        double dividaInicial = sc.nextDouble();

        int[] parcelas = {1, 3, 6, 9, 12};
        double[] jurosPercentuais = {0, 10, 15, 20, 25};

        System.out.println("\nValor da Dívida\tValor dos Juros\tQtd Parcelas\tValor da Parcela");

        for (int i = 0; i < parcelas.length; i++) {
            int qtdParcelas = parcelas[i];
            double juros = (dividaInicial * jurosPercentuais[i]) / 100.0;
            double valorDivida = dividaInicial + juros;
            double valorParcela = valorDivida / qtdParcelas;

            System.out.printf("R$ %.2f\tR$ %.2f\t\t%d\t\tR$ %.2f\n",
                    valorDivida, juros, qtdParcelas, valorParcela);
        }

        sc.close();
    }
}