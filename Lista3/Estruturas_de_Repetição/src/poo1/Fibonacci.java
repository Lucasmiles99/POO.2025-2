package poo1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos da série de Fibonacci: ");
        int n = sc.nextInt();

        int primeiro = 1, segundo = 1;

        System.out.print("Série de Fibonacci até o " + n + "º termo: ");

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1 ");
            } else {
                int proximo = primeiro + segundo;
                System.out.print(proximo + " ");
                primeiro = segundo;
                segundo = proximo;
            }
        }

        sc.close();
    }
}