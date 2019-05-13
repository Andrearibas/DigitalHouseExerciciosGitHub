public class TestarVoador {
    public static void main(String[] args) {

        Pato pato = new Pato();
        pato.setEnergia(15);

        Aviao aviao = new Aviao();
        aviao.setHorasDeVoo(20);

        SuperHomem suphomem = new SuperHomem();
        suphomem.setExperiencia(6);

        TorreDeControle torreDeControle = new TorreDeControle();
        torreDeControle.adicionarVoador(pato);
        torreDeControle.adicionarVoador(aviao);
        torreDeControle.adicionarVoador(suphomem);

        torreDeControle.voemTodos();

    }
}
