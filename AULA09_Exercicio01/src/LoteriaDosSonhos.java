import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LoteriaDosSonhos {

    public static void main(String[] args) {

        Map<Integer, String> loteria = new HashMap<>();
        loteria.put(0,"Ovos");
        loteria.put(1,"Água");
        loteria.put(2,"Escopeta");
        loteria.put(3,"Cavalo");
        loteria.put(4,"Dentista");
        loteria.put(5,"Fogo");


        int max = 5;
        int min = 0;
        Random random = new Random();
        int randomInt = random.nextInt((max - min) + 1) + min;
        System.out.println("Numero Aleatorio: "+randomInt);


        for (Integer chave:loteria.keySet()){
            String descricao = loteria.get(chave);
            System.out.println(chave + " " +descricao);
        }
        System.out.println("Numero da Sorte é: "+randomInt +" - "+loteria.get(randomInt));

    }

}