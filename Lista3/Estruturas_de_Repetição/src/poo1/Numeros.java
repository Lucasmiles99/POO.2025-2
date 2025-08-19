package poo1;

public class Numeros {
    public static void main(String[] args) {

        System.out.println("Números de 1 a 20 (um abaixo do outro):");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println(); 

        System.out.println("Números de 1 a 20 (um ao lado do outro):");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); 
    }
}