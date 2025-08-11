package poo;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o turno em que você estuda (M- Matutino, V- Vespertino, N- Noturno): ");
        char turno = scanner.nextLine().toUpperCase().charAt(0);

        switch (turno) {
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Turno inválido!");
        }

        scanner.close();
    }
}