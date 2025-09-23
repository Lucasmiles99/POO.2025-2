package Item;

public class CD extends Midia {
    private int faixas;
    private String artista;
    private String album;

    public CD(int codigo, String descricao, String gravadora, float duracao,
              int faixas, String artista, String album) {
        super(codigo, descricao, gravadora, duracao);
        this.faixas = faixas;
        this.artista = artista;
        this.album = album;
    }

    public int getFaixas() {
        return faixas;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return "CD [codigo=" + getCodigo() + ", descricao=" + getDescricao() +
                ", gravadora=" + getGravadora() + ", duracao=" + getDuracao() +
                ", faixas=" + faixas + ", artista=" + artista + ", album=" + album + "]";
    }
}