package poo;

import java.util.Scanner;

public class Celsius {
	public static void main(String[] args) {
		Celsius converter = new Celsius();
        converter.lerTemperaturaFahrenheit();
        converter.exibirTemperaturaCelsius();
	}

	double fahrenheit;

	public void lerTemperaturaFahrenheit() {
	     Scanner scanner = new Scanner(System.in);
	     System.out.print("Digite a temperatura em graus Fahrenheit: ");
	     fahrenheit = scanner.nextDouble();
	}

	public void exibirTemperaturaCelsius() {
	    double celsius = (fahrenheit - 32) / 1.8;
	    System.out.printf("A temperatura em graus Celsius é: %.2f °C\n", celsius);
	}
}