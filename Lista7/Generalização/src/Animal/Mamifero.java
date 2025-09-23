package Animal;

public class Mamifero extends Animal {
    public Mamifero(String nome) {
        super(nome);
    }

    public void amamentar() {
        System.out.println(nome + " está amamentando.");
    }
}