package Simples;

public class ContaSimples extends Conta {
    private double saldoPoupanca;

    public ContaSimples(String banco, int agencia, int numeroConta, double saldo) {
        super(banco, agencia, numeroConta, saldo);
        this.saldoPoupanca = 0.0;
    }

    public boolean depositoPoupanca(double valor) {
        if (valor > 0) {
            saldoPoupanca += valor;
            return true;
        }
        return false;
    }

    public boolean saquePoupanca(double valor) {
        if (valor > 0 && saldoPoupanca >= valor) {
            saldoPoupanca -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaSimples [saldoPoupanca=" + saldoPoupanca + ", saldo=" + getSaldo() + "]";
    }
}