package Veiculo;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(boolean motor, int eixos) {
        super(motor);
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Eixos: " + eixos;
    }
}