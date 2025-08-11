package poo;

import java.util.Scanner;

public class LojaTintas {
	public static void main(String[] args) {
		LojaTintas loja = new LojaTintas();
        loja.lerArea();
        loja.calcularTintas();
        loja.exibirResultado();
	}

    double area;
    int latas;
    double precoTotal;

    public void lerArea() {
        Scanner pintor = new Scanner(System.in);
        System.out.print("Digite o tamanho da área a ser pintada (em m²): ");
        area = pintor.nextDouble();
    }

    public void calcularTintas() {
        double litrosNecessarios = area / 3.0;
        latas = (int) Math.ceil(litrosNecessarios / 18.0); 
        precoTotal = latas * 80.0;
    }

    public void exibirResultado() {
        System.out.printf("Quantidade de latas a serem compradas: %d\n", latas);
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
    }
}