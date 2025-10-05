package poo1;

public class Aluno extends Pessoa {
    private int matricula;
    private Curso curso;

    public Aluno(String nome, String cpf, String email, int matricula, Curso curso) {
        super(nome, cpf, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Matrícula: " + matricula + " | Curso: " + curso.getNome();
    }
}