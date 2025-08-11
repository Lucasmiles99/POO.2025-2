package poo;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o lado 3: ");
        double lado3 = scanner.nextDouble();

        boolean formaTriangulo = (lado1 + lado2 > lado3) &&
                                (lado2 + lado3 > lado1) &&
                                (lado1 + lado3 > lado2);

        if (!formaTriangulo) {
            System.out.println("Os valores não formam um triângulo.");
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        }

        scanner.close();
    }
}