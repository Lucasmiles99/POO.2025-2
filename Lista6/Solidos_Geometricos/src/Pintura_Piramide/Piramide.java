package Pintura_Piramide;

public class Piramide {
    private double ab;  
    private double h;   
    private int tipoTinta;

    public static final double RENDIMENTO = 4.76; 
    public static final double LITROS_LATA = 18;

    public static final double PRECO_TIPO1 = 127.90;
    public static final double PRECO_TIPO2 = 258.98;
    public static final double PRECO_TIPO3 = 344.34;

    public Piramide(double ab, double h, int tipoTinta) {
        setAb(ab);
        setH(h);
        setTipoTinta(tipoTinta);
    }

    public Piramide() {
        this(1.0, 1.0, 1);
    }

    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        if (ab <= 0) throw new IllegalArgumentException("O lado da base deve ser positivo!");
        this.ab = ab;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h <= 0) throw new IllegalArgumentException("A altura deve ser positiva!");
        this.h = h;
    }

    public int getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        if (tipoTinta < 1 || tipoTinta > 3)
            throw new IllegalArgumentException("Tipo de tinta inválido (1, 2 ou 3)!");
        this.tipoTinta = tipoTinta;
    }

    public double calcularA1() {
        return Math.sqrt(Math.pow(h, 2) + Math.pow(ab / 2, 2));
    }

    public double calcularAreaBase() {
        return ab * ab;
    }

    public double calcularAreaTriangulo() {
        return (ab * calcularA1()) / 2;
    }

    public double calcularAreaTotal() {
        return calcularAreaBase() + 4 * calcularAreaTriangulo();
    }

    public double calcularVolume() {
        return (calcularAreaBase() * h) / 3.0;
    }

    public double calcularLitros() {
        return calcularAreaTotal() / RENDIMENTO;
    }

    public int calcularLatas() {
        return (int) Math.ceil(calcularLitros() / LITROS_LATA);
    }

    public double calcularPreco() {
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
        return "\nab: " + ab +
               "\nh: " + h +
               "\na1: " + calcularA1() +
               "\nÁrea Triângulo: " + calcularAreaTriangulo() +
               "\nÁrea Base: " + calcularAreaBase() +
               "\nÁrea Total: " + calcularAreaTotal() +
               "\nTipo de Tinta: " + tipoTinta +
               "\nLitros: " + calcularLitros() +
               "\nLatas: " + calcularLatas() +
               "\nPreço: " + calcularPreco() +
               "\nVolume: " + calcularVolume() + "\n";
    }
}