package poo;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

        double percentualAumento;
        if (salarioAtual <= 280) {
            percentualAumento = 0.20;
        } else if (salarioAtual <= 700) {
            percentualAumento = 0.15;
        } else if (salarioAtual <= 1500) {
            percentualAumento = 0.10;
        } else {
            percentualAumento = 0.05;
        }

        double valorAumento = salarioAtual * percentualAumento;
        double novoSalario = salarioAtual + valorAumento;

        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentualAumento * 100);
        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}