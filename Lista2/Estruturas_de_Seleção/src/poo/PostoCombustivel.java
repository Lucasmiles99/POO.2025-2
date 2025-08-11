package poo;

import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();
        scanner.nextLine();  

        System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        String tipo = scanner.nextLine().trim().toUpperCase();

        double precoPorLitro = 0;
        double descontoPercentual = 0;

        if (tipo.equals("A")) {
            precoPorLitro = 1.90;
            if (litros <= 20) {
                descontoPercentual = 3;
            } else {
                descontoPercentual = 5;
            }
        } else if (tipo.equals("G")) {
            precoPorLitro = 2.50;
            if (litros <= 20) {
                descontoPercentual = 4;
            } else {
                descontoPercentual = 6;
            }
        } else {
            System.out.println("Tipo de combustível inválido!");
            scanner.close();
            return;
        }

        double valorSemDesconto = precoPorLitro * litros;
        double valorDesconto = valorSemDesconto * (descontoPercentual / 100);
        double valorFinal = valorSemDesconto - valorDesconto;

        System.out.printf("Valor a pagar: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}