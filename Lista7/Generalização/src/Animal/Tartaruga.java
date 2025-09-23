package Animal;

public class Tartaruga extends Reptil {
    public Tartaruga(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: ... (som de tartaruga)");
    }
}