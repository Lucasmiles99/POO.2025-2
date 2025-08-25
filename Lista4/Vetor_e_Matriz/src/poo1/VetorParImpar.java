package poo1;

import java.util.Scanner;
import java.util.ArrayList;

public class VetorParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares.add(numeros[i]);
            } else {
                impares.add(numeros[i]);
            }
        }

        System.out.println("\nVetor completo:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n\nVetor de pares:");
        for (int p : pares) {
            System.out.print(p + " ");
        }

        System.out.println("\n\nVetor de ímpares:");
        for (int im : impares) {
            System.out.print(im + " ");
        }

        scanner.close();
    }
}