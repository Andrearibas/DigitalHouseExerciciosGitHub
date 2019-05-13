import java.util.Objects;

public class Pessoa {

    private String nome;
    private Integer rg;

    @Override
    public boolean equals(Object Pessoa) {
        if (this == Pessoa){
            return true;
        }else if (Pessoa == null){
            return false;
        }else if (Pessoa.getClass() != this.getClass()){
            return false;
        } Pessoa pess = (Pessoa) Pessoa;
        return Objects.equals(this.rg, pess.rg);

    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getRg());
    }

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }
}
