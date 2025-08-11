package poo;

import java.util.Scanner;

public class VerificaVogal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scanner.nextLine().toLowerCase(); 

        if (letra.length() == 1 && "aeiou".contains(letra)) {
            System.out.println("A letra '" + letra + "' é uma vogal.");
        } else {
            System.out.println("A letra '" + letra + "' não é uma vogal.");
        }

        scanner.close();
    }
}