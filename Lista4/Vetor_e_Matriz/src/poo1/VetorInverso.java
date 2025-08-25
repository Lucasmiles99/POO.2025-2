package poo1;

import java.util.Scanner;

public class VetorInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10]; 

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número real " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("\nNúmeros digitados em ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        scanner.close();
    }
}