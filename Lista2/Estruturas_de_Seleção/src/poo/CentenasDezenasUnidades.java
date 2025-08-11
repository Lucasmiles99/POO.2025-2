package poo;

import java.util.Scanner;

public class CentenasDezenasUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero >= 1000) {
            System.out.println("Número inválido! Digite um número entre 0 e 999.");
            return;
        }

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;

        String resultado = "";

        if (centenas > 0) {
            resultado += centenas + (centenas == 1 ? " centena" : " centenas");
        }
        if (dezenas > 0) {
            if (!resultado.isEmpty()) resultado += ", ";
            resultado += dezenas + (dezenas == 1 ? " dezena" : " dezenas");
        }
        if (unidades > 0) {
            if (!resultado.isEmpty()) resultado += " e ";
            resultado += unidades + (unidades == 1 ? " unidade" : " unidades");
        }

        System.out.println(numero + " = " + resultado);

        scanner.close();
    }
}