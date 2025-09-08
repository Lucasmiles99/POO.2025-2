package poo1;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);

     	System.out.print("Digite quanto você ganha por hora: R$ ");
     	double valorHora = sc.nextDouble();

     	System.out.print("Digite o número de horas trabalhadas no mês: ");
     	double horas = sc.nextDouble();

     	FolhaPagamento folha = new FolhaPagamento(valorHora, horas);

     	System.out.println("\n===== Demonstrativo de Pagamento =====");
     	System.out.printf("+ Salário Bruto : R$ %.2f%n", folha.getSalarioBruto());
     	System.out.printf("- IR (11%%)      : R$ %.2f%n", folha.getIR());
     	System.out.printf("- INSS (8%%)     : R$ %.2f%n", folha.getINSS());
     	System.out.printf("- Sindicato (5%%): R$ %.2f%n", folha.getSindicato());
     	System.out.printf("= Salário Líquido: R$ %.2f%n", folha.getSalarioLiquido());

     	sc.close();
 	}
}