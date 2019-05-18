public class Livro extends Produto {


    private String titulo;
    private String autor;
    private int anoLancamento;
    private String cogigoISBN;
    private int quantidadeEstoque;


    @Override
    public String toString() {
        return "Titulo do Livro: "+titulo+"\nCodigo: "+getCodigo()+"\nAutor: "+autor+"\nAno de Lançamento: "+anoLancamento+"\nCodigo ISBN: "+cogigoISBN+"\nQuantidade em estoque: "+quantidadeEstoque+"\nPreço Unid.: R$ "+getPreco();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCogigoISBN() {
        return cogigoISBN;
    }

    public void setCogigoISBN(String cogigoISBN) {
        this.cogigoISBN = cogigoISBN;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
