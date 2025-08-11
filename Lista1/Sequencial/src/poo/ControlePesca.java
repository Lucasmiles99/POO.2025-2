package poo;

import java.util.Scanner;

public class ControlePesca {
	public static void main(String[] args) {
		ControlePesca joao = new ControlePesca();
        joao.lerPeso();
        joao.calcularMulta();
        joao.exibirResultado();
	}

    double peso;
    double excesso;
    double multa;

    public void lerPeso() {
        Scanner peixe = new Scanner(System.in);
        System.out.print("Digite o peso de peixes trazido por João (em kg): ");
        peso = peixe.nextDouble();
    }

    public void calcularMulta() {
        double limite = 50.0;
        double valorMultaPorKg = 4.0;

        if (peso > limite) {
            excesso = peso - limite;
            multa = excesso * valorMultaPorKg;
        } else {
            excesso = 0.0;
            multa = 0.0;
        }
    }

    public void exibirResultado() {
        System.out.printf("Excesso: %.2f kg\n", excesso);
        System.out.printf("Multa a pagar: R$ %.2f\n", multa);
    }
}