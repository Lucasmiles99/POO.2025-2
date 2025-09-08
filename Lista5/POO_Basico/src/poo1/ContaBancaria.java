package poo1;

public class ContaBancaria {
    int numeroConta;
    String nome;
    double saldo;

    public ContaBancaria(int numeroConta, String nome, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public void incluirConta(int numeroConta, String nome, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public void alterarNome(String novoNome) {
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            this.nome = novoNome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido. Verifique o valor ou saldo insuficiente.");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + nome);
        System.out.println("Saldo: R$ " + saldo);
    }
}