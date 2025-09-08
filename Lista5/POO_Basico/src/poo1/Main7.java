package poo1;

public class Main7 {
    public static void main(String[] args) {
        Pessoa2 p1 = new Pessoa2("Lucas", 26, 70.0, 1.61);

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Peso: " + p1.getPeso() + " kg");
        System.out.println("Altura: " + p1.getAltura() + " m");

        p1.envelhecer(); 
        p1.engordar(2);
        p1.emagrecer(1);

        System.out.println("\nApós mudanças:");
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Peso: " + p1.getPeso() + " kg");
        System.out.println("Altura: " + p1.getAltura() + " m");
    }
}