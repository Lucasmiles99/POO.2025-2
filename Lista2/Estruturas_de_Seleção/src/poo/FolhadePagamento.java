package poo;

import java.util.Scanner;

public class FolhadePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: R$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = scanner.nextDouble();

        double salarioBruto = valorHora * horas;

        double descontoIR;
        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.10;
        } else {
            descontoIR = salarioBruto * 0.20;
        }

        double descontoSindicato = salarioBruto * 0.03;

        double fgts = salarioBruto * 0.11;

        double totalDescontos = descontoIR + descontoSindicato;

        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: (%.2f * %.2f) : R$ %.2f%n", valorHora, horas, salarioBruto);
        System.out.printf("(-) IR (%.0f%%) : R$ %.2f%n", (descontoIR > 0) ? (descontoIR / salarioBruto) * 100 : 0, descontoIR);
        System.out.printf("(-) Sindicato (3%%) : R$ %.2f%n", descontoSindicato);
        System.out.printf("FGTS (11%%) : R$ %.2f%n", fgts);
        System.out.printf("Total de descontos : R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido : R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}