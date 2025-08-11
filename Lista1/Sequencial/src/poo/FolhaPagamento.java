package poo;

import java.util.Scanner;

public class FolhaPagamento {
	public static void main(String[] args) {
		FolhaPagamento folha = new FolhaPagamento();
        folha.lerDados();
        folha.calcularSalario();
        folha.exibirFolhaPagamento();
	}

    double valorHora;
    double horasTrabalhadas;
    double salarioBruto;
    double descontoIR;
    double descontoINSS;
    double descontoSindicato;
    double salarioLiquido;

    public void lerDados() {
        Scanner trabalho = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: R$ ");
        valorHora = trabalho.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = trabalho.nextDouble();
    }

    public void calcularSalario() {
        salarioBruto = valorHora * horasTrabalhadas;

        descontoIR = salarioBruto * 0.11;
        descontoINSS = salarioBruto * 0.08;
        descontoSindicato = salarioBruto * 0.05;

        salarioLiquido = salarioBruto - (descontoIR + descontoINSS + descontoSindicato);
    }

    public void exibirFolhaPagamento() {
        System.out.printf("+ Salário Bruto     : R$ %.2f\n", salarioBruto);
        System.out.printf("- IR (11%%)           : R$ %.2f\n", descontoIR);
        System.out.printf("- INSS (8%%)          : R$ %.2f\n", descontoINSS);
        System.out.printf("- Sindicato (5%%)     : R$ %.2f\n", descontoSindicato);
        System.out.printf("= Salário Líquido   : R$ %.2f\n", salarioLiquido);
    }
}