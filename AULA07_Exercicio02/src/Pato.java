public class Pato implements Voador {

    private Integer energia;


    @Override
    public void voar() {
        System.out.println("Pato diz: Estou voando como um pato");

    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
}
