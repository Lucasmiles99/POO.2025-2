package poo1;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = sc.nextLine();

		Pessoa pessoa = new Pessoa(nome, sobrenome);

		System.out.println("Seu nome completo é: " + pessoa.getNomeCompleto());

		sc.close();
	}
}