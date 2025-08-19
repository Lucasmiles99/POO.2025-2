package poo1;

import java.util.Scanner;

public class Academia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        double altura, peso;

        int codMaisAlto = 0, codMaisBaixo = 0, codMaisGordo = 0, codMaisMagro = 0;
        double maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE;
        double maiorPeso = Double.MIN_VALUE, menorPeso = Double.MAX_VALUE;

        double somaAlturas = 0, somaPesos = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite o código do cliente (0 para encerrar): ");
            codigo = sc.nextInt();

            if (codigo == 0) {
                break; 
            }

            System.out.print("Digite a altura do cliente (em metros): ");
            altura = sc.nextDouble();

            System.out.print("Digite o peso do cliente (em kg): ");
            peso = sc.nextDouble();

            somaAlturas += altura;
            somaPesos += peso;
            contador++;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                codMaisAlto = codigo;
            }
            
            if (altura < menorAltura) {
                menorAltura = altura;
                codMaisBaixo = codigo;
            }

            if (peso > maiorPeso) {
                maiorPeso = peso;
                codMaisGordo = codigo;
            }
            
            if (peso < menorPeso) {
                menorPeso = peso;
                codMaisMagro = codigo;
            }
        }

        if (contador > 0) {
            System.out.println("\n=== RESULTADOS DO SENSO ===");
            System.out.println("Cliente mais alto: Código " + codMaisAlto + " - Altura: " + maiorAltura + " m");
            System.out.println("Cliente mais baixo: Código " + codMaisBaixo + " - Altura: " + menorAltura + " m");
            System.out.println("Cliente mais gordo: Código " + codMaisGordo + " - Peso: " + maiorPeso + " kg");
            System.out.println("Cliente mais magro: Código " + codMaisMagro + " - Peso: " + menorPeso + " kg");
            System.out.println("Média das alturas: " + (somaAlturas / contador) + " m");
            System.out.println("Média dos pesos: " + (somaPesos / contador) + " kg");
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }

        sc.close();
    }
}