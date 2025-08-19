package poo1;

import java.util.Scanner;

public class Estado_Civil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        do {
            System.out.print("Digite seu nome (mais de 3 caracteres): ");
            nome = sc.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Erro: o nome deve ter mais de 3 caracteres.");
            }
        } while (nome.length() <= 3);

        int idade;
        do {
            System.out.print("Digite sua idade (0 a 150): ");
            idade = sc.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Erro: idade inválida.");
            }
        } while (idade < 0 || idade > 150);

        double salario;
        do {
            System.out.print("Digite seu salário (maior que 0): ");
            salario = sc.nextDouble();
            if (salario <= 0) {
                System.out.println("Erro: salário deve ser maior que zero.");
            }
        } while (salario <= 0);

        sc.nextLine(); 

        char sexo;
        do {
            System.out.print("Digite seu sexo ('f' para feminino, 'm' para masculino): ");
            sexo = sc.nextLine().toLowerCase().charAt(0);
            if (sexo != 'f' && sexo != 'm') {
                System.out.println("Erro: sexo inválido.");
            }
        } while (sexo != 'f' && sexo != 'm');

        char estadoCivil;
        do {
            System.out.print("Digite seu estado civil ('s' = solteiro, 'c' = casado, 'v' = viúvo, 'd' = divorciado): ");
            estadoCivil = sc.nextLine().toLowerCase().charAt(0);
            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("Erro: estado civil inválido.");
            }
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("\n--- Dados Validados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        
        String estado = switch (estadoCivil) {
            case 's' -> "Solteiro";
            case 'c' -> "Casado";
            case 'v' -> "Viúvo";
            case 'd' -> "Divorciado";
            default -> "Desconhecido";
        };
        System.out.println("Estado Civil: " + estado);

        sc.close();
    }
}