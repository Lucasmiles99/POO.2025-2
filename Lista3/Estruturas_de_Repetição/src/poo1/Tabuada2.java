package poo1;

import java.util.Scanner;

public class Tabuada2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int numero = scanner.nextInt();

        System.out.print("Começar por: ");
        int inicio = scanner.nextInt();

        System.out.print("Terminar em: ");
        int fim = scanner.nextInt();

        if (fim < inicio) {
            System.out.println("Erro: o valor final não pode ser menor que o inicial.");
        } else {
            System.out.println("Montarei a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");

            for (int i = inicio; i <= fim; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        scanner.close();
    }
}