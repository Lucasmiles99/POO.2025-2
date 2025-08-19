package poo1;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        while (true) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = sc.nextInt();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota válida: " + nota);
                break; 
            } else {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

        sc.close();
    }
}