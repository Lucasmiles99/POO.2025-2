package poo1;

import java.util.Scanner;

public class Conjunto_Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números (N): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            return;
        }

        int menor, maior, soma;

        System.out.print("Digite o 1º número: ");
        int num = scanner.nextInt();
        menor = maior = soma = num;

        for (int i = 2; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = scanner.nextInt();

            soma += num;

            if (num < menor) {
                menor = num;
            }

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("\nMenor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

        scanner.close();
    }
}