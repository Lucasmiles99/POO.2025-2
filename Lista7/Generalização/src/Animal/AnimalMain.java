package Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a1 = new Gato("Frajola");
        Animal a2 = new Cao("Rex");
        Animal a3 = new Tartaruga("Leonardo");
        Animal a4 = new Lagarto("Godzilla");

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        a4.emitirSom();
    }
}