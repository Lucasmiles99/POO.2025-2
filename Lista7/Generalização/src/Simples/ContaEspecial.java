package Simples;

public class ContaEspecial extends Conta {
    private int diasSemJuros;
    private double limite;

    public ContaEspecial(String banco, int agencia, int numeroConta, double saldo,
                         int diasSemJuros, double limite) {
        super(banco, agencia, numeroConta, saldo);
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
    }

    @Override
    public boolean saque(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            return super.saque(valor) || true; 
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaEspecial [diasSemJuros=" + diasSemJuros + ", limite=" + limite +
               ", saldo=" + getSaldo() + "]";
    }
}