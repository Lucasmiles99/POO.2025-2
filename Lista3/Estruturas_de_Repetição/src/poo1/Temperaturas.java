package poo1;

import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        System.out.println("Digite as temperaturas (digite 999 para encerrar):");

        while (true) {
            double temp = scanner.nextDouble();

            if (temp == 999) { 
                break;
            }

            soma += temp;
            quantidade++;

            if (temp < menor) {
                menor = temp;
            }

            if (temp > maior) {
                maior = temp;
            }
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("Menor temperatura: " + menor);
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Média das temperaturas: " + media);
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }
    }
}