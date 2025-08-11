package poo;

import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner NUM = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double numero = NUM.nextDouble();
        
        System.out.println("O número informado foi " + numero);
        
        NUM.close();
    }
}
