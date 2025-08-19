package poo1;

import java.util.Scanner;

public class Numeros3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intervalo1 = 0; 
        int intervalo2 = 0; 
        int intervalo3 = 0; 
        int intervalo4 = 0; 

        while (true) {
            System.out.print("Digite um número positivo (ou negativo para encerrar): ");
            int numero = sc.nextInt();

            if (numero < 0) {
                break; 
            }

            if (numero >= 0 && numero <= 25) {
                intervalo1++;
            } else if (numero >= 26 && numero <= 50) {
                intervalo2++;
            } else if (numero >= 51 && numero <= 75) {
                intervalo3++;
            } else if (numero >= 76 && numero <= 100) {
                intervalo4++;
            }
        }

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Números no intervalo [0-25]: " + intervalo1);
        System.out.println("Números no intervalo [26-50]: " + intervalo2);
        System.out.println("Números no intervalo [51-75]: " + intervalo3);
        System.out.println("Números no intervalo [76-100]: " + intervalo4);

        sc.close();
    }
}