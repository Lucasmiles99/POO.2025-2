package poo1;

import java.util.Scanner;

public class Caixa_Registradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            double total = 0.0;
            int contador = 1;

            System.out.println("\nLojas Tabajara");

            while (true) {
                System.out.printf("Produto %d: R$ ", contador);
                double preco = scanner.nextDouble();

                if (preco == 0) { 
                    break;
                }

                total += preco;
                contador++;
            }

            System.out.printf("Total: R$ %.2f\n", total);

            System.out.print("Dinheiro: R$ ");
            double dinheiro = scanner.nextDouble();

            double troco = dinheiro - total;
            System.out.printf("Troco: R$ %.2f\n", troco);
        }
    }
}