package Veiculo;

public class Carro extends Veiculo {
    private int portas;

    public Carro(boolean motor, int portas) {
        super(motor);
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Portas: " + portas;
    }
}