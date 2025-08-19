package poo1;

import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = 0, totalGeral = 0;
        int codigo, quantidade;

        System.out.println("=== CARDÁPIO ===");
        System.out.println("100 - Cachorro Quente   R$ 1,20");
        System.out.println("101 - Bauru Simples     R$ 1,30");
        System.out.println("102 - Bauru com ovo     R$ 1,50");
        System.out.println("103 - Hambúrguer        R$ 1,20");
        System.out.println("104 - Cheeseburguer     R$ 1,30");
        System.out.println("105 - Refrigerante      R$ 1,00");
        System.out.println("Digite 0 para encerrar o pedido.");
        System.out.println("==========================\n");

        while (true) {
            System.out.print("Digite o código do produto (0 para encerrar): ");
            codigo = sc.nextInt();

            if (codigo == 0) {
                break; 
            }

            System.out.print("Digite a quantidade: ");
            quantidade = sc.nextInt();

            switch (codigo) {
                case 100: preco = 1.20; break;
                case 101: preco = 1.30; break;
                case 102: preco = 1.50; break;
                case 103: preco = 1.20; break;
                case 104: preco = 1.30; break;
                case 105: preco = 1.00; break;
                default:
                    System.out.println("⚠ Código inválido, tente novamente!");
                    continue;
            }

            double totalItem = preco * quantidade;
            totalGeral += totalItem;

            System.out.printf("Item %d | Quantidade: %d | Total: R$ %.2f\n\n", codigo, quantidade, totalItem);
        }

        System.out.println("==========================");
        System.out.printf("TOTAL DO PEDIDO: R$ %.2f\n", totalGeral);

        sc.close();
    }
}