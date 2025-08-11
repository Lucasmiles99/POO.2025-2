package poo;

import java.util.Scanner;

public class soma {
	public static void main(String[] args) {
		soma soma = new soma();
        soma.lerNumeros();
        soma.exibirSoma();
	}

    int numero1;
    int numero2;

    public void lerNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();
    }

    public void exibirSoma() {
        int resultado = numero1 + numero2;
        System.out.println("A soma dos números é: " + resultado);
    }
}