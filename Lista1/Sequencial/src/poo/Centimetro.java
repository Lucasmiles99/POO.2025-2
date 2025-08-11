package poo;

import java.util.Scanner;

public class Centimetro {
	public static void main(String[] args) {
		Centimetro conversor = new Centimetro();
        conversor.lerMetros();
        conversor.exibirCentimetros();
	}

    double metros;

    public void lerMetros() {
        Scanner tamanho = new Scanner(System.in);
        System.out.print("Digite a medida em metros: ");
        metros = tamanho.nextDouble();
    }

    public void exibirCentimetros() {
        double centimetros = metros * 100;
        System.out.printf("A medida em centímetros é: %.2f cm\n", centimetros);
    }
}