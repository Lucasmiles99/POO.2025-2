package Item;

public class Item {
    private int codigo;
    private String descricao;

    public Item(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Item [codigo=" + codigo + ", descricao=" + descricao + "]";
    }
}