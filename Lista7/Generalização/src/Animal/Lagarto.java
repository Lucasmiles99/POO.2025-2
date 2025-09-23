package Animal;

public class Lagarto extends Reptil {
    public Lagarto(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Tsssss!");
    }
}