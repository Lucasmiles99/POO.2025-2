package poo1;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        sc.close();
    }
}