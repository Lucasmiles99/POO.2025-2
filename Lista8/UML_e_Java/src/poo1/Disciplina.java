package poo1;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private boolean ofertada;
    private List<Professor> professores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(String nome, boolean ofertada) {
        this.nome = nome;
        this.ofertada = ofertada;
    }

    public void adicionarProfessor(Professor p) {
        if (professores.size() < 4) {
            professores.add(p);
        } else {
            System.out.println("Limite de 4 professores atingido!");
        }
    }

    public void adicionarAluno(Aluno a) {
        alunos.add(a);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + " (ofertada: " + ofertada + ")";
    }
}