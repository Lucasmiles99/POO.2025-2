package poo;

import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		MediaNotas mediaNotas = new MediaNotas();
        mediaNotas.lerNotas();
        mediaNotas.exibirMedia();
	}

    double nota1;
    double nota2;
    double nota3;
    double nota4;

    public void lerNotas() {
        Scanner nt = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        nota1 = nt.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = nt.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = nt.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = nt.nextDouble();
    }

    public void exibirMedia() {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é: " + media);
    }
}