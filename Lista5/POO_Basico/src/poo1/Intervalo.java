package poo1;

public class Intervalo {
	int inicio;
 	int fim;

 	public Intervalo(int inicio, int fim) {
     	this.inicio = inicio;
     	this.fim = fim;
 	}

 	public void corrigirOrdem() {
     	if (inicio > fim) {
         	System.out.println("Aviso: valores invertidos. O programa fará a correção.");
         	int temp = inicio;
         	inicio = fim;
         	fim = temp;
     	}
 	}

 	public void mostrarIntervalo() {
     	System.out.println("Números no intervalo de " + inicio + " até " + fim + ":");
     	for (int i = inicio; i <= fim; i++) {
         	System.out.print(i + " ");
     	}
     	System.out.println(); 
 	}
}