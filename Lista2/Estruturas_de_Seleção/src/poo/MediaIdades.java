package poo;

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro aluno: ");
        int idade1 = scanner.nextInt();

        System.out.print("Digite a idade do segundo aluno: ");
        int idade2 = scanner.nextInt();

        System.out.print("Digite a idade do terceiro aluno: ");
        int idade3 = scanner.nextInt();

        double media = (idade1 + idade2 + idade3) / 3.0;

        if (media < 25) {
            System.out.println("Turma Jovem");
        } else if (media <= 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

        scanner.close();
    }
}