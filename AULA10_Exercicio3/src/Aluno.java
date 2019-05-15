public class Aluno {

    private String nome;
    private Integer numerdoDoAluno;

    public Aluno(String nome, Integer numerdoDoAluno) {
        this.nome = nome;
        this.numerdoDoAluno = numerdoDoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumerdoDoAluno() {
        return numerdoDoAluno;
    }

    public void setNumerdoDoAluno(Integer numerdoDoAluno) {
        this.numerdoDoAluno = numerdoDoAluno;
    }
}
