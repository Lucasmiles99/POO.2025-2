package poo1;

public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private double frequencia;
    private String situacao;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.frequencia = 0.0;
        this.situacao = "Cursando";
        disciplina.adicionarAluno(aluno);
    }

    public void registrarFrequencia(double percentual) {
        this.frequencia = percentual;
        if (percentual < 75) {
            this.situacao = "Reprovado por Falta";
        }
    }

    public void definirSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return aluno.getNome() + " em " + disciplina.getNome() +
               " | Frequência: " + frequencia + "% | Situação: " + situacao;
    }
}