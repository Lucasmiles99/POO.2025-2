package Pessoa;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
        super(nome, endereco);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public String toString() {
        return "PessoaFisica [nome=" + getNome() + ", endereco=" + getEndereco() +
                ", cpf=" + cpf + ", estadoCivil=" + estadoCivil + "]";
    }
}