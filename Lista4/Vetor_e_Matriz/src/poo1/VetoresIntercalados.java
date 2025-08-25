package poo1;

import java.util.Scanner;

public class VetoresIntercalados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os 10 elementos do vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = scanner.nextInt();
        }

        int pos = 0;
        for (int i = 0; i < 10; i++) {
            vetorC[pos++] = vetorA[i];
            vetorC[pos++] = vetorB[i];
        }

        System.out.println("\n=== Vetor C (intercalado) ===");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorC[i] + " ");
        }

        scanner.close();
    }
}