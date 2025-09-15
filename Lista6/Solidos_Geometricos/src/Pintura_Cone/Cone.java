package Pintura_Cone;

public class Cone extends FiguraGeometrica {
	private double raio;
	private double altura;
	private double geratriz;
	private int nivelTinta;

	public static final double PI = 3.14;
	public static final double RENDIMENTO = 3.45; 
	public static final double LITROS_LATA = 18;

	public static final double PRECO_TIPO1 = 238.90;
	public static final double PRECO_TIPO2 = 467.98;
	public static final double PRECO_TIPO3 = 758.34;

	public Cone(double raio, double altura, int nivelTinta) {
		this.raio = raio;
		this.altura = altura;
		this.nivelTinta = nivelTinta;
		this.geratriz = calcularGeratriz();
	}

	public Cone(double raio, double altura) {
		this(raio, altura, 1); 
	}

	public Cone() {
		this(1, 1, 1); 
	}

	public double getRaio() { return raio; }
	public void setRaio(double raio) { this.raio = raio; }

	public double getAltura() { return altura; }
	public void setAltura(double altura) { this.altura = altura; }

	public double getGeratriz() { return geratriz; }

	public int getNivelTinta() { return nivelTinta; }
	public void setNivelTinta(int nivelTinta) { this.nivelTinta = nivelTinta; }

	private double calcularGeratriz() {
		return Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
	}

	private double calcularAreaFundo() {
		return PI * Math.pow(raio, 2);
	}

	private double calcularAreaLateral() {
		return PI * raio * geratriz;
	}

	@Override
	public double calcularAreaTotal() {
		return calcularAreaFundo() + calcularAreaLateral();
	}

	private double calcularLitros() {
		return calcularAreaTotal() * RENDIMENTO;
	}

	private int calcularLatas() {
		return (int) Math.ceil(calcularLitros() / LITROS_LATA);
	}

	private double calcularPreco() {
		double preco;
		switch (nivelTinta) {
			case 1: preco = PRECO_TIPO1; break;
			case 2: preco = PRECO_TIPO2; break;
			case 3: preco = PRECO_TIPO3; break;
			default: preco = PRECO_TIPO1; break;
		}
		return calcularLatas() * preco;
	}

	@Override
	public String toString() {
		return "\n--- Cone ---" +
				"\nRaio: " + raio +
				"\nAltura: " + altura +
				"\nNível: " + nivelTinta +
				"\n-----------------------" +
				"\nGeratriz: " + geratriz +
				"\n-----------------------" +
				"\nÁrea do Fundo: " + calcularAreaFundo() +
				"\nÁrea Lateral: " + calcularAreaLateral() +
				"\nÁrea Total: " + calcularAreaTotal() +
				"\n-----------------------" +
				"\nLitros: " + calcularLitros() +
				"\nLatas: " + calcularLatas() +
				"\n-----------------------" +
				"\nPreço Total: " + calcularPreco() + "\n";
 		}
}