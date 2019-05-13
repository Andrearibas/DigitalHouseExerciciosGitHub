import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    private List<Voador> voadores = new ArrayList<>();

    public void voemTodos(){
        for (Voador voador : voadores) {
            voador.voar();
        }

    }

    public void adicionarVoador(Voador umVoador){
        voadores.add(umVoador);
    }
}
