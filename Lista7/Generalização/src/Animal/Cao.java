package Animal;

public class Cao extends Mamifero {
    public Cao(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au Au!");
    }
}