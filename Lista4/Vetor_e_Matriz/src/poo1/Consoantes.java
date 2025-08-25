package poo1;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] letras = new char[10];
        int qtdConsoantes = 0;

        for (int i = 0; i < letras.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º caractere: ");
            letras[i] = scanner.next().toLowerCase().charAt(0); 

            if (Character.isLetter(letras[i]) && !"aeiou".contains(String.valueOf(letras[i]))) {
                qtdConsoantes++;
            }
        }

        System.out.println("\nConsoantes digitadas:");
        for (char c : letras) {
            if (Character.isLetter(c) && !"aeiou".contains(String.valueOf(c))) {
                System.out.print(c + " ");
            }
        }

        System.out.println("\n\nQuantidade de consoantes: " + qtdConsoantes);

        scanner.close();
    }
}