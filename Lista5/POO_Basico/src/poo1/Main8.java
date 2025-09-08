package poo1;

public class Main8 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, "Lucas", 500.0);

        conta1.exibirDados();

        conta1.alterarNome("Joao");

        conta1.depositar(200);

        conta1.sacar(100);

        System.out.println("\nApós operações:");
        conta1.exibirDados();
    }
}