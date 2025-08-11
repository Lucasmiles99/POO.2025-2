package poo;

import java.util.Scanner;

public class LojaTintas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da área a ser pintada (m²): ");
        double area = sc.nextDouble();

        double litrosNecessarios = area / 6;

        int litrosPorLata = 18;
        int litrosPorGalao = 4; 
        double precoLata = 80.0;
        double precoGalao = 25.0;

        int qtdLatas = (int) Math.ceil(litrosNecessarios / litrosPorLata);
        double custoLatas = qtdLatas * precoLata;

        int qtdGaloes = (int) Math.ceil(litrosNecessarios / 3.6);
        double custoGaloes = qtdGaloes * precoGalao;

        System.out.println("\nSituação 1 - Apenas latas de 18 litros:");
        System.out.println("Quantidade de latas: " + qtdLatas);
        System.out.printf("Preço total: R$ %.2f\n", custoLatas);

        System.out.println("\nSituação 2 - Apenas galões de 3,6 litros:");
        System.out.println("Quantidade de galões: " + qtdGaloes);
        System.out.printf("Preço total: R$ %.2f\n", custoGaloes);

        sc.close();
    }
}