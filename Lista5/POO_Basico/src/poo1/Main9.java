package poo1;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Televisor tv = new Televisor(5, 10);
        int opcao;

        do {
            System.out.println("\n=== MENU TELEVISOR ===");
            System.out.println("1 - Alterar canal");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("4 - Mostrar status");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o novo canal (1-100): ");
                    int canal = sc.nextInt();
                    tv.setCanal(canal);
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 4:
                    tv.mostrarStatus();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}