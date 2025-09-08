package poo1;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.50, 500);

        int opcao;
        do {
            System.out.println("\n=== MENU BOMBA DE COMBUSTÍVEL ===");
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litro");
            System.out.println("3 - Alterar valor do litro");
            System.out.println("4 - Alterar tipo de combustível");
            System.out.println("5 - Alterar quantidade de combustível");
            System.out.println("6 - Mostrar status da bomba");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor em R$: ");
                    double valor = sc.nextDouble();
                    bomba.abastecerPorValor(valor);
                    break;
                case 2:
                    System.out.print("Digite a quantidade de litros: ");
                    double litros = sc.nextDouble();
                    bomba.abastecerPorLitro(litros);
                    break;
                case 3:
                    System.out.print("Digite o novo valor do litro: ");
                    double novoValor = sc.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    sc.nextLine(); 
                    System.out.print("Digite o novo tipo de combustível: ");
                    String novoCombustivel = sc.nextLine();
                    bomba.alterarCombustivel(novoCombustivel);
                    break;
                case 5:
                    System.out.print("Digite a nova quantidade de combustível (litros): ");
                    double novaQtd = sc.nextDouble();
                    bomba.alterarQuantidadeCombustivel(novaQtd);
                    break;
                case 6:
                    bomba.mostrarStatus();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}