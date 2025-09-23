package Veiculo;

public class Veiculo {
    protected boolean motor;

    public Veiculo(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Possui motor: " + motor;
    }
}