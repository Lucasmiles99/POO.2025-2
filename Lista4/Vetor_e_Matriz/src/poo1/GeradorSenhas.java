package poo1;

import java.util.Random;
import java.util.Scanner;

public class GeradorSenhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String vogais = "aeiou";
        String consoantes = "bcdfghjklmnpqrstvwxyz";

        System.out.print("Digite o tamanho da senha desejada (menor que 26): ");
        int tamanho = scanner.nextInt();

        if (tamanho >= alfabeto.length || tamanho <= 0) {
            System.out.println("Tamanho inválido! Deve ser entre 1 e 25.");
            return;
        }

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
                senha.append(consoantes.charAt(random.nextInt(consoantes.length())));
            } else {
                senha.append(vogais.charAt(random.nextInt(vogais.length())));
            }
        }

        if (tamanho % 2 != 0) {
            senha.setCharAt(tamanho - 1, consoantes.charAt(random.nextInt(consoantes.length())));
        }

        System.out.println("Senha gerada: " + senha.toString());

        scanner.close();
    }
}