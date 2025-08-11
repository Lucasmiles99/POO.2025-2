package poo;

import java.util.Scanner;

public class Peso {
	public static void main(String[] args) {
		Peso pessoa = new Peso();
        pessoa.lerAltura();
        pessoa.calcularPesoIdeal();
	}

    double altura;

    public void lerAltura() {
        Scanner kgs = new Scanner(System.in);
        System.out.print("Digite a sua altura (em metros): ");
        altura = kgs.nextDouble();
    }

    public void calcularPesoIdeal() {
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("O peso ideal para a altura informada é: %.2f kg\n", pesoIdeal);
    }
}