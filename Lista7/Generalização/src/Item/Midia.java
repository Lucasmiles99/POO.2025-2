package Item;

public class Midia extends Item {
    private String gravadora;
    private float duracao;

    public Midia(int codigo, String descricao, String gravadora, float duracao) {
        super(codigo, descricao);
        this.gravadora = gravadora;
        this.duracao = duracao;
    }

    public String getGravadora() {
        return gravadora;
    }

    public float getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Midia [codigo=" + getCodigo() + ", descricao=" + getDescricao() +
                ", gravadora=" + gravadora + ", duracao=" + duracao + "]";
    }
}