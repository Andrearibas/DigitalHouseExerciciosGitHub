public class SuperHomem implements Voador {

    private Integer experiencia;

    @Override
    public void voar() {
        System.out.println("Super Homem diz: Estou voando como um Campeão");

    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }
}
