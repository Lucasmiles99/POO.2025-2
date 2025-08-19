package poo1;

import java.util.Scanner;

public class SerieFracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos (n): ");
        int n = sc.nextInt();

        double soma = 0.0;
        int denominador = 1;

        System.out.print("S = ");
        for (int i = 1; i <= n; i++) {
            soma += (double) i / denominador;
            System.out.print(i + "/" + denominador);
            if (i < n) {
                System.out.print(" + ");
            }
            denominador += 2; 
        }

        System.out.println("\nResultado da soma: " + soma);

        sc.close();
    }
}