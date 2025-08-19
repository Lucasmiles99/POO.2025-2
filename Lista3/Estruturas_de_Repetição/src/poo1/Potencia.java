package poo1;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        long resultado = 1;

        if (expoente >= 0) {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
            System.out.println(base + " elevado a " + expoente + " = " + resultado);
        } else {
            for (int i = 1; i <= -expoente; i++) {
                resultado *= base;
            }
            System.out.println(base + " elevado a " + expoente + " = 1/" + resultado);
        }

        sc.close();
    }
}