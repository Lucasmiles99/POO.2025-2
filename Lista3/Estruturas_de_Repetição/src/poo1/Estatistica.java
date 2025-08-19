package poo1;

import java.util.Scanner;

public class Estatistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoCidade, numVeiculos, numAcidentes;

        int codMaiorAcidente = 0, codMenorAcidente = 0;
        int maiorAcidente = Integer.MIN_VALUE, menorAcidente = Integer.MAX_VALUE;

        int somaVeiculos = 0;
        int somaAcidentesMenos2000 = 0, cidadesMenos2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nCidade " + i + ":");
            System.out.print("Digite o código da cidade: ");
            codigoCidade = sc.nextInt();

            System.out.print("Digite o número de veículos de passeio (1999): ");
            numVeiculos = sc.nextInt();

            System.out.print("Digite o número de acidentes com vítimas (1999): ");
            numAcidentes = sc.nextInt();

            if (numAcidentes > maiorAcidente) {
                maiorAcidente = numAcidentes;
                codMaiorAcidente = codigoCidade;
            }

            if (numAcidentes < menorAcidente) {
                menorAcidente = numAcidentes;
                codMenorAcidente = codigoCidade;
            }

            somaVeiculos += numVeiculos;

            if (numVeiculos < 2000) {
                somaAcidentesMenos2000 += numAcidentes;
                cidadesMenos2000++;
            }
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Cidade com maior índice de acidentes: Código " + codMaiorAcidente + " - " + maiorAcidente + " acidentes");
        System.out.println("Cidade com menor índice de acidentes: Código " + codMenorAcidente + " - " + menorAcidente + " acidentes");
        System.out.println("Média de veículos nas 5 cidades: " + (somaVeiculos / 5.0));

        if (cidadesMenos2000 > 0) {
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + 
                               (somaAcidentesMenos2000 / (double) cidadesMenos2000));
        } else {
            System.out.println("Nenhuma cidade com menos de 2000 veículos.");
        }

        sc.close();
    }
}