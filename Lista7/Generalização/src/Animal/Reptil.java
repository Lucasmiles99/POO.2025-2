package Animal;

public class Reptil extends Animal {
    public Reptil(String nome) {
        super(nome);
    }

    public void rastejar() {
        System.out.println(nome + " está rastejando.");
    }
}