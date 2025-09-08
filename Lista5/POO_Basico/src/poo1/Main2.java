package poo1;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);

     	System.out.print("Digite o primeiro número: ");
     	int num1 = sc.nextInt();

     	System.out.print("Digite o segundo número: ");
     	int num2 = sc.nextInt();

     	Intervalo intervalo = new Intervalo(num1, num2);

     	intervalo.corrigirOrdem();

     	intervalo.mostrarIntervalo();

     	sc.close();
 	}
}