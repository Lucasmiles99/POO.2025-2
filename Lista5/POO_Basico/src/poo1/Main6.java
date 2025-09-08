package poo1;

public class Main6 {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(5.0); 

        System.out.println("Lado do quadrado: " + q1.getLado());
        System.out.println("Área do quadrado: " + q1.calcularArea());

        q1.setLado(8.0);
        System.out.println("\nNovo lado do quadrado: " + q1.getLado());
        System.out.println("Nova área do quadrado: " + q1.calcularArea());
    }
}