package poo1;

import java.util.ArrayList;
import java.util.List;

public class Fase {
    private int numero;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Fase(int numero) {
        this.numero = numero;
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public int getNumero() {
        return numero;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return "Fase " + numero;
    }
}