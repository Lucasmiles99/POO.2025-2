package poo1;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 10 para ver a tabuada: ");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido! Digite um número entre 1 e 10.");
        } else {
            System.out.println("\nTabuada de " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        sc.close();
    }
}