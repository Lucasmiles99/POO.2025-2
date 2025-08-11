package poo;

import java.util.Scanner;

public class SalarioMensal {
	public static void main(String[] args) {
		SalarioMensal salarioMensal = new SalarioMensal();
        salarioMensal.lerDados();
        salarioMensal.exibirSalario();
	}

    double valorHora;
    double horasTrabalhadas;

    public void lerDados() {
        Scanner dinheiro = new Scanner(System.in);
        System.out.print("Informe quanto você ganha por hora: R$ ");
        valorHora = dinheiro.nextDouble();
        System.out.print("Informe o número de horas trabalhadas no mês: ");
        horasTrabalhadas = dinheiro.nextDouble();
    }

    public void exibirSalario() {
        double salario = valorHora * horasTrabalhadas;
        System.out.printf("O salário no mês é: R$ %.2f\n", salario);
    }
}