package poo1;

import java.util.Scanner;

public class VetorData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data no formato dd/mm/aaaa: ");
        String entrada = scanner.nextLine();

        String[] partes = entrada.split("/");

        if (partes.length != 3) {
            System.out.println("Data inválida! O formato correto é dd/mm/aaaa.");
            return;
        }

        try {
            int[] data = new int[3];
            data[0] = Integer.parseInt(partes[0]); 
            data[1] = Integer.parseInt(partes[1]); 
            data[2] = Integer.parseInt(partes[2]); 

            if (validarData(data[0], data[1], data[2])) {
                System.out.println("Data válida!");
                System.out.println("Vetor: [Dia: " + data[0] + ", Mês: " + data[1] + ", Ano: " + data[2] + "]");
            } else {
                System.out.println("Data inválida!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Data inválida! Certifique-se de usar apenas números.");
        }

        scanner.close();
    }

    public static boolean validarData(int dia, int mes, int ano) {
        if (ano <= 0 || mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = {31, (éanoBissexto(ano) ? 29 : 28), 31, 30, 31, 30, 
                            31, 31, 30, 31, 30, 31};

        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }

    public static boolean éanoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}