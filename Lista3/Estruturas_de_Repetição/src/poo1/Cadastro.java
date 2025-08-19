package poo1;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;

        while (true) {
            System.out.print("Digite o nome de usuário: ");
            usuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("Erro: a senha não pode ser igual ao nome de usuário. Tente novamente.\n");
            } else {
                System.out.println("Cadastro realizado com sucesso!");
                break; 
            }
        }

        sc.close();
    }
}