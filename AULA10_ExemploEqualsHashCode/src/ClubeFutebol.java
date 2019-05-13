import java.util.Objects;

public class ClubeFutebol {

    private String nome;
    private int quantidadeTorcedor;
    private String cidade;

    @Override
    public String toString(){
        return "Nome do clube: "+nome+ "\n Cidade: "+cidade + "\n Quantidade de Torcedores: "+quantidadeTorcedor;

    }

    @Override
    public boolean equals(Object clubeFutebol){
        if (this == clubeFutebol){ //são o mesmo objeto em memoria
            return true;
        }else if (clubeFutebol == null){ //se o parametro clubeFutebol é nulo
            return false;
        }else if (clubeFutebol.getClass() != this.getClass()){
            return false;

        } ClubeFutebol clube = (ClubeFutebol) clubeFutebol;
        return Objects.equals(this.nome, clube.nome) &&
                Objects.equals(this.cidade, clube.cidade);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, cidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeTorcedor() {
        return quantidadeTorcedor;
    }

    public void setQuantidadeTorcedor(int quantidadeTorcedor) {
        this.quantidadeTorcedor = quantidadeTorcedor;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
