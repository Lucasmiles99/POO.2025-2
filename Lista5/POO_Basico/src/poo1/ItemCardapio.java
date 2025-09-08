package poo1;

public class ItemCardapio {
	int codigo;
 	String descricao;
 	double preco;

 	public ItemCardapio(int codigo, String descricao, double preco) {
     	this.codigo = codigo;
     	this.descricao = descricao;
     	this.preco = preco;
 	}

 	public int getCodigo() {
     	return codigo;
 	}

 	public String getDescricao() {
     	return descricao;
 	}

 	public double getPreco() {
     	return preco;
 	}

 	public double calcularTotal(int quantidade) {
     	return preco * quantidade;
 	}
}