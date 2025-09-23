package Pessoa;

public class PessoaMain {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Lucas", "Rua A, 123", "123.456.789-00", "Solteiro");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "Av. Central, 500", "12.345.678/0001-99", "Comércio");

        System.out.println(pf.toString());
        System.out.println(pj.toString());
    }
}