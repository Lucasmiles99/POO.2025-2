package poo1;

import java.util.Scanner;

public class Numeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.println("\nNúmeros no intervalo entre " + num1 + " e " + num2 + ":");

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        for (int i = inicio + 1; i < fim; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}