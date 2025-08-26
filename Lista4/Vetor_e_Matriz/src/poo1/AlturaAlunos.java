package poo1;

import java.util.Scanner;

public class AlturaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[30];
        double[] alturas = new double[30];
        double somaAlturas = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();

            System.out.print("Digite a altura do aluno " + (i + 1) + " (em metros, ex: 1.65): ");
            alturas[i] = scanner.nextDouble();

            somaAlturas += alturas[i];
        }

        double mediaAltura = somaAlturas / 30.0;

        int contador = 0;
        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }

        System.out.println("\nA média das alturas é: " + mediaAltura);
        System.out.println("Quantidade de alunos com mais de 13 anos e altura inferior à média: " + contador);

        scanner.close();
    }
}