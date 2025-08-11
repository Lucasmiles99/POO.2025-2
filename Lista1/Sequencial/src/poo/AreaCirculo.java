package poo;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		AreaCirculo circulo = new AreaCirculo();
        circulo.lerRaio();
        circulo.exibirArea();
	}

    double raio;

    public void lerRaio() {
    	Scanner Circulo = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        raio = Circulo.nextDouble();
    }

    public void exibirArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
    }
}