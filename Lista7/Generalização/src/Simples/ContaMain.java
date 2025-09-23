package Simples;

public class ContaMain {
    public static void main(String[] args) {
        ContaSimples cs = new ContaSimples("Banco A", 101, 12345, 500);
        cs.deposito(200);
        cs.depositoPoupanca(300);
        cs.saquePoupanca(100);

        ContaEspecial ce = new ContaEspecial("Banco B", 202, 54321, 1000, 30, 500);
        ce.saque(1200); 

        System.out.println(cs.toString());
        System.out.println(ce.toString());
    }
}