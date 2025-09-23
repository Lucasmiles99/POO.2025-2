package Item;

public class VHS extends Midia {
    private String titulo;

    public VHS(int codigo, String descricao, String gravadora, float duracao, String titulo) {
        super(codigo, descricao, gravadora, duracao);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "VHS [codigo=" + getCodigo() + ", descricao=" + getDescricao() +
                ", gravadora=" + getGravadora() + ", duracao=" + getDuracao() +
                ", titulo=" + titulo + "]";
    }
}