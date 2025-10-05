package poo1;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Engenharia de Software");
        Fase fase1 = new Fase(1);
        curso.adicionarFase(fase1);

        Professor prof1 = new Professor("Wesley dos Reis", "12345678900", "wesley@uni.com", 1, "Mestre");
        Professor prof2 = new Professor("Rodrigo Curvello", "98765432100", "rodrigo@uni.com", 2, "Doutor");

        Disciplina poo = new Disciplina("Programação Orientada a Objetos", true);
        poo.adicionarProfessor(prof1);
        poo.adicionarProfessor(prof2);
        fase1.adicionarDisciplina(poo);

        Aluno aluno = new Aluno("Lucas Pereira", "11122233344", "lucas@aluno.com", 2025001, curso);

        Matricula matricula = new Matricula(aluno, poo);
        matricula.registrarFrequencia(80);
        matricula.definirSituacao("Aprovado");

        System.out.println(aluno);
        System.out.println(matricula);
        System.out.println(poo);
    }
}