package poo1;

import java.util.Scanner;

public class VetorPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite várias palavras separadas por ';': ");
        String entrada = scanner.nextLine();

        String[] palavras = entrada.split(";");

        System.out.println("\nPalavras no vetor:");
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Posição " + i + ": " + palavras[i]);
        }

        scanner.close();
    }
}