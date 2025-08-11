package poo;

import java.util.Scanner;

public class CalculoscomNumeros {
	public static void main(String[] args) {
		CalculoscomNumeros calc = new CalculoscomNumeros();
        calc.lerNumeros();
        calc.calcularEExibirResultados();
	}

    int inteiro1;
    int inteiro2;
    double real;

    public void lerNumeros() {
        Scanner N = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        inteiro1 = N.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        inteiro2 = N.nextInt();

        System.out.print("Digite um número real: ");
        real = N.nextDouble();
    }

    public void calcularEExibirResultados() {
        double resultadoA = (2 * inteiro1) * (inteiro2 / 2.0);
        double resultadoB = (3 * inteiro1) + real;
        double resultadoC = Math.pow(real, 3);

        System.out.printf("a. O produto do dobro do primeiro com metade do segundo: %.2f\n", resultadoA);
        System.out.printf("b. A soma do triplo do primeiro com o terceiro: %.2f\n", resultadoB);
        System.out.printf("c. O terceiro elevado ao cubo: %.2f\n", resultadoC);
    }
}