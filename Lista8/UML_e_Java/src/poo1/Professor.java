package poo1;

public class Professor extends Pessoa {
    private int id;
    private String titulacao;

    public Professor(String nome, String cpf, String email, int id, String titulacao) {
        super(nome, cpf, email);
        this.id = id;
        this.titulacao = titulacao;
    }

    public int getId() {
        return id;
    }

    public String getTitulacao() {
        return titulacao;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + " (" + titulacao + ")";
    }
}