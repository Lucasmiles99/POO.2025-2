package poo;

import java.util.Scanner;

public class PromocaoCarnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipos de carne disponíveis:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Digite o número correspondente ao tipo de carne: ");
        int tipoCarne = scanner.nextInt();

        System.out.print("Digite a quantidade de carne (Kg): ");
        double quantidade = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Pagamento com cartão Tabajara? (sim/nao): ");
        String pagamento = scanner.nextLine().trim().toLowerCase();

        double precoPorKg = 0;
        String nomeCarne = "";

        switch (tipoCarne) {
            case 1:
                nomeCarne = "Filé Duplo";
                precoPorKg = (quantidade <= 5) ? 4.90 : 5.80;
                break;
            case 2:
                nomeCarne = "Alcatra";
                precoPorKg = (quantidade <= 5) ? 5.90 : 6.80;
                break;
            case 3:
                nomeCarne = "Picanha";
                precoPorKg = (quantidade <= 5) ? 6.90 : 7.80;
                break;
            default:
                System.out.println("Tipo de carne inválido!");
                scanner.close();
                return;
        }

        double precoTotal = precoPorKg * quantidade;
        double desconto = 0;

        if (pagamento.equals("sim")) {
            desconto = precoTotal * 0.05; 
        }

        double valorAPagar = precoTotal - desconto;

        System.out.println("\n--- CUPOM FISCAL ---");
        System.out.printf("Tipo de carne: %s\n", nomeCarne);
        System.out.printf("Quantidade: %.2f Kg\n", quantidade);
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
        System.out.printf("Tipo de pagamento: %s\n", pagamento.equals("sim") ? "Cartão Tabajara" : "Outro");
        System.out.printf("Valor do desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f\n", valorAPagar);

        scanner.close();
    }
}