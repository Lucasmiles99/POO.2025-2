package poo1;

import java.util.Scanner;

public class NumeroPrimoDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean primo = true;
        String divisores = "";

        if (numero <= 1) {
            primo = false; 
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                    divisores += i + " ";
                }
            }
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
            System.out.println("Ele é divisível por: 1 " + divisores + numero);
        }

        scanner.close();
    }
}