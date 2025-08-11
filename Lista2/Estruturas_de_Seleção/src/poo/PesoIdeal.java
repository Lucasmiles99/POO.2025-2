package poo;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite seu sexo (M para masculino, F para feminino): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        double pesoIdeal = 0;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Digite apenas M ou F.");
            sc.close();
            return;
        }

        System.out.println("\n==== RESULTADO ====");
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.printf("Peso: %.2f kg%n", peso);
        System.out.println("Sexo: " + (sexo == 'M' ? "Masculino" : "Feminino"));
        System.out.printf("Peso Ideal: %.2f kg%n", pesoIdeal);

        if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } else if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal.");
        }

        sc.close();
    }
}