package poo;

import java.util.Scanner;

public class ValidaData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = scanner.nextLine();

        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Formato inválido! Use dd/mm/aaaa.");
            return;
        }

        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if (mes < 1 || mes > 12) {
            System.out.println("Data inválida! Mês fora do intervalo.");
            return;
        }

        int diasNoMes;
        switch (mes) {
            case 4: case 6: case 9: case 11:
                diasNoMes = 30;
                break;
            case 2:
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }
                break;
            default:
                diasNoMes = 31;
        }

        if (dia < 1 || dia > diasNoMes) {
            System.out.println("Data inválida! Dia fora do intervalo.");
        } else {
            System.out.println("Data válida!");
        }

        scanner.close();
    }
}