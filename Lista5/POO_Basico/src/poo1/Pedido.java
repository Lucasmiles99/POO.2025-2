package poo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pedido {
    Map<Integer, ItemCardapio> cardapio;
    double totalGeral;

    public Pedido() {
        cardapio = new HashMap<>();
        totalGeral = 0;

        cardapio.put(100, new ItemCardapio(100, "Cachorro Quente", 1.20));
        cardapio.put(101, new ItemCardapio(101, "Bauru Simples", 1.30));
        cardapio.put(102, new ItemCardapio(102, "Bauru com ovo", 1.50));
        cardapio.put(103, new ItemCardapio(103, "Hambúrguer", 1.20));
        cardapio.put(104, new ItemCardapio(104, "Cheeseburguer", 1.30));
        cardapio.put(105, new ItemCardapio(105, "Refrigerante", 1.00));
    }

    public void mostrarCardapio() {
        System.out.println("===== CARDÁPIO =====");
        for (ItemCardapio item : cardapio.values()) {
            System.out.printf("%d - %s (R$ %.2f)%n", 
                item.getCodigo(), item.getDescricao(), item.getPreco());
        }
        System.out.println("Digite 0 para encerrar o pedido.");
        System.out.println("====================");
    }

    public void realizarPedido() {
        Scanner sc = new Scanner(System.in);
        mostrarCardapio();

        while (true) {
            System.out.print("\nDigite o código do item: ");
            int codigo = sc.nextInt();

            if (codigo == 0) {
                break;
            }

            if (!cardapio.containsKey(codigo)) {
                System.out.println("Código inválido. Tente novamente.");
                continue;
            }

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            ItemCardapio item = cardapio.get(codigo);
            double subtotal = item.calcularTotal(quantidade);

            System.out.printf("%s x%d = R$ %.2f%n", 
                item.getDescricao(), quantidade, subtotal);

            totalGeral += subtotal;
        }

        System.out.println("\n===== RESUMO DO PEDIDO =====");
        System.out.printf("Total Geral: R$ %.2f%n", totalGeral);

        sc.close();
    }
}