package poo;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Adição (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("\nResultado: " + resultado);

            if (resultado > 0) {
                System.out.println("O número é POSITIVO.");
            } else if (resultado < 0) {
                System.out.println("O número é NEGATIVO.");
            } else {
                System.out.println("O número é ZERO.");
            }

            if (resultado == Math.floor(resultado)) {
                System.out.println("O número é INTEIRO.");
                
                if ((int) resultado % 2 == 0) {
                    System.out.println("O número é PAR.");
                } else {
                    System.out.println("O número é ÍMPAR.");
                }
            } else {
                System.out.println("O número é DECIMAL.");
            }
        }

        scanner.close();
    }
}