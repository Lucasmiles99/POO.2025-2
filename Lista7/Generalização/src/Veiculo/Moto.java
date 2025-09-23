package Veiculo;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(boolean motor, int cilindradas) {
        super(motor);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindradas: " + cilindradas;
    }
}