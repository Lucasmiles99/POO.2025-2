package Animal;

public class Gato extends Mamifero {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }
}