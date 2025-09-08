package poo1;

public class BombaCombustivel {
    String tipoCombustivel;
    double valorLitro;
    double quantidadeCombustivel; 

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.printf("Abastecido: %.2f litros. Valor pago: R$ %.2f%n", litros, valor);
        } else {
            System.out.println("Não há combustível suficiente na bomba!");
        }
    }

    public void abastecerPorLitro(double litros) {
        double valor = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.printf("Abastecido: %.2f litros. Valor pago: R$ %.2f%n", litros, valor);
        } else {
            System.out.println("Não há combustível suficiente na bomba!");
        }
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
        System.out.println("Novo valor por litro: R$ " + novoValor);
    }

    public void alterarCombustivel(String novoCombustivel) {
        this.tipoCombustivel = novoCombustivel;
        System.out.println("Novo tipo de combustível: " + novoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
        System.out.println("Quantidade de combustível na bomba alterada para: " + novaQuantidade + " litros");
    }

    public void mostrarStatus() {
        System.out.println("\n=== STATUS DA BOMBA ===");
        System.out.println("Combustível: " + tipoCombustivel);
        System.out.println("Valor por litro: R$ " + valorLitro);
        System.out.println("Quantidade disponível: " + quantidadeCombustivel + " litros\n");
    }
}