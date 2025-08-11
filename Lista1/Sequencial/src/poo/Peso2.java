package poo;

import java.util.Scanner;

public class Peso2 {
	public static void main(String[] args) {
		Peso2 pessoa = new Peso2();
        pessoa.lerDados();
        pessoa.calcularEPesoIdeal();
	}

    double altura;
    char sexo; 

    public void lerDados() {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a sua altura (em metros): ");
        altura = s.nextDouble();

        System.out.print("Digite o seu sexo (M para masculino, F para feminino): ");
        sexo = s.next().toUpperCase().charAt(0);
    }

    public void calcularEPesoIdeal() {
        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso ideal para homem: %.2f kg\n", pesoIdeal);
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal para mulher: %.2f kg\n", pesoIdeal);
        } else {
            System.out.println("Sexo inválido. Use M para masculino ou F para feminino.");
        }
    }
}