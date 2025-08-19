package poo1;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();

        int totalDivisoes = 0; 

        System.out.println("Números primos entre 1 e " + N + ":");

        for (int numero = 2; numero <= N; numero++) {
            boolean primo = true;

            for (int i = 2; i <= numero / 2; i++) {
                totalDivisoes++; 
                if (numero % i == 0) {
                    primo = false;
                    break; 
                }
            }

            if (primo) {
                System.out.print(numero + " ");
            }
        }

        System.out.println("\n\nTotal de divisões executadas: " + totalDivisoes);

        scanner.close();
    }
}