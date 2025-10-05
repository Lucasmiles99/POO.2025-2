package poo1;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Fase> fases = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarFase(Fase f) {
        fases.add(f);
    }

    public String getNome() {
        return nome;
    }

    public List<Fase> getFases() {
        return fases;
    }

    @Override
    public String toString() {
        return "Curso: " + nome + " (" + fases.size() + " fases)";
    }
}