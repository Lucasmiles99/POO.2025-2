package Simples;

public class Conta {
    private String banco;
    private int agencia;
    private int numeroConta;
    private double saldo;

    public Conta(String banco, int agencia, int numeroConta, double saldo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta [banco=" + banco + ", agencia=" + agencia +
               ", numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
    }
}