package poo1;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = sc.nextInt();

        long fatorial = 1; 
        System.out.print(numero + "! = ");

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }

        System.out.println(" = " + fatorial);

        sc.close();
    }
}