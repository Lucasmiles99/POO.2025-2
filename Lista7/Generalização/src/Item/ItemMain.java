package Item;

public class ItemMain {
    public static void main(String[] args) {
        Livro livro = new Livro(1, "Aprendendo Java", "Lucas Miles");
        CD cd = new CD(2, "Album de Rock", "Sony Music", 60.5f, 12, "Banda XYZ", "Rock Hits");
        VHS vhs = new VHS(3, "Filme Antigo", "Warner", 120.0f, "O Clássico");

        System.out.println(livro.toString());
        System.out.println(cd.toString());
        System.out.println(vhs.toString());
    }
}