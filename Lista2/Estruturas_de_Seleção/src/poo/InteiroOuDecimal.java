package poo;

import java.util.Scanner;

public class InteiroOuDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero == Math.floor(numero)) {
            System.out.println("O número " + numero + " é INTEIRO.");
        } else {
            System.out.println("O número " + numero + " é DECIMAL.");
        }

        scanner.close();
    }
}