package poo1;

import java.util.Scanner;

public class Soma_Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.println("\nNúmeros no intervalo entre " + num1 + " e " + num2 + ":");

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        int soma = 0;

        for (int i = inicio + 1; i < fim; i++) {
            System.out.println(i);
            soma += i; 
        }

        System.out.println("\nSoma dos números no intervalo: " + soma);

        sc.close();
    }
}