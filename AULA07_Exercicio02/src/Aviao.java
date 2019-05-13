public class Aviao implements Voador {

    private Integer horasDeVoo;

    @Override
    public void voar() {
        System.out.println("Aviao diz: Estou voando como um Avião");

    }

    public Integer getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(Integer horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }
}
