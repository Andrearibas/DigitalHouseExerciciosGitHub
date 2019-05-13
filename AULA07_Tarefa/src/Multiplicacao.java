public class Multiplicacao implements OperacaoMatematica {

    private int numeroA;
    private int numeroB;
    private int resultadoMultiplicacao = numeroA * numeroB;

    @Override
    public void imprimir() {
        System.out.println("O resultado da Multiplicação é: "+resultadoMultiplicacao);

    }

    public int getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    public int getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;

    }
}
