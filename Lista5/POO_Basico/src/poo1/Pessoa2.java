package poo1;

public class Pessoa2 {
    String nome;
    int idade;
    double peso;
    double altura; 

    public Pessoa2(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        idade++;
        if (idade < 21) {
            crescer(0.005); 
        }
    }

    public void engordar(double quilos) {
        peso += quilos;
    }

    public void emagrecer(double quilos) {
        peso -= quilos;
        if (peso < 0) {
            peso = 0; 
        }
    }

    public void crescer(double metros) {
        altura += metros;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}