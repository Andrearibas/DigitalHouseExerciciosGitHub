import java.util.List;

public class ColecaoDeLivros extends Produto {

    private String descricao;
    private List<Livro> colecao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Livro> getColecao() {
        return colecao;
    }

    public void setColecao(List<Livro> colecao) {
        this.colecao = colecao;
    }
}
