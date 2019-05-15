import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {

        try {

            List<String> animal = new ArrayList<>();

            animal.add("Pato");
            animal.add("Cachorro");
            animal.add("Gato");

            System.out.println(animal.get(3));

        } catch (Exception exception){
            System.out.println("Operação inválida");
            System.out.println("Mensagem: "+exception.getMessage());
        }
    }

}



