package poo1;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);

     	System.out.print("Digite o primeiro número: ");
     	double n1 = sc.nextDouble();

     	System.out.print("Digite o segundo número: ");
     	double n2 = sc.nextDouble();

     	Calculadora calc = new Calculadora(n1, n2);

     	System.out.println("Soma: " + calc.somar());
     	System.out.println("Subtração: " + calc.subtrair());
     	System.out.println("Multiplicação: " + calc.multiplicar());
     	System.out.println("Divisão: " + calc.dividir());

     	sc.close();
 	}
}