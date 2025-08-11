package poo;

import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de morangos (Kg): ");
        double morangoKg = scanner.nextDouble();

        System.out.print("Quantidade de maçãs (Kg): ");
        double macaKg = scanner.nextDouble();

        double precoMorango = (morangoKg <= 5) ? 2.50 : 2.20;
        double precoMaca = (macaKg <= 5) ? 1.80 : 1.50;

        double valorMorango = precoMorango * morangoKg;
        double valorMaca = precoMaca * macaKg;

        double totalKg = morangoKg + macaKg;
        double totalValor = valorMorango + valorMaca;

        if (totalKg > 8 || totalValor > 25.0) {
            totalValor = totalValor * 0.9; 
        }

        System.out.printf("Valor total a pagar: R$ %.2f\n", totalValor);

        scanner.close();
    }
}