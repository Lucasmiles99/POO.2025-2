package poo1;

public class FolhaPagamento {
	double valorHora;
 	double horasTrabalhadas;

 	public FolhaPagamento(double valorHora, double horasTrabalhadas) {
     	this.valorHora = valorHora;
     	this.horasTrabalhadas = horasTrabalhadas;
 	}

 	public double getSalarioBruto() {
     	return valorHora * horasTrabalhadas;
 	}

 	public double getIR() {
     	return getSalarioBruto() * 0.11;
 	}

 	public double getINSS() {
     	return getSalarioBruto() * 0.08;
 	}

 	public double getSindicato() {
     	return getSalarioBruto() * 0.05;
 	}

 	public double getTotalDescontos() {
     	return getIR() + getINSS() + getSindicato();
 	}

 	public double getSalarioLiquido() {
     	return getSalarioBruto() - getTotalDescontos();
 	}
}