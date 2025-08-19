package poo1;

public class Precos {
    public static void main(String[] args) {
        double precoUnitario = 1.99;

        System.out.println("Lojas Quase Dois - Tabela de preços\n");

        for (int i = 1; i <= 50; i++) {
            double valor = i * precoUnitario;
            System.out.printf("%2d - R$ %.2f\n", i, valor);
        }
    }
}