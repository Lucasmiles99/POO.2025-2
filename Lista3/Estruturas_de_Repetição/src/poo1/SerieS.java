package poo1;

public class SerieS {
    public static void main(String[] args) {
        double soma = 0.0;

        System.out.print("S = ");
        for (int i = 37, d = 1; i >= 1; i--, d++) {
            double termo = (double) (i * (i + 1)) / d;
            soma += termo;

            System.out.print("(" + i + "*" + (i + 1) + ")/" + d);
            if (i > 1) {
                System.out.print(" + ");
            }
        }

        System.out.println("\nResultado da soma: " + soma);
    }
}