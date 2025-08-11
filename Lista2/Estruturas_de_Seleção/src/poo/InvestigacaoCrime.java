package poo;

import java.util.Scanner;

public class InvestigacaoCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respostasSim = 0;

        String[] perguntas = {
            "Telefonou para a vítima? (sim/nao)",
            "Esteve no local do crime? (sim/nao)",
            "Mora perto da vítima? (sim/nao)",
            "Devia para a vítima? (sim/nao)",
            "Já trabalhou com a vítima? (sim/nao)"
        };

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " ");
            String resposta = scanner.nextLine().trim().toLowerCase();

            if (resposta.equals("sim")) {
                respostasSim++;
            }
        }

        if (respostasSim == 5) {
            System.out.println("Classificação: Assassino");
        } else if (respostasSim >= 3) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostasSim == 2) {
            System.out.println("Classificação: Suspeita");
        } else {
            System.out.println("Classificação: Inocente");
        }

        scanner.close();
    }
}