package poo1;

public class Calculadora {
	double num1;
 	double num2;

 	public Calculadora(double num1, double num2) {
     	this.num1 = num1;
     	this.num2 = num2;
 	}

 	public double somar() {
     	return num1 + num2;
 	}

 	public double subtrair() {
     	return num1 - num2;
 	}

 	public double multiplicar() {
     	return num1 * num2;
 	}

 	public double dividir() {
     	if (num2 == 0) {
         	System.out.println("Erro: divisão por zero!");
         	return Double.NaN; 
     	}
     	return num1 / num2;
 	}
}