package Pintura_Cubo;

public class Cubo extends FiguraGeometrica {
    private double lado;
    private double rendimento; 
    private int tipoTinta;

    public static final double LITROS_LATA = 18;

    public static final double PRECO_TIPO1 = 101.90;
    public static final double PRECO_TIPO2 = 212.45;
    public static final double PRECO_TIPO3 = 345.56;

    public Cubo(double lado, double rendimento, int tipoTinta) {
        setLado(lado);
        setRendimento(rendimento);
        setTipoTinta(tipoTinta);
    }

    public Cubo(double lado) {
        this(lado, 1.0, 1);
    }

    public Cubo() {
        this(1.0, 1.0, 1);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) throw new IllegalArgumentException("O lado deve ser positivo!");
        this.lado = lado;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        if (rendimento <= 0) throw new IllegalArgumentException("O rendimento deve ser positivo!");
        this.rendimento = rendimento;
    }

    public int getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        if (tipoTinta < 1 || tipoTinta > 3)
            throw new IllegalArgumentException("Tipo de tinta inválido! (1, 2 ou 3)");
        this.tipoTinta = tipoTinta;
    }

    public double calcularAreaBase() {
        return lado * lado;
    }

    @Override
    public double calcularAreaTotal() {
        return 6 * calcularAreaBase();
    }

    public double calcularVolume() {
        return Math.pow(lado, 3);
    }

    public double calcularDiagonal() {
        return lado * Math.sqrt(3);
    }

    public double calcularLitros() {
        return calcularAreaTotal() / rendimento;
    }

    public int calcularLatas() {
        return (int) Math.ceil(calcularLitros() / LITROS_LATA);
    }

    public double calcularPrecoTotal() {
        double preco;
        switch (tipoTinta) {
            case 1: preco = PRECO_TIPO1; break;
            case 2: preco = PRECO_TIPO2; break;
            case 3: preco = PRECO_TIPO3; break;
            default: preco = PRECO_TIPO1;
        }
        return calcularLatas() * preco;
    }

    @Override
    public String toString() {
        return "\na : " + lado +
               "\nRendimento : " + rendimento +
               "\nTipo de Tinta : " + tipoTinta +
               "\n-----------------------------" +
               "\nÁrea da Base : " + calcularAreaBase() +
               "\nÁrea Total : " + calcularAreaTotal() +
               "\nVolume : " + calcularVolume() +
               "\nDiagonal do Cubo : " + calcularDiagonal() +
               "\nLitros de Tinta: " + calcularLitros() +
               "\nLatas de Tinta: " + calcularLatas() +
               "\nValor Total: " + calcularPrecoTotal() + "\n";
    	}
}