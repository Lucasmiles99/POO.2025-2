package poo;

import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
		AreaQuadrado quadrado = new AreaQuadrado();
        quadrado.lerLado();
        quadrado.exibirArea();
	}

    double lado;

    public void lerLado() {
        Scanner quadrado = new Scanner(System.in);
        System.out.print("Digite o valor do lado do quadrado: ");
        lado = quadrado.nextDouble();
    }

    public void exibirArea() {
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
    }
}