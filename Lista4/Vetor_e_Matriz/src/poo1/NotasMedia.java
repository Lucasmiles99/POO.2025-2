package poo1;

import java.util.Scanner;

public class NotasMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i]; 
        }

        System.out.println("\nNotas digitadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        double media = soma / notas.length;
        System.out.println("\nMédia das notas = " + media);

        scanner.close();
    }
}