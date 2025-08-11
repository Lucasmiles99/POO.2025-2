package poo;

import java.util.Scanner;

public class ParImparInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            numero += 1; 
            System.out.println("O número era par. Agora é ímpar: " + numero);
        } else {
            numero -= 1; 
            System.out.println("O número era ímpar. Agora é par: " + numero);
        }

        scanner.close();
    }
}